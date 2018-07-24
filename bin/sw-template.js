var cacheName = '{{cacheName}}';

var filesToCache = [  {{#each filesToCache}}
'{{.}}'{{#unless @last}},{{/unless}}
    {{/each}}
    ,'service-worker.js'
];

/**
 * The install event is your chance to cache everything you need before being able to control clients. The promise you
 * pass to event.waitUntil() lets the browser know when your install completes, and if it was successful.
 */
self.addEventListener('install', function (e) {
    console.log('[ServiceWorker] Install');
    e.waitUntil(
        caches.open(cacheName).then(function (cache) {
            console.log('[ServiceWorker] Caching app shell');
            return cache.addAll(filesToCache);
        })
    );
});

/**
 * Once your service worker is ready to control clients and handle functional events like push and sync, you'll get an
 * activate event. But that doesn't mean the page that called .register() will be controlled.
 */
self.addEventListener('activate', function (e) {
    console.log('[ServiceWorker] Activate');
    e.waitUntil(
        caches.keys().then(function (keyList) {
            return Promise.all(keyList.map(function (key) {
                console.log('[ServiceWorker] Removing old cache', key);
                if (key !== cacheName) {
                    return caches.delete(key);
                }
            }));
        })
    );
});

/**
 * It contains information about the fetch, including the request and how the receiver will treat the response.
 * It provides the event.respondWith() method, which allows us to provide a response to this fetch.
 */
self.addEventListener('fetch', function (e) {
    console.log('[ServiceWorker] Fetch', e.request.url);
    e.respondWith(
        caches.match(e.request).then(function (response) {
            return response || fetch(e.request);
        })
    );
});

/**
 * Will listen to any push event comming from native push or fcm push services.
 * This will also provide you a Notification UI build from the JSON Payload provided before sending the message.
 */
self.addEventListener('push', function (event) {
    console.log("Service Worker Push Received");
    var json = event.data.json();
    // The Notification Data which contains all required parameters to display a notification ui.
    var data = JSON.parse(json.data.model);
    var title = data.title;

    const options = {
        body: data.body,
        icon: data.icon,
        image: data.image,
        badge: data.badge,
        vibrate: data.vibrate,
        sound: data.sound,
        actions: data.actions,
        dir: data.dir,
        tag: data.tag,
        data: data.payload,
        requireInteraction: data.requireInteraction,
        renotify: data.renotify,
        silent: data.silent,
        timestamp: data.timestamp
    }

    event.waitUntil(self.registration.showNotification(title, options));
});

/**
 * When a user clicks on a notification they usually expect to be taken directly to where they can get more
 * information about the notification. We also add a functionality wherein we will check if the data.url is
 * available then we will redirect the user to that url else we will just close the notification.
 */
self.addEventListener('notificationclick', function (event) {
    var notification = event.notification;
    var data = event.notification.data;
    var action = event.action;

    if (action === 'close') {
        notification.close();
    }
    // Define your action callbacks below.
});

/**
 * If the user dismisses the notification through a direct action on the notification
 * (such as a swipe in Android), it raises a notificationclose event inside the service worker.
 *
 * Note: If the user dismisses all notifications then, to save resources, an event
 * is not raised in the service worker.
 */
self.addEventListener('notificationclose', function (event) {
    // For now we dont have any useful usecase to define
    // atm when notification was closed.
});

/**
 * This is a listener for the service-worker.js to listen to any Client messages.
 */
self.addEventListener('message', function (event) {
    var data = event.data;
    if (data == 'skipWaiting') {
        self.skipWaiting();
    }
    // Define any custom messaging below by calling sendMessageToAllClients(message).
});

/**
 * This function will allow to send a messa2ge to specific client.
 * If you want to send to all opened client instances call  #sendMessageToAllClients
 */
function sendMessageToClient(client, message) {
    return new Promise(function (resolve, reject) {
        var messageChannel = new MessageChannel();

        messageChannel.port1.onmessage = function (event) {
            if (event.data.error) {
                reject(event.data.error);
            } else {
                resolve(event.data);
            }
        };

        client.postMessage(message, [messageChannel.port2]);
    });
}

/**
 * This function will allow the service-worker.js to send a message to any opened client's channel
 * (Take not that each client will be referenced to any opened browser / tab instances.
 */
function sendMessageToAllClients(message) {
    clients.matchAll().then(clients => {
        clients.forEach(client => {
            sendMessageToClient(client, message);
        })
    })
}