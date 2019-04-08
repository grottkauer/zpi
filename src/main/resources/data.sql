-- todo add current date in used type of sql
-- MAIN CATEGORIES
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (1, 'Książki');
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (2, 'Muzyka');
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (3, 'Filmy');
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (4, 'Zabawki');
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (5, 'Gry i programy');
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (6, 'Artykuły kolekcjonerskie');
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (7, 'Czasopisma');

-- SUBCATEGORIES

-- BOOKS
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (8, 'Biograficzne', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (9, 'Ekonomiczne', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (10, 'Dla dzieci', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (11, 'Dla młodzieży', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (12, 'Fantasy', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (13, 'Horrory', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (14, 'Historyczne', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (15, 'Informatyczne', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (16, 'Komiksy', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (17, 'Kryminały', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (18, 'Sensacyjne', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (19, 'Thrillery', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (20, 'Regionalne', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (21, 'Kucharskie', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (22, 'Lektury', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (23, 'Literatura faktu', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (24, 'Obyczajowe', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (25, 'Literatura piękna', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (26, 'Językowe', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (27, 'Obcojęzyczne', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (28, 'Podręczniki szkolne', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (29, 'Poezja', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (30, 'Poradniki', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (31, 'Prawnicze', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (32, 'Religijne', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (33, 'Rozwój osobisty', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (34, 'Sportowe', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (35, 'Sztuka', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (36, 'Podróżnicze', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (37, 'Przewodniki', 1);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (38, 'Zdrowie', 1);

-- MUSIC
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (39, 'Alternatywna', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (40, 'Biesiadna', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (41, 'Heavy metal', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (42, 'Country', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (43, 'Dance', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (44, 'Disco', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (45, 'Dla dzieci', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (46, 'Folk', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (47, 'Jazz', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (48, 'Blues', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (49, 'Kabaretowa', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (50, 'Filmowa', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (51, 'Poważna', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (52, 'Relaksacyjna', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (53, 'Religijna', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (54, 'Pop', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (55, 'Rock', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (56, 'Hip Hop/Rap', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (57, 'Reggae', 2);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (58, 'Szanty', 2);

-- FILMS
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (59, 'Bajki', 3);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (60, 'Fantasy', 3);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (61, 'Sci-fi', 3);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (62, 'Horror', 3);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (63, 'Thriller', 3);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (64, 'Komedie', 3);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (65, 'Obyczajowe', 3);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (66, 'Westerny', 3);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (67, 'Kino akcji', 3);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (68, 'Seriale', 3);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (69, 'Wojenne', 3);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (70, 'Inne', 3);

-- TOYS
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (71, 'Klocki', 4);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (72, 'Do nauki', 4);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (73, 'Lalki', 4);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (74, 'Figurki', 4);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (75, 'Puzzle', 4);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (76, 'Pojazdy', 4);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (77, 'Pluszaki', 4);

-- TOYS - Brick
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (78, 'Lego', 71);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (79, 'Plastikowe', 71);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (80, 'Drewniane', 71);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (81, 'Inne', 71);

-- TOYS - Education
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (82, 'Interaktywne', 72);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (83, 'Mały naukowiec', 72);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (84, 'Pisanie i czytanie', 72);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (85, 'Inne', 72);

-- TOYS - Doll
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (86, 'Akcesoria', 73);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (87, 'Bobasy', 73);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (88, 'Celebrytki', 73);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (89, 'Interaktywne', 73);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (90, 'Szmaciane', 73);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (91, 'Bajkowe', 73);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (92, 'Mini lalki', 73);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (93, 'Inne', 73);

-- TOYS - Figurine
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (94, 'Akcesoria', 74);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (95, 'Akcji', 74);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (96, 'Kolekcjonerskie', 74);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (97, 'Bajkowe', 74);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (98, 'Zwierzęta', 74);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (99, 'Inne', 74);

-- TOYS - Puzzle
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (100, 'Akcesoria', 75);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (101, '3D i 4D', 75);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (102, 'Drewniane', 75);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (103, 'Podłogowe', 75);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (104, 'Tradycyjne', 75);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (105, 'Układanki klockowe', 75);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (106, 'Inne', 75);

-- TOYS - Vehicles
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (107, 'Akcesoria', 76);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (108, 'Kolejki', 76);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (109, 'Modele do sklejania', 76);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (110, 'Budowlane', 76);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (111, 'Ratunkowe', 76);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (112, 'Rolnicze', 76);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (113, 'Zdalnie sterowane', 76);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (114, 'Samochody', 76);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (115, 'Samoloty', 76);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (116, 'Statki', 76);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (117, 'Inne', 76);

-- TOYS - Plushy
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (118, 'Interakctywne', 77);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (119, 'Kukiełki i pacynki', 77);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (120, 'Maskotki', 77);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (121, 'Inne', 77);

-- GAMES AND PROGRAMS
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (122, 'Cyfrowe', 5);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (123, 'Planszowe', 5);

-- GAMES - Cipher
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (124, 'Gry', 123);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (125, 'Programy', 123);

-- GAMES - Cipher - games
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (126, 'Akcja i strzelanki', 124);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (127, 'Dla dzieci', 124);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (128, 'Logiczne', 124);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (129, 'MMO i sieciowe', 124);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (130, 'Przygodowe', 124);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (131, 'RPG', 124);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (132, 'Sportowe', 124);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (133, 'Strategiczne', 124);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (134, 'Symulatory', 124);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (135, 'Zręcznościowe', 124);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (136, 'Wyścigowe', 124);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (137, 'Inne', 124);

-- GAMES - Cipher - programs
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (138, 'Nauka języków', 125);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (139, 'Programowanie', 125);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (140, 'Grafika', 125);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (141, 'Zarządzanie firmą', 125);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (142, 'E-commence', 125);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (143, 'Inne', 125);

-- GAMES - board
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (144, 'Army painter', 123);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (145, 'Edukacyjne', 123);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (146, 'Ekonomiczne', 123);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (147, 'Familijne', 123);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (148, 'Fantasy', 123);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (149, 'Logiczne', 123);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (150, 'Łamigłówki', 123);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (151, 'Przygodowe', 123);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (152, 'Strategiczne', 123);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (153, 'Inne', 123);

-- todo COLLECTIONS
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (154, 'Inne', 6);

-- NEWSPAPERS
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (155, 'Polityka', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (156, 'Architektura', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (157, 'Dla dzieci i młodzieży', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (158, 'Ekonomia', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (159, 'Hobby', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (160, 'IT', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (161, 'Kultura i sztuka', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (162, 'Motoryzacja', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (163, 'Specjalistyczne', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (164, 'Turystyka', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (165, 'Popularnonaukowe', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (166, 'Rozrywka', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (167, 'Sport', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (168, 'Historyczne', 7);
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa, stopien_wyzejid) VALUES (169, 'Życie rodzinne', 7);



INSERT INTO zasoby(id, punkty, waga, nazwa, rodzaj_zasobuid)
    VALUES (1, 3, 0.5, 'pierwszy zasob', 1);
INSERT INTO zasoby(id, punkty, waga, nazwa, rodzaj_zasobuid) VALUES (2, 3, 0.5, 'drugi zasob', 1);
INSERT INTO zasoby(id, punkty, waga, nazwa, rodzaj_zasobuid) VALUES (3, 3, 0.5, 'trzeci zasob', 1);

INSERT INTO uzytkownicy(id, login, haslo, klucz_ethereum, email, nazwisko, imie, data_dolaczenia, data_urodzenia, data_wygaszenia, adres_id)
VALUES  (1, 'jan', 'kowalski','704f7159d16f05e611306d71c61b98722c9e8ade2395e9bbfcf8dfa92caa27b1','jan@kowalski.com','kowalski','jan', '2019-03-15','1980-06-29','2020-03-15',NULL ),
        (2, 'zbigniew', 'nowak','af2b6729ab77cddfd86ee4f39231353bd142e2a5ab561098ae892269d24d1624','znigniew@nowak.com','nowak','zbigniew', '2019-03-15','1980-06-29','2020-03-15',NULL );