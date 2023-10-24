-- Exercice 1 

-- a 
DROP TABLE if exists Fabricant cascade ;

CREATE TABLE Fabricant (
    idFab int,
    nomFab varchar,
    adresse varchar
);

-- b 
INSERT INTO Fabricant (idFab,nomFab,adresse) VALUES (201,'HappyBuro','Montreuil');
INSERT INTO Fabricant (idFab,nomFab,adresse) VALUES (202,'OfficeBox','Paris');
INSERT INTO Fabricant (idFab,nomFab,adresse) VALUES (203,'BuroValley','Lille');
INSERT INTO Fabricant (idFab,nomFab,adresse) VALUES (204,'IciOffice','Nantes');
INSERT INTO Fabricant (idFab,nomFab,adresse) VALUES (205,'PapierCo','Dijon');

-- c
DROP TABLE if exists Produit cascade ;

CREATE TABLE Produit (
    idProd int,
    nomProd varchar,
    prixProd numeric,
    idFab int
);

-- d 

/* Création de la fonction trigger*/
CREATE or REPLACE FUNCTION inserprod() RETURNS TRIGGER as
$$
BEGIN
IF TG_OP='UPDATE' or TG_OP='INSERT' THEN 
    IF NEW.prixProd < 2 THEN
        NEW.idFab = 201;
    ELSIF NEW.prixProd > 5 THEN
        NEW.idFab = 202;
    ELSIF NEW.nomProd LIKE '%classeur%' or NEW.nomProd LIKE'%chemise%' THEN
        NEW.idFab = 203;
    ELSE 
        NEW.idFab = 204;
    END IF;
	RETURN NEW;
END IF;
RETURN NULL;
END;
$$ LANGUAGE PlpgSQL;



/* Création du trigger */
CREATE TRIGGER trig_inser_Produit BEFORE
UPDATE or INSERT or DELETE ON Produit
FOR EACH ROW
EXECUTE FUNCTION inserprod();

-- e 
INSERT INTO Produit (idProd,nomProd,prixProd) SELECT id,nom,prix FROM Article;

-- EXERCICE 2
