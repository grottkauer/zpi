-- todo add current date in used type of sql
-- MAIN CATEGORIES
INSERT INTO resource_type(id_resource_type, name) VALUES (1, 'Książki');
INSERT INTO resource_type(id_resource_type, name) VALUES (2, 'Muzyka');
INSERT INTO resource_type(id_resource_type, name) VALUES (3, 'Filmy');
INSERT INTO resource_type(id_resource_type, name) VALUES (4, 'Zabawki');
INSERT INTO resource_type(id_resource_type, name) VALUES (5, 'Gry i programy');
INSERT INTO resource_type(id_resource_type, name) VALUES (6, 'Artykuły kolekcjonerskie');
INSERT INTO resource_type(id_resource_type, name) VALUES (7, 'Czasopisma');

-- SUBCATEGORIES

-- BOOKS
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (8, 'Biograficzne', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (9, 'Ekonomiczne', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (10, 'Dla dzieci', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (11, 'Dla młodzieży', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (12, 'Fantasy', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (13, 'Horrory', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (14, 'Historyczne', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (15, 'Informatyczne', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (16, 'Komiksy', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (17, 'Kryminały', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (18, 'Sensacyjne', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (19, 'Thrillery', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (20, 'Regionalne', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (21, 'Kucharskie', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (22, 'Lektury', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (23, 'Literatura faktu', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (24, 'Obyczajowe', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (25, 'Literatura piękna', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (26, 'Językowe', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (27, 'Obcojęzyczne', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (28, 'Podręczniki szkolne', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (29, 'Poezja', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (30, 'Poradniki', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (31, 'Prawnicze', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (32, 'Religijne', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (33, 'Rozwój osobisty', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (34, 'Sportowe', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (35, 'Sztuka', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (36, 'Podróżnicze', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (37, 'Przewodniki', 1);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (38, 'Zdrowie', 1);

-- MUSIC
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (39, 'Alternatywna', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (40, 'Biesiadna', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (41, 'Heavy metal', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (42, 'Country', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (43, 'Dance', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (44, 'Disco', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (45, 'Dla dzieci', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (46, 'Folk', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (47, 'Jazz', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (48, 'Blues', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (49, 'Kabaretowa', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (50, 'Filmowa', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (51, 'Poważna', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (52, 'Relaksacyjna', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (53, 'Religijna', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (54, 'Pop', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (55, 'Rock', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (56, 'Hip Hop/Rap', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (57, 'Reggae', 2);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (58, 'Szanty', 2);

-- FILMS
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (59, 'Bajki', 3);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (60, 'Fantasy', 3);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (61, 'Sci-fi', 3);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (62, 'Horror', 3);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (63, 'Thriller', 3);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (64, 'Komedie', 3);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (65, 'Obyczajowe', 3);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (66, 'Westerny', 3);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (67, 'Kino akcji', 3);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (68, 'Seriale', 3);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (69, 'Wojenne', 3);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (70, 'Inne', 3);

-- TOYS
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (71, 'Klocki', 4);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (72, 'Do nauki', 4);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (73, 'Lalki', 4);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (74, 'Figurki', 4);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (75, 'Puzzle', 4);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (76, 'Pojazdy', 4);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (77, 'Pluszaki', 4);

-- TOYS - Brick
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (78, 'Lego', 71);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (79, 'Plastikowe', 71);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (80, 'Drewniane', 71);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (81, 'Inne', 71);

-- TOYS - Education
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (82, 'Interaktywne', 72);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (83, 'Mały naukowiec', 72);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (84, 'Pisanie i czytanie', 72);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (85, 'Inne', 72);

-- TOYS - Doll
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (86, 'Akcesoria', 73);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (87, 'Bobasy', 73);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (88, 'Celebrytki', 73);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (89, 'Interaktywne', 73);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (90, 'Szmaciane', 73);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (91, 'Bajkowe', 73);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (92, 'Mini lalki', 73);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (93, 'Inne', 73);

-- TOYS - Figurine
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (94, 'Akcesoria', 74);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (95, 'Akcji', 74);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (96, 'Kolekcjonerskie', 74);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (97, 'Bajkowe', 74);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (98, 'Zwierzęta', 74);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (99, 'Inne', 74);

-- TOYS - Puzzle
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (100, 'Akcesoria', 75);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (101, '3D i 4D', 75);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (102, 'Drewniane', 75);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (103, 'Podłogowe', 75);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (104, 'Tradycyjne', 75);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (105, 'Układanki klockowe', 75);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (106, 'Inne', 75);

-- TOYS - Vehicles
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (107, 'Akcesoria', 76);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (108, 'Kolejki', 76);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (109, 'Modele do sklejania', 76);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (110, 'Budowlane', 76);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (111, 'Ratunkowe', 76);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (112, 'Rolnicze', 76);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (113, 'Zdalnie sterowane', 76);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (114, 'Samochody', 76);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (115, 'Samoloty', 76);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (116, 'Statki', 76);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (117, 'Inne', 76);

-- TOYS - Plushy
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (118, 'Interakctywne', 77);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (119, 'Kukiełki i pacynki', 77);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (120, 'Maskotki', 77);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (121, 'Inne', 77);

-- GAMES AND PROGRAMS
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (122, 'Cyfrowe', 5);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (123, 'Planszowe', 5);

-- GAMES - Cipher
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (124, 'Gry', 122);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (125, 'Programy', 122);

-- GAMES - Cipher - games
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (126, 'Akcja i strzelanki', 124);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (127, 'Dla dzieci', 124);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (128, 'Logiczne', 124);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (129, 'MMO i sieciowe', 124);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (130, 'Przygodowe', 124);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (131, 'RPG', 124);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (132, 'Sportowe', 124);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (133, 'Strategiczne', 124);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (134, 'Symulatory', 124);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (135, 'Zręcznościowe', 124);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (136, 'Wyścigowe', 124);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (137, 'Inne', 124);

-- GAMES - Cipher - programs
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (138, 'Nauka języków', 125);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (139, 'Programowanie', 125);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (140, 'Grafika', 125);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (141, 'Zarządzanie firmą', 125);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (142, 'E-commence', 125);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (143, 'Inne', 125);

-- GAMES - board
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (144, 'Army painter', 123);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (145, 'Edukacyjne', 123);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (146, 'Ekonomiczne', 123);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (147, 'Familijne', 123);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (148, 'Fantasy', 123);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (149, 'Logiczne', 123);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (150, 'Łamigłówki', 123);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (151, 'Przygodowe', 123);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (152, 'Strategiczne', 123);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (153, 'Towarzyskie', 123);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (154, 'Inne', 123);

-- NEWSPAPERS
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (155, 'Polityka', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (156, 'Architektura', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (157, 'Dla dzieci i młodzieży', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (158, 'Ekonomia', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (159, 'Hobby', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (160, 'IT', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (161, 'Kultura i sztuka', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (162, 'Motoryzacja', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (163, 'Specjalistyczne', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (164, 'Turystyka', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (165, 'Popularnonaukowe', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (166, 'Rozrywka', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (167, 'Sport', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (168, 'Historyczne', 7);
INSERT INTO resource_type(id_resource_type, name, id_resource_type_higher_level) VALUES (169, 'Życie rodzinne', 7);


INSERT INTO user(id, password, ethereum_address ,ethereum_key, email, last_name, first_name, join_date, birth_date, recall_date, id_address)
VALUES  (1, 'kowalski','0xb058ce0a76c7F87a08d75E2699C53AE62B0817C4','af2b6729ab77cddfd86ee4f39231353bd142e2a5ab561098ae892269d24d1624','jan@kowalski.com','kowalski','jan', '2019-03-15','1980-06-29','2020-03-15',NULL ),
        (2, 'nowak','0x3e673F7F53e2B04e77aE7E6C3b995A536ACa7Bf6','dc5ac2f7f3a70f00bec0b02e6d98930c3aad5539c7b36d1857b4ccfcf42653ba','znigniew@nowak.com','nowak','zbigniew', '2019-03-15','1980-06-29','2020-03-15',NULL );


--some test data for natalia@wp.pl
insert into ADDRESS(id, locality, nr_flat, nr_house, street, zip_code) values (1, 'Kotałkowo', '4', '12', 'Zwierzęca', '12-345');
INSERT INTO user(id, password, ethereum_address ,ethereum_key, email, last_name, first_name, join_date, birth_date, recall_date, id_address)
    VALUES (3, 'kotelki', 'jakistamadres', 'jakistamklucz', 'natalia@wp.pl', 'Koty', 'Halo', '2019-03-28', '1997-08-02', NULL, 1);
insert into RESOURCE(id, name, description, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted) values (1, 'Talisman', 'Fajna', 2000, 151, 3, '2019-05-15', true, false);
insert into RESOURCE(id, name, description, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted) values (2, 'Dobble', 'Zabawa jak się patrzy', 54, 153, 3, '2019-05-15', false, false);
insert into RESOURCE(id, name, description, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted) values (3, 'Tajniacy', 'Szpieg', 12, 153, 3, '2019-05-15', false, false);
insert into RESOURCE(id, name, description, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted) values (4, 'Skip-bo', 'Inna nazwa: autobus\nRusza wóz', 49, 153, 3, '2019-05-15', true, false);
insert into RESOURCE(id, name, description, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted) values (5, '7 cudów świata: Pojedynek', 'Pojedynek', 33, 159, 3, '2019-05-15', true, false);
insert into RESOURCE_RENTING(ORDER_DATE, STATUS, ID_RECEIVER, ID_RESOURCE) values (sysdate, 1, 1, 1);
insert into RESOURCE_RENTING(ORDER_DATE, STATUS, ID_RECEIVER, ID_RESOURCE) values (sysdate-10, 0, 2, 5);
insert into RESOURCE(id, name, description, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted) values (6, 'Taboo', 'Zepsuła się', 10, 153, 3, '2018-12-24', true, true);
insert into RESOURCE(id, name, description, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted) values (7, 'Monopoly', 'Rozlałam na to kawę', 50, 159, 3, '2018-12-10', true, true);
insert into RESOURCE_RENTING(ORDER_DATE, BORROW_DATE, GIVE_BACK_DATE, STATUS, ID_RECEIVER, ID_RESOURCE) values ('2019-01-03', '2019-01-05', '2019-02-01', 2, 1, 1);
insert into RESOURCE_RENTING(ORDER_DATE, BORROW_DATE, GIVE_BACK_DATE, STATUS, ID_RECEIVER, ID_RESOURCE) values ('2018-10-14', '2018-10-15', '2018-12-31', 2, 2, 1);


--SAMPLE DATA:

--sample addresses:
insert into ADDRESS(id, locality, nr_flat, nr_house, street, zip_code) values (2, 'Wrocław', '1', '10', 'Przykładowa', '54-365');
insert into ADDRESS(id, locality, nr_flat, nr_house, street, zip_code) values (3, 'Warszawa', '56', '9', 'Warszawska', '01-346');
insert into ADDRESS(id, locality, nr_flat, nr_house, street, zip_code) values (4, 'Wrocław', '5', '235', 'Wrocławska', '54-363');
insert into ADDRESS(id, locality, nr_flat, nr_house, street, zip_code) values (5, 'Wrocław', '12', '34', 'Wałbrzyska', '54-361');
insert into ADDRESS(id, locality, nr_flat, nr_house, street, zip_code) values (6, 'Wrocław', '9', '163', 'Uliczna', '54-360');
insert into ADDRESS(id, locality, nr_flat, nr_house, street, zip_code) values (7, 'Wrocław', '34', '344', 'Piernikowa', '54-369');
insert into ADDRESS(id, locality, nr_flat, nr_house, street, zip_code) values (8, 'Warszawa', '2', '453', 'Górna', '01-360');
insert into ADDRESS(id, locality, nr_flat, nr_house, street, zip_code) values (9, 'Wrocław', '12', '18', 'Przykładowa', '54-365');

--sample users:
INSERT INTO user(id, password, ethereum_address ,ethereum_key, email, last_name, first_name, join_date, birth_date, recall_date, id_address) values
     (4, 'haslo123', 'ethereum_a', 'ethereum_k', 'user1@bm.pl', 'Kowalski', 'Jan', '2019-05-22', '1990-01-01', NULL, 2),
     (5, 'haslo123', 'ethereum_a', 'ethereum_k', 'user2@bm.pl', 'Szydło', 'Sławomir', '2019-05-22', '1965-10-12', NULL, 3),
     (6, 'haslo123', 'ethereum_a', 'ethereum_k', 'user3@bm.pl', 'Szydło', 'Genowefa', '2019-05-22', '1993-09-19', NULL, 3),
     (7, 'haslo123', 'ethereum_a', 'ethereum_k', 'user4@bm.pl', 'Jabłońska', 'Ilona', '2019-05-22', '1999-02-21', NULL, 4),
     (8, 'haslo123', 'ethereum_a', 'ethereum_k', 'user5@bm.pl', 'Cytryńska', 'Karolina', '2019-05-22', '2001-05-26', NULL, 5),
     (9, 'haslo123', 'ethereum_a', 'ethereum_k', 'user6@bm.pl', 'Wilczyńska', 'Adrianna', '2019-05-22', '2005-04-05', NULL, 6),
     (10, 'haslo123', 'ethereum_a', 'ethereum_k', 'user7@bm.pl', 'Koralewski', 'Karol', '2019-05-22', '1997-11-13', NULL, 7),
     (11, 'haslo123', 'ethereum_a', 'ethereum_k', 'user8@bm.pl', 'Różański', 'Witold', '2019-05-22', '1995-12-30', NULL, 8);

--sample resources:
--books
insert into RESOURCE(id, name, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted, description) values
     (8, 'Becoming. Moja historia', 132, 8, 6, '2019-05-22', true, false, 'Michelle Obama opisuje doświadczenia, które ją ukształtowały – od dzieciństwa w południowym Chicago, przez lata godzenia macierzyństwa z karierą, aż do czasu spędzonego w najsłynniejszym domu świata.'),
     (9, 'Kuba Wojewódzki. Nieautoryzowana autobiografia', 56, 8, 11, '2019-05-22', true, false, 'Bezczelna, irytująca i bulwersująca – najlepsza autobiografia celebryty. Zalałem herbatą.'),
     (10, 'Fit and sweet', 2999, 21, 9, '2019-05-22', true, false, 'Ta książka powstała, aby osłodzić Ci codzienność! Nie potrafisz wyobrazić sobie życia bez słodkich przyjemności? Spokojnie, my też nie! Zdrowa dieta to restrykcje, stres i frustracje? Nic z tych rzeczy!'),
     (11, 'Cmętarz zwieżąt', 12, 13, 5, '2019-05-22', true, false, 'cóż, ortografia bywa trudna…'),
     (12, 'Dzikie dziecko miłości', 673, 12, 11, '2019-05-22', true, false, 'Spokój? W słowniku Namiestniczki Thornu ten wyraz nie istnieje'),
     (13, 'Becoming. Moja historia', 120, 8, 10, '2019-05-22', true, false, 'Jeszcze nie czytałam'),
     (14, 'Krótka historia jednego zdjęcia', 450, 14, 4, '2019-05-22', true, false, 'Przed wami ponad 130 najciekawszych historii i zdjęć z niezwykłego fanpage’a "Krótka historia jednego zdjęcia" – jednej z najbardziej inspirujących stron na Facebooku.'),
     (15, 'Data Science i uczenie maszynowe', 340, 15, 3, '2019-05-22', true, false, 'Książka przedstawia uczenie maszynowe w ujęciu praktycznym. Przeprowadzając opisane w niej eksperymenty data science poznamy zastosowanie reguł statystycznych i algorytmów uczenia maszynowego do rozwiązywania konkretnych problemów.'),
     (16, 'Spider-Man', 2, 16, 7, '2019-05-22', true, false, 'Zbiór klasycznych komiksów ze Spider-Manem autorstwa Todda McFarlane’a.'),
     (17, 'Listy zza grobu', 43, 17, 11, '2019-05-22', true, false, 'Największe tajemnice drzemią w małych miasteczkach.'),
     (18, 'Tajemniczy ogród', 32, 22, 9, '2019-05-22', true, false, 'Najlepsza lektura w szkole'),
     (19, 'Chłopcy, których kocham', 1278, 29, 8, '2019-05-22', true, false, 'Przepraszam, czy mogę się u ciebie schować? Czy możemy zbudować z koca kryjówkę na jedną noc i dwoje ludzi? I zostawmy nas na chwilę samych.'),
     (20, 'Szycie jest łatwe ', 20, 30, 5, '2019-05-22', true, false, 'Wszystko o szyciu! Ponad 1000 ilustracji. Porady ekspertów. Informacje na temat tkanin i idealnych krojów.'),
     (21, 'Konstytucja Rzeczypospolitej Polskiej', 1, 31, 4, '2019-05-22', true, false, 'Broszurowe wydanie zawiera tekst aktu prawnego o kluczowym znaczeniu dla polskiego systemu ustrojowego – konstytucję Rzeczypospolitej Polskiej z 2 kwietnia 1997 roku'),
     (22, 'Biblia. Komiks', 2450, 32, 11, '2019-05-22', true, false, 'Ta nowocześnie ilustrowana książka też jest swoistą opowieścią o Superbohaterze i o tych, którzy stają się do Niego podobni, dzięki temu, że Mu zaufali. Wiara – jak przekonują twórcy komiksu - jest jedną z najbardziej fascynujących przygód, obfituje w zaskakujące zwroty akcji i nie brak w niej zagrożeń. Zarówno w sferze literackiej, jak i graficznej, komiks ten daleki jest od większości religijnych książek, w których nie brakuje idyllicznych przedstawień i pastelowych kolorów.'),
     (23, 'In vitro. Rozmowy intymne', 984, 38, 6, '2019-05-22', true, false, 'Trzynaście rozmów i jeden temat – in vitro. Małgorzata Rozenek-Majdan inicjuje dyskusje i stawia trudne pytania lekarzom, embriologom, seksuologom.');

--movies
insert into RESOURCE(id, name, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted, description) values
     (24, 'Król Lew', 3004, 59, 11, '2019-05-22', true, false, 'Ponadczasowa opowieść o dorastaniu, odwadze, miłości i przyjaźni,'),
     (25, 'Fantastyczne zwierzęta i jak je znaleźć', 15, 60, 4, '2019-05-22', true, false, 'Odkryj nową erę świata czarodziejów sprzed czasów Harry''ego Pottera!'),
     (26, 'Zakon Świętej Agaty', 4, 62, 10, '2019-05-22', true, false, 'Młoda, ciężarna kobieta o imieniu Mary szuka schronienia w klasztorze na prowincji stanu Georgia. Zakonnice przyjmują ją i obiecują pomoc, ale w zamian oczekują bezwzględnego przestrzegania reguł zgromadzenia i wyrzeknięcia się zła, jakie niesie ze sobą „zewnętrzny świat”. '),
     (27, 'To', 666, 62, 10, '2019-05-22', true, false, 'Najlepszy film grozy wszech czasów!'),
     (28, 'Ted', 355, 64, 9, '2019-05-22', true, false, 'Ted ożył dawno temu, kiedy mały John wypowiedział gwiazdkowe życzenie, w którym prosił o prawdziwego przyjaciela na całe życie. Prośba się spełniła, ale w dorosłym życiu Ted odmawia porzucenia swego przyjaciela, nie przejmując się jego wiekiem ani sytuacją życiową, w jakiej się znajduje.'),
     (29, 'Simpsonowie', 45, 64, 8, '2019-05-22', true, false, 'Simpsonowie doczekali się pełnometrażowej wersji kinowej. Co ma o tyle dobrą stronę, że szeroki ekran w pełni odzwierciedli szerokie spektrum głupoty Homera Simpsona.'),
     (30, 'Strażnicy galaktyki', 10, 67, 7, '2019-05-22', true, false, 'To od nich będą zależały losy całej galaktyki!'),
     (31, 'Lista Schindlera', 987, 69, 5, '2019-05-22', true, false, 'Kinowe arcydzieło, które stało się jednym z najbardziej cenionych filmów w historii kina. Zdobywca aż siedmiu nagród Academy Award, w tym m. in. w kategoriach: Najlepszy Film i Najlepszy Reżyser, wszystkich głównych nagród przyznawanych dla Najlepszego Filmu, a także licznych wyróżnień.'),
     (32, 'Szeregowiec Ryan', 68, 69, 5, '2019-05-22', true, false, 'II Wojna Światowa była przełomowym wydarzeniem XX wieku i decydującym momentem dla Ameryki i świata. Przesunęła granice państw.');

--music
insert into RESOURCE(id, name, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted, description) values
     (33, 'Biesiada weselna', 7, 40, 5, '2019-05-22', true, false, 'Wszystkich miłośników muzyki łatwej, lekkiej i przyjemnej zapraszamy do słuchania.'),
     (34, 'Sokratesa 18', 9999, 49, 3, '2019-05-22', true, false, 'Stargard in the night milknie powoli, chleba kilka pajd i szczypta soli... Co to za rynek bez katarynek? ... Same najlepsze hity!'),
     (35, 'Dalej w morze', 11, 58, 4, '2019-05-22', true, false, 'Płyta CD zawiera 18 utworów w oryginalnym wykonaniu grupy Ryczące Dwudziestki'),
     (36, 'The Best of Boys Ever', 98, 44, 6, '2019-05-22', true, false, 'Ta płyta jest tak szalona, jak ty');

--board games
insert into RESOURCE(id, name, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted, description) values
     (37, 'O mój zboże!', 49, 146, 4, '2019-05-22', true, false, 'Europa, czasy średniowiecza. Stanowicie grupę rzemieślników wytwarzających buty, beczki, szkło, skóry i wiele innych towarów.'),
     (38, 'Terraformacja Marsa', 159, 146, 4, '2019-05-22', true, false, 'Ludzkość rozpoczęła ekspansję w Układzie Słonecznym. Na Marsie założono już kilka niewielkich kolonii. Ich mieszkańcy są odgrodzeni od naturalnego środowiska straszliwie zimnej, suchej i niemal pozbawionej atmosfery planety.'),
     (39, 'Dixit', 129, 147, 10, '2019-05-22', true, false, 'Pamiętaj, że jeden obraz jest wart więcej niż tysiąc słów!'),
     (40, 'Zaginiony Klucz', 110, 147, 9, '2019-05-22', true, false, 'Zaginiony klucz to zbudowana na współpracy gra towarzyska o bardzo uniwersalnym charakterze, oparta o dedukcję i zabawę ze skojarzeniami. To od waszego współdziałania i skutecznej komunikacji zależy, czy klucz zostanie odnaleziony!'),
     (41, 'Złoto Bohaterów', 79, 151, 8, '2019-05-22', true, false, 'Gracze obierają role Troli, Nieumarłych, Oceanicznych Bestii, Demonów, Insektów oraz Smoków, które pragną odzyskać nielegalnie zrabowane im złoto. Gracze będą musieli połączyć siły, żeby pokonać strażników, którym nakazano pilnować bogactw. Choć gra opiera się na współpracy, prawdziwe Potwory zawsze będą chciały zdobyć więcej świecidełek od swoich kolegów. Tę dynamiczną grę karcianą wygra gracz, który wykaże się ponadprzeciętnym sprytem i zgarnie najwięcej złota!'),
     (42, 'Zombiaki Ameryki', 89, 151, 8, '2019-05-22', true, false, 'Zombiaki Ameryki to wyprawa samochodowa rodem z horroru. Jedziecie z Chicago do Los Angeles uciekając przed zarazą zombie w USA. Będziecie musieli wykazać się nie lada zaradnością, aby pokonać swoich przeciwników i przetrwać tę podróż! Aby mieć szansę na zwycięstwo, przynajmniej jeden z grupy ocalałych danego gracza musi dotrzeć do Zachodniego Wybrzeża.'),
     (43, 'Wiek Złodziei', 180, 151, 7, '2019-05-22', true, false, 'Wiek Złodziei to wyjątkowa gra, której akcja dzieje się w oryginalnym uniwersum. Zapraszamy was do świata, który jest połączeniem klasycznego steampunku z wizjonerskimi projektami Leonarda da Vinci i odrobiną magii.'),
     (44, 'Herosi', 45, 152, 6, '2019-05-22', true, false, 'Herosi to dynamiczna gra czasu rzeczywistego, przeznaczona dla od 2 do 4 graczy, w której wcielisz się w rolę jednego z władców czterech magicznych żywiołów i weźmiesz udział w pojedynku.'),
     (45, 'Alchemicy', 150, 152, 6, '2019-05-22', true, false, 'Od dwóch do czterech graczy wciela się w rywalizujących alchemików chcących odkryć sekrety tej tajemnej sztuki. Punkty można zdobywać na różne sposoby, ale najwięcej otrzymuje się za publikację teorii - prawidłowych teorii, warto dodać. I w tym leży problem.'),
     (46, 'K2', 99, 152, 6, '2019-05-22', true, false, 'W grze K2 każdy z graczy kieruje zespołem 2 himalaistów, którzy rywalizując z innymi zespołami, starają się zdobyć szczyt i przetrwać do końca 18-dniowej wyprawy.'),
     (47, 'Królestwo w budowie', 149, 152, 5, '2019-05-22', true, false, 'Podczas rozgrywki w Królestwo w budowie, gracze tworzą własne królestwa, rozważnie stawiając nowe osady by na końcu rozgrywki posiąść jak najwięcej złota.'),
     (48, 'Patchwork', 75, 149, 8, '2019-05-22', true, false, 'Patchwork to metoda szycia, w której łączy się małe kawałki materiału w większą całość, tworząc nowy wzór. W przeszłości wykorzystywano ją, żeby zagospodarować niechciane ścinki i skrawki.'),
     (49, 'Mi pasuje!', 89, 149, 8, '2019-05-22', true, false, 'Mi pasuje! to klasyczna gra logiczna o bardzo prostych zasadach, zapewniająca wiele godzin rozrywki na najwyższym poziomie. Po raz pierwszy wydana w roku 1983 do dziś cieszy się niesłabnącą popularnością na całym świecie dzięki swojemu uniwersalnemu charakterowi.'),
     (50, '4 w Linii', 39, 149, 8, '2019-05-22', true, false, '4 w Linii to gra logiczna przeznaczona dla dwóch osób (bądź dwóch zespołów). To pojedynek na przemyślność i przewidywanie. Spróbuj odgadnąć zamiary przeciwnika, równocześnie tworząc własną taktykę obliczoną na kilka ruchów do przodu. Wygra ten, kto zdoła jako pierwszy ułożyć 4 krążki w jednej linii.'),
     (51, '4 w Linii', 59, 149, 6, '2019-05-22', true, false, 'Connect 4 w polskim wydaniu'),
     (52, 'Blokus', 139, 149, 5, '2019-05-22', true, false, 'Po prostu genialna, genialnie prosta! Proste reguły i wciągająca rozgrywka to jej niezaprzeczalne atuty. Gra przeznaczona jest dla osób w różnym wieku - to nie wiek decyduje o szansie na sukces.');

--magazines
insert into RESOURCE(id, name, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted, description) values
     (53, 'Polityka 21/2019', 99, 155, 5, '2019-05-22', true, false, 'Czy będą dymisje biskupów?'),
     (54, 'Runner`s World 5-6/2019', 12, 167, 4, '2019-05-22', true, false, 'Zostań maratończykiem, Super food, Bieganie w ciąży');

--toys
insert into RESOURCE(id, name, points, id_resource_type, id_owner, add_date, can_be_borrowed, is_deleted, description) values
     (55, 'LEGO City, klocki Pustynna wyścigówka', 37, 78, 4, '2019-05-22', true, false, 'Do startu, gotowi… START! Załóż kask i weź udział w pustynnym wyścigu w tej łatwej do zbudowania wyścigówce.'),
     (56, 'Barbie, lalka Tęczowa syrenka', 68, 88, 4, '2019-05-22', true, false, 'Zanurz lalkę w wodzie, by zobaczyć, jak jej tęczowy ogon pięknie rozświetla się kolorowymi światełkami!'),
     (57, 'Barbie, lalka Pediatra', 89, 88, 4, '2019-05-22', true, false, 'Uwaga! Produkt nieodpowiedni dla dzieci poniżej 3 roku życia.'),
     (58, 'Pucio, puzzle Co tu pasuje', 23, 104, 4, '2019-05-22', true, false, 'kształtują wyobraźnię i logiczne myślenie'),
     (59, 'Trefl, Psi Patrol, puzzle Gotowi do akcji', 12, 104, 4, '2019-05-22', true, false, 'Odporne na zginanie!');