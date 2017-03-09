var cacheName = 'pwa';
var filesToCache = [
    'index.html',
    'manifest.json',
    'service-worker.js',
    'gwtmaterialdemo/gwtmaterialdemo.nocache.js',
    'gwtmaterialdemo/css/overridecss.css',
    'gwtmaterialdemo/css/animation.css',
    'gwtmaterialdemo/css/material-icons.css',
    'gwtmaterialdemo/css/materialize.min.css',
    'http://127.0.0.1:9876/gwtmaterialdemo/DC647EC9EC7418315821F533440AC11C.cache.js'
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