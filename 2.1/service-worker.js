var cacheName = 'gwt-material-demo-v1';
var filesToCache = [
    '/',
    'index.html',
    'manifest.json',
    'service-worker.js',
    'gwtmaterialdemo/gwtmaterialdemo.nocache.js',
    'gwtmaterialdemo/css/overridecss.css',
    'gwtmaterialdemo/css/animation.css',
    'gwtmaterialdemo/css/material-icons.css',
    'gwtmaterialdemo/css/materialize.min.css',
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
