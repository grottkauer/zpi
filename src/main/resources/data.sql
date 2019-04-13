-- todo add current date in used type of sql
-- MAIN CATEGORIES
INSERT INTO resource_type(resource_typeid, name) VALUES (1, 'Książki');
INSERT INTO resource_type(resource_typeid, name) VALUES (2, 'Muzyka');
INSERT INTO resource_type(resource_typeid, name) VALUES (3, 'Filmy');
INSERT INTO resource_type(resource_typeid, name) VALUES (4, 'Zabawki');
INSERT INTO resource_type(resource_typeid, name) VALUES (5, 'Gry i programy');
INSERT INTO resource_type(resource_typeid, name) VALUES (6, 'Artykuły kolekcjonerskie');
INSERT INTO resource_type(resource_typeid, name) VALUES (7, 'Czasopisma');

-- SUBCATEGORIES

-- BOOKS
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (8, 'Biograficzne', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (9, 'Ekonomiczne', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (10, 'Dla dzieci', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (11, 'Dla młodzieży', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (12, 'Fantasy', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (13, 'Horrory', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (14, 'Historyczne', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (15, 'Informatyczne', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (16, 'Komiksy', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (17, 'Kryminały', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (18, 'Sensacyjne', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (19, 'Thrillery', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (20, 'Regionalne', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (21, 'Kucharskie', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (22, 'Lektury', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (23, 'Literatura faktu', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (24, 'Obyczajowe', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (25, 'Literatura piękna', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (26, 'Językowe', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (27, 'Obcojęzyczne', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (28, 'Podręczniki szkolne', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (29, 'Poezja', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (30, 'Poradniki', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (31, 'Prawnicze', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (32, 'Religijne', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (33, 'Rozwój osobisty', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (34, 'Sportowe', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (35, 'Sztuka', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (36, 'Podróżnicze', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (37, 'Przewodniki', 1);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (38, 'Zdrowie', 1);

-- MUSIC
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (39, 'Alternatywna', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (40, 'Biesiadna', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (41, 'Heavy metal', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (42, 'Country', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (43, 'Dance', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (44, 'Disco', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (45, 'Dla dzieci', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (46, 'Folk', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (47, 'Jazz', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (48, 'Blues', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (49, 'Kabaretowa', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (50, 'Filmowa', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (51, 'Poważna', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (52, 'Relaksacyjna', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (53, 'Religijna', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (54, 'Pop', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (55, 'Rock', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (56, 'Hip Hop/Rap', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (57, 'Reggae', 2);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (58, 'Szanty', 2);

-- FILMS
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (59, 'Bajki', 3);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (60, 'Fantasy', 3);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (61, 'Sci-fi', 3);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (62, 'Horror', 3);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (63, 'Thriller', 3);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (64, 'Komedie', 3);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (65, 'Obyczajowe', 3);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (66, 'Westerny', 3);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (67, 'Kino akcji', 3);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (68, 'Seriale', 3);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (69, 'Wojenne', 3);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (70, 'Inne', 3);

-- TOYS
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (71, 'Klocki', 4);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (72, 'Do nauki', 4);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (73, 'Lalki', 4);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (74, 'Figurki', 4);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (75, 'Puzzle', 4);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (76, 'Pojazdy', 4);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (77, 'Pluszaki', 4);

-- TOYS - Brick
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (78, 'Lego', 71);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (79, 'Plastikowe', 71);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (80, 'Drewniane', 71);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (81, 'Inne', 71);

-- TOYS - Education
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (82, 'Interaktywne', 72);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (83, 'Mały naukowiec', 72);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (84, 'Pisanie i czytanie', 72);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (85, 'Inne', 72);

-- TOYS - Doll
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (86, 'Akcesoria', 73);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (87, 'Bobasy', 73);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (88, 'Celebrytki', 73);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (89, 'Interaktywne', 73);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (90, 'Szmaciane', 73);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (91, 'Bajkowe', 73);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (92, 'Mini lalki', 73);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (93, 'Inne', 73);

-- TOYS - Figurine
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (94, 'Akcesoria', 74);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (95, 'Akcji', 74);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (96, 'Kolekcjonerskie', 74);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (97, 'Bajkowe', 74);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (98, 'Zwierzęta', 74);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (99, 'Inne', 74);

-- TOYS - Puzzle
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (100, 'Akcesoria', 75);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (101, '3D i 4D', 75);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (102, 'Drewniane', 75);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (103, 'Podłogowe', 75);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (104, 'Tradycyjne', 75);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (105, 'Układanki klockowe', 75);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (106, 'Inne', 75);

-- TOYS - Vehicles
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (107, 'Akcesoria', 76);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (108, 'Kolejki', 76);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (109, 'Modele do sklejania', 76);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (110, 'Budowlane', 76);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (111, 'Ratunkowe', 76);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (112, 'Rolnicze', 76);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (113, 'Zdalnie sterowane', 76);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (114, 'Samochody', 76);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (115, 'Samoloty', 76);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (116, 'Statki', 76);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (117, 'Inne', 76);

-- TOYS - Plushy
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (118, 'Interakctywne', 77);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (119, 'Kukiełki i pacynki', 77);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (120, 'Maskotki', 77);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (121, 'Inne', 77);

-- GAMES AND PROGRAMS
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (122, 'Cyfrowe', 5);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (123, 'Planszowe', 5);

-- GAMES - Cipher
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (124, 'Gry', 123);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (125, 'Programy', 123);

-- GAMES - Cipher - games
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (126, 'Akcja i strzelanki', 124);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (127, 'Dla dzieci', 124);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (128, 'Logiczne', 124);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (129, 'MMO i sieciowe', 124);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (130, 'Przygodowe', 124);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (131, 'RPG', 124);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (132, 'Sportowe', 124);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (133, 'Strategiczne', 124);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (134, 'Symulatory', 124);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (135, 'Zręcznościowe', 124);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (136, 'Wyścigowe', 124);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (137, 'Inne', 124);

-- GAMES - Cipher - programs
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (138, 'Nauka języków', 125);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (139, 'Programowanie', 125);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (140, 'Grafika', 125);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (141, 'Zarządzanie firmą', 125);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (142, 'E-commence', 125);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (143, 'Inne', 125);

-- GAMES - board
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (144, 'Army painter', 123);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (145, 'Edukacyjne', 123);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (146, 'Ekonomiczne', 123);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (147, 'Familijne', 123);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (148, 'Fantasy', 123);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (149, 'Logiczne', 123);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (150, 'Łamigłówki', 123);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (151, 'Przygodowe', 123);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (152, 'Strategiczne', 123);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (153, 'Inne', 123);

-- todo COLLECTIONS
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (154, 'Inne', 6);

-- NEWSPAPERS
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (155, 'Polityka', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (156, 'Architektura', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (157, 'Dla dzieci i młodzieży', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (158, 'Ekonomia', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (159, 'Hobby', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (160, 'IT', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (161, 'Kultura i sztuka', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (162, 'Motoryzacja', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (163, 'Specjalistyczne', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (164, 'Turystyka', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (165, 'Popularnonaukowe', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (166, 'Rozrywka', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (167, 'Sport', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (168, 'Historyczne', 7);
INSERT INTO resource_type(resource_typeid, name, higher_levelid) VALUES (169, 'Życie rodzinne', 7);



INSERT INTO resources(id, points, weight, name, resource_typeid)
    VALUES (1, 3, 0.5, 'pierwszy resource', 1);
INSERT INTO resources(id, points, weight, name, resource_typeid) VALUES (2, 3, 0.5, 'drugi resource', 1);
INSERT INTO resources(id, points, weight, name, resource_typeid) VALUES (3, 3, 0.5, 'trzeci resource', 1);

INSERT INTO users(id, login, password, ethereum_address ,ethereum_key, email, last_name, first_name, join_date, birth_date, recall_date, adres_id)
VALUES  (1, 'jan', 'kowalski','0xb058ce0a76c7F87a08d75E2699C53AE62B0817C4','af2b6729ab77cddfd86ee4f39231353bd142e2a5ab561098ae892269d24d1624','jan@kowalski.com','kowalski','jan', '2019-03-15','1980-06-29','2020-03-15',NULL ),
        (2, 'zbigniew', 'nowak','0x3e673F7F53e2B04e77aE7E6C3b995A536ACa7Bf6','dc5ac2f7f3a70f00bec0b02e6d98930c3aad5539c7b36d1857b4ccfcf42653ba','znigniew@nowak.com','nowak','zbigniew', '2019-03-15','1980-06-29','2020-03-15',NULL );
