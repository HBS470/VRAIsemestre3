 -- Exercice 1 

 -- a

 /* Création fonction trigger */

CREATE OR REPLACE FUNCTION inserDateEdit() RETURNS TRIGGER as $$
DECLARE dateEdition date;
BEGIN
SELECT date_creation INTO dateEdition FROM bookbay.editions NATURAL JOIN bookbay.collections INNER JOIN bookbay.livres USING (code_collection); 
IF TG_OP='UPDATE' or TG_OP='INSERT' THEN 
    IF NEW.depot_legal > dateEdition THEN
        RAISE EXCEPTION 'La date de dépot est plus grande que la date de creation de la maison d éditions ';
    ELSE 
        RETURN NEW;
    END IF;
END IF;
RETURN NULL;
END;
$$ LANGUAGE plpgsql;


/*Création du trigger */
DROP TRIGGER IF EXISTS verifDateEditPublie on bookbay.livres;
CREATE TRIGGER verifDateEditPublie 
BEFORE INSERT OR UPDATE ON bookbay.livres 
FOR EACH ROW
EXECUTE FUNCTION inserDateEdit();

-- b

CREATE OR REPLACE FUNCTION codeEditionISBN() RETURNS TRIGGER as $$
BEGIN