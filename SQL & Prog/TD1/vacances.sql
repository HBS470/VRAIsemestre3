
DROP SCHEMA if exists vac cascade ;
CREATE SCHEMA vac;
SET search_path to public, vac;

-- DROP TABLE IF EXISTS Club, Pers, Groupe, GroupePers, Resa CASCADE;

CREATE TABLE vac.Club (
   idClub SERIAL PRIMARY KEY, 
   nom VARCHAR(30),
   ville VARCHAR(30),
   etoile INTEGER NOT NULL,
   capacite INTEGER NOT NULL );

CREATE TABLE vac.Pers (
   idPers SERIAL PRIMARY KEY, 
   nom VARCHAR(30),
   age INTEGER NOT NULL,
   ville VARCHAR(30) );

CREATE TABLE vac.Groupe (
   idGrp SERIAL PRIMARY KEY,
   activite VARCHAR(30) );

CREATE TABLE vac.GroupePers (
   idGrp SERIAL REFERENCES vac.Groupe(idGrp),
   idPers SERIAL REFERENCES vac.Pers(idPers),
   PRIMARY KEY (idPers, idGrp) );

CREATE TABLE vac.Resa (
   idGrp SERIAL REFERENCES vac.Groupe(idGrp),
   idClub SERIAL REFERENCES vac.Club(idClub),
   nbJour INTEGER,
   mois VARCHAR(30),
   PRIMARY KEY (idGrp, idClub) );



