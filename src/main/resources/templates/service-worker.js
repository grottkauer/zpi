self.addEventListener('install', event => {
    // 1. Specjalna metoda SW która czeka na poprawną instalację by przejsc do kolejnych kroków
    event.waitUntil(
        // 2. Tworzysz cache o nazwie 'v1' w którym będą przechowywane konkretne zasoby
        caches.open('v1').then(cache => {
            return cache.addAll([
                // 3. Tworzysz listę plików które mają byc tym cache podaj pośrednie linki tak jak w przykładzie
                '/',
                '/resources/static/css/master.css'
            ]);
        }, error => {
            // 4. W razie błędów
            console.log(`Installation failed with error: ${error}`);
        })
    );
});

self.addEventListener('activate', event => {
    let cacheKeepList = ['v1'];

    event.waitUntil(
        caches.keys().then( keyList => {
            return Promise.all(keyList.map(function(key) {
                if (cacheKeepList.indexOf(key) === -1) {
                    return caches.delete(key);
                }
            }));
        })
    );
});

self.addEventListener('fetch', event => {
    if (event.request.method != 'GET') return;

    event.respondWith(async function() {
        const cache = await caches.open('v1');
        const cachedResponse = await cache.match(event.request);

        if (cachedResponse) {
            event.waitUntil(cache.add(event.request));
            return cachedResponse;
        }

        return fetch(event.request);
    }());
});