DROP SCHEMA  IF EXISTS website CASCADE ;

CREATE SCHEMA website;

SET search_path TO website,public;

CREATE TABLE Skin (
	id_skin SERIAL,
	apparence VARCHAR(255),
PRIMARY KEY(id_skin)
);

CREATE TABLE Joueur (
	id_joueur SERIAL,
	username VARCHAR(255),
	date_creation DATE,
PRIMARY KEY (id_joueur)
);

CREATE TABLE Tourelle (
	id_tourelle SERIAL,
	nom_tourelle VARCHAR(255),
	date_creation DATE,
	prix_ram INT,
	prix_flop INT,
PRIMARY KEY(id_tourelle)

);
CREATE TABLE Partie (
	id_partie SERIAL,
	scores INT,
	map INT
PRIMARY KEY (id_partie)
);
CREATE TABLE Revetement (
	id_skin INT,
	id_tourelle INT,
PRIMARY KEY (id_skin,id_tourelle),
FOREIGN KEY (id_skin) REFERENCES (skin.id_skin),
FOREIGN KEY (id_tourelle) REFERENCES (tourelle.id_tourelle)
);

CREATE TABLE Save (
	id_save SERIAL
	id_joueur INT,
	temps_save VARCHAR(255),
	vague_atteinte INT,
	PV INT,
	RAM INT,
	flops INT,
	etats_tourelle INT,
	date_save date,
PRIMARY KEY(id_save)
FOREIGN KEY (id_joueur) REFERENCES (joueur.id_joueur),
FOREIGN KEY (id_tourelle) REFERENCES (etat_tourelle.id_tourelle),
);


CREATE TABLE Map ( 
	id_map SERIAL,
	nom_map VARCHAR(255),
	matrix VARCHAR(255),
PRIMARY KEY (id_map),
FOREIGN KEY (id_matrix) REFERENCES (matrix.id_matrix)
);

CREATE TABLE Etat_tourelle (
	id_tourelle SERIAL,
	posX INT,
	posY INT,
	niveau INT,
	id_save INT,
PRIMARY KEY (id_tourelle),
FOREIGN KEY (id_tourelle) REFERENCES (tourelle.id_tourelle)
);

CREATE TABLE Scores (
	id_partie SERIAL,
	id_joueur INT,
	temps_realise VARCHAR(255),
	vague_atteinte INT,
	versus BOOLEAN,
PRIMARY KEY (id_partie,id_joueur),
FOREIGN KEY (id_partie) REFERENCES (partie.id_partie),
FOREIGN KEY (id_joueur) REFERENCES (joueur.id_joueur)
);

CREATE TABLE poseTourelle (
	id_joueur INT,
	id_tourelle INT,
PRIMARY KEY(id_joueur,id_tourelle),
FOREIGN KEY (id_joueur) REFERENCES (joueur.id_joueur),
FOREIGN KEY (id_tourelle) REFERENCES (tourelle.id_tourelle)
);

CREATE TABLE ConstruitMap (
	id_joueur INT,
	id_map INT,
PRIMARY KEY (id_joueur,id_map),
FOREIGN KEY (id_joueur) REFERENCES (joueur.id_joueur),
FOREIGN KEY (id_map) REFERENCES (map.id_map)
);



















