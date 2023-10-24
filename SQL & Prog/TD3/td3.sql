-- EXERCICE 1

-- b
INSERT INTO Facture(id,quantite) VALUES (101,4);
INSERT INTO Facture(id,quantite) VALUES (102,1);
INSERT INTO Facture(id,quantite) VALUES (103,3);
INSERT INTO Facture(id,quantite) VALUES (104,8);

/* Le tuple 'prix_total s'est rempli tout seul en multipliant un prix random par la quantité*/

-- c 
INSERT INTO Facture(id,quantite,prix_total) VALUES (105,10,0);
INSERT INTO Facture(id,quantite,prix_total) VALUES (106,12,7.54);
INSERT INTO Facture(id,quantite,prix_total) VALUES (107,6,2.28);
INSERT INTO Facture(id,quantite,prix_total) VALUES (108,5,0);
/* Le tuple 'prix_total s'est aussi  rempli tout seul en multipliant un prix random par la quantité*/


-- d
UPDATE Facture SET quantite = 9 WHERE id = 109;
/*La requête ne fait rien car l'article 109 n'existe pas*/
-- e
INSERT INTO Facture(id,quantite,prix_total) VALUES (110,1,0);
/*Rien ne se passe*/

-- f
UPDATE Facture SET quantite = 0 WHERE prix_total > 12.50;
/*Le prix_total des factures avec comme id = 101,103,104 et 105*/

-- g
UPDATE Article SET prix = ROUND(prix) WHERE id=102;
/*La requête s'effectue normalement*/

-- h 
/*Le prix dans la table Facture n'a pas changé*/

-- i
DELETE FROM Article WHERE id in (SELECT id FROM Facture WHERE quantite = 0);
/*La requête ne s'effectue pas a cause de la contrainte de clé étrangères*/

-- j
/*ALTER TABLE Facture ALTER COLUMN prix_total SET NOT NULL;

ALTER TABLE FACTURE DISABLE TRIGGER trig_four ALL; */
INSERT INTO Facture (id,quantite) VALUES (109,20);

-- k
ALTER TABLE FACTURE ENABLE TRIGGER trig_four ALL;
INSERT INTO Facture (id,quantite) VALUES (109,20);


-- EXERCICE 2

-- a
\i td3-tables.sql
CREATE TABLE Article_sc as SELECT * FROM Article;
CREATE TABLE Facture_sc as SELECT * FROM Facture;

-- b
SELECT * from Facture_sc;
SELECT * from Article_sc;

-- c 

CREATE OR REPLACE TRIGGER trig_pk_Article_sc
BEFORE INSERT OR UPDATE ON Article_sc
FOR EACH ROW
BEGIN
    -- Vérification si l'identifiant est NULL
    IF :NEW.identifiant IS NULL THEN
        RAISE_APPLICATION_ERROR(-20001, 'L''identifiant ne peut pas être NULL');
    END IF;

    -- Vérification de la duplication de l'identifiant
    DECLARE
        v_count INT;
    BEGIN
        SELECT COUNT(*)
        INTO v_count
        FROM Article_sc
        WHERE identifiant = :NEW.identifiant;

        IF INSERTING AND v_count > 0 THEN
            RAISE_APPLICATION_ERROR(-20002, 'Duplication de l''identifiant détectée');
        ELSIF UPDATING AND v_count > 1 THEN
            RAISE_APPLICATION_ERROR(-20002, 'Duplication de l''identifiant détectée');
        END IF;
    END;
END;
/


-- d 
-- Insérer un nouvel article dont l’identifiant vaut null
INSERT INTO Article_sc (id, nom, prix) VALUES (NULL, 'trieur', 9.99);

-- Mettre à jour l’article numéro 105 en mettant son identifiant à null
UPDATE Article_sc SET id = NULL WHERE identifiant = 105;

-- Insérer un article dont l’identifiant est 105
INSERT INTO Article_sc (id, nom, prix) VALUES (105, 'agrafeuse', 8.29);

-- Mettre à jour l’article dont l’identifiant est 107 avec l’identifiant 105
UPDATE Article_sc SET id = 105 WHERE identifiant = 107;

-- Insérer un article dont l’identifiant est 100
INSERT INTO Article_sc (id, nom, prix) VALUES (100, 'ardoise', 4.89);

-- Mettre à jour le nom de cet article en tablette LED
UPDATE Article_sc SET nom = 'tablette LED' WHERE identifiant = 100;

-- Détruire cet article dont l’identifiant est 100
DELETE FROM Article_sc WHERE id = 100;
