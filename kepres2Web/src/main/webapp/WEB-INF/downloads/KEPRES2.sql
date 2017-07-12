CREATE TABLE AEN_Persoane (
    id NUMBER PRIMARY KEY,
    nume VARCHAR2(25) NOT NULL,
    prenume VARCHAR2(25),
    oras VARCHAR2(25),
    data_nastere DATE
);

INSERT INTO AEN_Persoane
VALUES (1, 'Enache', 'Alexandru-Madalin', 'Buzau', TO_DATE('12/10/1992', 'DD/MM/YYYY'));
INSERT INTO AEN_Persoane
VALUES (2, 'Neacsu', 'Radu', 'Pitesti', TO_DATE('10/12/1994', 'DD/MM/YYYY'));
INSERT INTO AEN_Persoane
VALUES (3, 'Glavan', 'Gheorghe', 'Bucuresti', TO_DATE('28/04/1997', 'DD/MM/YYYY'));

SELECT * FROM AEN_Persoane;