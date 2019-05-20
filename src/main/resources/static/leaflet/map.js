var mymap = L.map('mapid').setView([51.109, 17.0333300], 13);
var marker;

	L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoibWFwYm94IiwiYSI6ImNpejY4NXVycTA2emYycXBndHRqcmZ3N3gifQ.rJcFIG214AriISLbB6B5aw', {
		maxZoom: 18,
		attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors, ' +
			'<a href="https://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, ' +
			'Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
		id: 'mapbox.streets'
	}).addTo(mymap);

	marker = L.marker([51.109, 17.0333300]).addTo(mymap);
	marker.bindPopup("Wrocław").openPopup();

	var popup = L.popup();

	function onMapClick(e) {
	$.getJSON('https://nominatim.openstreetmap.org/reverse?format=json&lat=' + e.latlng.lat + '&lon=' + e.latlng.lng, function(data) {

                name = data.display_name;

                if (name == "") {
                    name = "Błąd";
                }
            });

            $('#addr').val(name);

            marker.setLatLng(e.latlng)
            		.bindPopup(name).openPopup();

	}

	mymap.on('click', onMapClick);

	function chooseAddr(lat1, lng1, lat2, lng2, display_name, osm_type) {
    	marker.setLatLng(new L.LatLng((lat1+lat2)/2,(lng1+lng2)/2))
                    		.bindPopup(display_name).openPopup();

        $('#addr').val(display_name);
    }

    function addr_search() {
        var inp = document.getElementById("addr");

        $.getJSON('https://nominatim.openstreetmap.org/search?format=json&limit=7&q=' + inp.value, function(data) {
            var items = [];

            $.each(data, function(key, val) {
                bb = val.boundingbox;
                items.push("<li><a href='#' onclick='chooseAddr(" + bb[0] + ", " + bb[2] + ", " + bb[1] + ", " + bb[3] + ", \"" + val.display_name + "\", \"" + val.osm_type + "\");return false;'>" + val.display_name + '</a></li>');
            });

    		$('#results').empty();
            if (items.length != 0) {
                $('<ul/>', {
                    'class': 'my-new-list',
                    html: items.join('')
                }).appendTo('#results');
            } else {
                $('<p>', { html: "Nie znaleziono wyniku dla zapytania" }).appendTo('#results');
            }
        });
    }