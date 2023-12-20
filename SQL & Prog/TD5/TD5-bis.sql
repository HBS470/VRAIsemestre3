\set AUTOCOMMIT off
\echo :AUTOCOMMIT
-- Question 1
-- Session A
SELECT * FROM infos;
INSERT INTO lecteur(nom) VALUES ('Horeb');
UPDATE livre SET lecteur_id = (SELECT max(num_lecteur) from lecteur)  WHERE num_livre = 6;

-- Question 2 
-- Session B
SELECT * FROM infos;
/* L'emprunt du livre n'apparaît pas */

-- 3 
-- Session A 
COM
MIT;
-- Session B
SELECT * FROM infos;
/* L'emprunt du livre apparait */

-- 4 
-- Session A
INSERT INTO lecteur(nom) VALUES ('Cacahuete');
INSERT INTO lecteur(nom) VALUES ('Peanut');

-- 5 
-- Session B
SELECT * FROM lecteur ;
/*Les nouveaux lecteurs n'apparaissent pas*/

-- 6
-- Session A
ROLLBACK;
/*Les nouveaux lecteurs ont disparus de la session A 
et ne sont toujours pas dans la session B*/

-- 7
/* On a testé le A (Atomicity) et le I (Isolation) de ACID 
    A : avec le ROLLBACK qui fait revenir à l'ancien état de la BD
    B : avec la session B qui ne voit pas les modifis que fait la session A
*/

-- 8
/* Comme il y a eu le COMMIT (ce qui enregistre les modifs), ce sera POCKET */

-- 9
/* Comme il y a eu le COMMIT , ce sera 17 */

-- 10
-- Session A
SELECT nom FROM lecteur WHERE num_lecteur=1;

-- Session B
UPDATE lecteur SET nom ='toto' WHERE num_lecteur=1;
COMMIT;

-- Session A
SELECT nom FROM lecteur WHERE num_lecteur=1;

/* Le nom n'a pas changé pour la session A */

-- 11 
-- Session A
COMMIT;
SELECT nom FROM lecteur WHERE num_lecteur=1;
/* le nombre de lecteur a été incrémenté */


-- Session A
ROLLBACK;
SET TRANSACTION ISOLATION LEVEL SERIALIZABLE ;

-- 12
-- Session A 
SELECT count(*) FROM LECTEUR;

-- Session B 
INSERT INTO lecteur(nom) VALUES ('Tilly');
/* Le nombre de lecteur ne change pas dans la session A */

-- 13
-- Session A
COMMIT;
/* Le nombre de lecteur a été incrémenté */

-- 14
/* La session A en mode SERIALIZABLE donc ce sera Folio */

-- 15
/* La session A en mode SERIALIZABLE donc ce sera 15 */

-- 16 
/* Le fantôme est le fait qu'une ligne apparaisse ou disparaisse 
dans une transaction en raison d'une autre transaction vérifiée */  

-- 17
/* READ COMMITTED permet de voir directement les modifs validées dans d'autres transactions */

-- 18
/* 
Lorsque vous souhaitez effectuer un calcul sans interférence externe 
qui ne nécessite aucune modification lors de l'exécution 
de toutes les requêtes programmées dans la transaction.
*/
-- 19
/* 
READ COMMITED : Impossible possible possible
SERIALIZABLE : Impossible Impossible Impossible