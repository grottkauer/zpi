INSERT INTO rodzaj_zasobu(rodzajzasobuid, nazwa) VALUES (1, 'testowy rodzaj');

INSERT INTO zasob(zasobid, punkty, waga, nazwa, rodzaj_zasobuid)
    VALUES (1, 3, 0.5, 'pierwszy zasob', 1);
INSERT INTO zasob(zasobid, punkty, waga, nazwa, rodzaj_zasobuid) VALUES (2, 3, 0.5, 'drugi zasob', 1);
INSERT INTO zasob(zasobid, punkty, waga, nazwa, rodzaj_zasobuid) VALUES (3, 3, 0.5, 'trzeci zasob', 1);
