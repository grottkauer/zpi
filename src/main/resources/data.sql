INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (1, 'Książki');
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (2, 'Muzyka');
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (3, 'Filmy');
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (4, 'Zabawki');
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (5, 'Gry i programy');
INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (6, 'Artykuły kolekcjonerskie');

INSERT INTO podkategoria_zasobu(podkategoria_zasobuid, nazwa, rodzaj_zasobuid) VALUES (1, 'Audiobooki', 1);
INSERT INTO podkategoria_zasobu(podkategoria_zasobuid, nazwa, rodzaj_zasobuid) VALUES (2, 'Biograficzne', 1);
INSERT INTO podkategoria_zasobu(podkategoria_zasobuid, nazwa, rodzaj_zasobuid) VALUES (3, 'Ekonomiczne', 1);
INSERT INTO podkategoria_zasobu(podkategoria_zasobuid, nazwa, rodzaj_zasobuid) VALUES (4, 'Dziecięce', 1);
INSERT INTO podkategoria_zasobu(podkategoria_zasobuid, nazwa, rodzaj_zasobuid) VALUES (5, 'Młodzieżowe', 1);
INSERT INTO podkategoria_zasobu(podkategoria_zasobuid, nazwa, rodzaj_zasobuid) VALUES (6, 'Fantasy', 1);
INSERT INTO podkategoria_zasobu(podkategoria_zasobuid, nazwa, rodzaj_zasobuid) VALUES (7, 'Horror', 1);
INSERT INTO podkategoria_zasobu(podkategoria_zasobuid, nazwa, rodzaj_zasobuid) VALUES (8, 'Informatyka', 1);

INSERT INTO zasoby(id, punkty, waga, nazwa, rodzaj_zasobuid)
    VALUES (1, 3, 0.5, 'pierwszy zasob', 1);
INSERT INTO zasoby(id, punkty, waga, nazwa, rodzaj_zasobuid) VALUES (2, 3, 0.5, 'drugi zasob', 1);
INSERT INTO zasoby(id, punkty, waga, nazwa, rodzaj_zasobuid) VALUES (3, 3, 0.5, 'trzeci zasob', 1);

INSERT INTO uzytkownicy(id, login, haslo, klucz_ethereum, email, nazwisko, imie, data_dolaczenia, data_urodzenia, data_wygaszenia, adres_id)
VALUES  (1, 'jan', 'kowalski','704f7159d16f05e611306d71c61b98722c9e8ade2395e9bbfcf8dfa92caa27b1','jan@kowalski.com','kowalski','jan', '2019-03-15','1980-06-29','2020-03-15',NULL ),
        (2, 'zbigniew', 'nowak','af2b6729ab77cddfd86ee4f39231353bd142e2a5ab561098ae892269d24d1624','znigniew@nowak.com','nowak','zbigniew', '2019-03-15','1980-06-29','2020-03-15',NULL );