var cacheName = 'gwt-material-demo-v12';
var filesToCache = [
    'index.html',
    'manifest.json',
    'service-worker.js',
    'gwtmaterialdemo/gwtmaterialdemo.nocache.js',
    'gwtmaterialdemo/css/overridecss.css',
    'gwtmaterialdemo/css/animation.css',
    'gwtmaterialdemo/css/material-icons.css',
    'gwtmaterialdemo/css/materialize.min.css',
    'gwtmaterialdemo/font/roboto/Roboto-Bold.woff2',
    'gwtmaterialdemo/font/roboto/Roboto-Bold.woff',
    'gwtmaterialdemo/font/roboto/Roboto-Bold.ttf',
    'image/launcher-icon-1x.png',
    'image/launcher-icon-2x.png',
    'image/launcher-icon-4x.png'
];

self.addEventListener('install', function(e) {
    console.log('[ServiceWorker] Install');
    e.waitUntil(
        caches.open(cacheName).then(function(cache) {
            console.log('[ServiceWorker] Caching app shell');
            return cache.addAll(filesToCache);
        })
    );
});


self.addEventListener('activate', function(e) {
    console.log('[ServiceWorker] Activate');
    e.waitUntil(
        caches.keys().then(function(keyList) {
            return Promise.all(keyList.map(function(key) {
                console.log('[ServiceWorker] Removing old cache', key);
                if (key !== cacheName) {
                    return caches.delete(key);
                }
            }));
        })
    );
});

self.addEventListener('fetch', function(e) {
    console.log('[ServiceWorker] Fetch', e.request.url);
    e.respondWith(
        caches.match(e.request).then(function(response) {
            return response || fetch(e.request);
        })
    );
});

self.addEventListener('message', function(e) {
    if (e.data == 'skipWaiting') {
        self.skipWaiting();
    }
});