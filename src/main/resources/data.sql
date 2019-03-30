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

INSERT INTO zasob(zasobid, punkty, waga, nazwa, rodzaj_zasobuid)
    VALUES (1, 3, 0.5, 'pierwszy zasob', 1);
INSERT INTO zasob(zasobid, punkty, waga, nazwa, rodzaj_zasobuid) VALUES (2, 3, 0.5, 'drugi zasob', 1);
INSERT INTO zasob(zasobid, punkty, waga, nazwa, rodzaj_zasobuid) VALUES (3, 3, 0.5, 'trzeci zasob', 1);
