var cacheName = 'bm-page';

const offlineUrl = '/error/500.html'

   var filesToCache = [
     '/service-worker.js',
     '/',
     '/zaloguj',
     '/kontakt', '/error', '/colorlib-error-404-12/css/style.css', '/colorlib-error-404-12/img/emoji.png',
     '/startbootstrap-agency-gh-pages/vendor/bootstrap/css/bootstrap.min.css',
     '/startbootstrap-agency-gh-pages/vendor/fontawesome-free/css/all.min.css',
     '/startbootstrap-agency-gh-pages/css/agency.min.css',
     '/daterangepicker-master/moment.min.js',
     '/daterangepicker-master/daterangepicker.js',
     '/daterangepicker-master/daterangepicker.css',
     '/css/master.css',
     '/css/signin.css',
     '/startbootstrap-agency-gh-pages/vendor/jquery/jquery.min.js',
     '/startbootstrap-agency-gh-pages/vendor/bootstrap/js/bootstrap.bundle.min.js',
     '/startbootstrap-agency-gh-pages/vendor/jquery-easing/jquery.easing.min.js',
     '/startbootstrap-agency-gh-pages/js/jqBootstrapValidation.js',
     '/startbootstrap-agency-gh-pages/js/contact_me.js',
     '/startbootstrap-agency-gh-pages/js/agency.min.js',
     '/manifest.json',
     '/images/screenshots/history1.png',
     '/images/screenshots/history2.png',
     '/images/screenshots/history3.png',
     '/images/screenshots/history4.png',
     '/images/screenshots/history5.jpg',
     '/images/screenshots/history6.jpeg',
     '/screens/js/active.js',
     '/startbootstrap-agency-gh-pages/img/team/ola.jpg',
     '/startbootstrap-agency-gh-pages/img/team/natalia.jpg',
     '/startbootstrap-agency-gh-pages/img/team/janek.jpg',
     '/images/logos/logo-pwr.png',
     '/images/logos/iz.jpg',
     '/images/backgrounds/bg-panel.jpg',
     '/images/screenshots/screen1.png',
     '/images/screenshots/screen2.png',
     '/images/screenshots/screen3.png',
     '/images/screenshots/screen4.png',
     '/images/screenshots/screen5.png',
     '/images/screenshots/screen6.png',
     '/images/screenshots/screen7.png',
     '/images/screenshots/screen8.png',
     '/images/screenshots/screen9.png',
     '/images/screenshots/screen10.png',
     '/images/screenshots/screen11.png',
     '/images/screenshots/screen12.png',
     '/images/screenshots/screen13.png',
     '/images/screenshots/screen14.png',
     '/images/screenshots/screen15.png',
     '/images/logos/ajax.jpg',
     '/images/logos/bootstrap.png',
     '/images/logos/css3-logo.png',
     '/images/logos/html.png',
     '/images/logos/javascript-logo.png',
     '/images/logos/jquery-logo.jpg',
     '/images/logos/spring-boot-logo.png',
     '/images/logos/sql.png',
     '/images/logos/uml_logo.png',
     '/startbootstrap-agency-gh-pages/vendor/fontawesome-free/webfonts/fa-solid-900.woff2',
     '/startbootstrap-agency-gh-pages/vendor/fontawesome-free/webfonts/fa-brands-400.woff2',
     '/startbootstrap-agency-gh-pages/vendor/fontawesome-free/webfonts/fa-solid-900.woff',
     '/startbootstrap-agency-gh-pages/vendor/fontawesome-free/webfonts/fa-brands-400.woff',
     '/startbootstrap-agency-gh-pages/vendor/fontawesome-free/webfonts/fa-solid-900.ttf',
     '/images/icons/144.png',
     '/images/icons/32.png',
     '/startbootstrap-agency-gh-pages/img/map-image.png',
     '/datepicker-popup/js/pignose.calendar.full.min.js',
     '/datepicker-popup/js/script.js',
     '/images/backgrounds/login-bg.jpg'
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
   self.addEventListener('activate',  event => {
     event.waitUntil(self.clients.claim());
   });
   self.addEventListener('fetch', function(event) {
     event.respondWith(
       // Try the cache
       caches.match(event.request).then(function(response) {
         // Fall back to network
         return response || fetch(event.request);
       }).catch(function() {
         // If both fail, show a generic fallback:
         return caches.match('/error');
         // However, in reality you'd have many different
         // fallbacks, depending on URL & headers.
         // Eg, a fallback silhouette image for avatars.
       })
     );
   });