-- Exercice 1
-- a
BEGIN;
INSERT INTO GARDIEN VALUES (80, 'Durand', 'aa', '1990-01-16');
SELECT * FROM GARDIEN;
ROLLBACK ;
SELECT * FROM GARDIEN;

/* 1 ere ligne : Commencement de la transaction
   2 ème ligne : Insertion d'une nouvelle ligne dans la table Gardien
   3 ème ligne : Affichage de la table Gardien avec la nouvelle donnée
   4 ème ligne : Rollback de la transaction pour annuler l'insertion
   5 ème ligne : Affichage de la table gardien après le rollback donc sans la nouvelle donnée*/


-- b

BEGIN; -- Commencement de la transaction
INSERT INTO GARDIEN VALUES (800, 'Dupont', 'aa', '1990-01-16'); -- Insertion d'une nouvelle ligne dans la table
SELECT * FROM GARDIEN ; -- Affichage de la table avec la nouvelle donnée
SAVEPOINT pointControl ; -- Définit un point de sauvegarde
INSERT INTO GARDIEN VALUES (900, 'Durand', 'aa', '1990-01-16'); -- Insertion d'une nouvelle ligne dans la table
SELECT * FROM GARDIEN; -- Affichage de la table avec la nouvelle donnée
ROLLBACK TO pointControl ; -- Reviens au point de sauvegarde
SELECT * FROM GARDIEN ; -- Affichage de la table avec la 1ere nouvelle donnée
ROLLBACK ; -- Reviens au tout début du bloc 
SELECT * FROM GARDIEN ; -- Affichage de la table sans les nouvelles données


-- c 

BEGIN; -- Commencement de la transaction
INSERT INTO GARDIEN VALUES (80, 'Durand', 'aa', '1990-01-16'); -- Insertion d'une nouvelle ligne dans la table
SELECT * FROM GARDIEN ; -- Affichage de la table avec la nouvelle donnée
COMMIT ; -- Fin de la transaction
SELECT * FROM GARDIEN ; -- Affichage de la table qui affiche la meme chose que l'affichage d'en haut
-- car il y a le commit qui arrete la transaction;


-- d

BEGIN; -- Commencement de la transaction
INSERT INTO GARDIEN VALUES (70, 'Neymar', 'Braaaaziiiiil', '1993-02-05'); -- Insertion d'une nouvelle ligne dans la table
INSERT INTO GARDIEN VALUES (95, 'Silva', 'Fosses', '2004-10-24'); -- Insertion d'une nouvelle ligne dans la table
INSERT INTO GARDIEN VALUES (93, 'Akhrib', 'Sevran', '2004-08-18'); -- Insertion d'une nouvelle ligne dans la table
COMMIT; -- Fin de la transaction
INSERT INTO GARDIEN VALUES (110, 'Messi', 'Buenos Aires', '1992-10-24'); -- Insertion d'une nouvelle ligne dans la table
UPDATE GARDIEN SET adresse = 'Miami' WHERE numGardien = 110; -- Modification d'une ligne dans la table
DELETE FROM GARDIEN WHERE numGardien = 85; -- Suppression d'une ligne dans la table
BEGIN; -- Commencement d'une nouvelle transaction
SELECT * FROM GARDIEN; -- Affichage de la table
UPDATE GARDIEN SET adresse = 'Saint-Etienne' WHERE numGardien = 95; -- Modification d'une ligne dans la table
UPDATE GARDIEN SET nom = 'Amine' WHERE numGardien = 93; -- Modification d'une ligne dans la table
SELECT * FROM GARDIEN; -- Affichage de la table
ROLLBACK; -- Reviens au debut du bloc donc avant le 2eme begin
SELECT * FROM GARDIEN; -- Affichage de la table


-- Exercice 2

-- a

BEGIN; -- Commencement de la transaction
INSERT INTO GARDIEN VALUES (null, 'Dupont', 'Montreuil', '1970-10-25'); -- Insertion d'une nouvelle donnée avec comme clé primaire null (pas possible)
SELECT * FROM GARDIEN; -- Affichage de la table
COMMIT ; -- Fin de la transaction
SELECT * FROM GARDIEN; -- Affichage de la table

-- L'insertion contient une clé primaire vide donc elle ne se fait pas et un rollback s'active

-- b
BEGIN; -- Commencement de la transaction
INSERT INTO GARDIEN VALUES (85, 'Dupont', 'Montreuil', '1970-10-25'); -- Insertion d'une nouvelle donnée
SELECT * FROM GARDIEN where nom = 'Dupont'; -- Affichage des personnes avec Dupont comme nom
COMMIT ; -- Fin de la transaction
SELECT * FROM GARDIEN where nom = 'Dupont'; -- Affichage des personnes avec Dupont comme nom

