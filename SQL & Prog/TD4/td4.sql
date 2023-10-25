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

CREATE OR REPLACE FUNCTION verifCodeEditionISBN() RETURNS TRIGGER AS $$
BEGIN
    -- Convertir l'ISBN13 en chaîne de caractères
    DECLARE isbnString VARCHAR := CAST(NEW.isbn AS VARCHAR);
    
    -- Extraire le code de l'éditeur à partir de l'ISBN
    DECLARE extractedCode INTEGER := CAST(SPLIT_PART(isbnString, '-', 2) AS INTEGER);
    
    -- Vérifier si le code extrait correspond au code de la collection du livre
    IF extractedCode != NEW.code_collection THEN
        RAISE EXCEPTION 'Le code de la collection du livre ne correspond pas au code de l’éditeur dans l’ISBN.';
    END IF;
    
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- Créer un trigger pour exécuter la fonction avant chaque insertion ou mise à jour sur la table des livres
CREATE TRIGGER checkCodeEditionISBN
BEFORE INSERT OR UPDATE ON bookbay.livres
FOR EACH ROW
EXECUTE FUNCTION verifCodeEditionISBN();
