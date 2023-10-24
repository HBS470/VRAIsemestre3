-- TD2

-- Fonctions

-- Exercice 1

-- 1
DROP FUNCTION IF EXISTS compter1(smallint);

CREATE FUNCTION compter1 (grade employe.grade_emp%type) RETURNS INT AS $$
DECLARE nbemp INT;
BEGIN
    SELECT COUNT(*) INTO nbemp FROM employe WHERE grade = grade_emp;
    RETURN nbemp;
END;
$$ LANGUAGE PLpgSQL;

-- 2 
DROP FUNCTION IF EXISTS compter2(int);

CREATE FUNCTION compter2(in grade int, out nbemp int) RETURNS INT as $$
BEGIN
    nbemp = COUNT(*) FROM employe WHERE grade = grade_emp;
END;
$$ LANGUAGE PLpgSQL;

-- 3
DROP FUNCTION IF EXISTS moyenne();

CREATE FUNCTION moyenne() RETURNS TABLE
                          (id_emp int, 
                          grade_emp smallint, 
                          salaire_moyen numeric(10, 2)) AS $$
BEGIN
    RETURN QUERY
    SELECT e.id_emp, e.grade_emp, ROUND(AVG(e2.salaire_emp), 2)
    FROM employe e INNER JOIN employe e2 ON e.grade_emp = e2.grade_emp
    GROUP BY e.id_emp, e.grade_emp
    ORDER BY id_emp;
END;
$$ LANGUAGE plpgsql;


-- Exercice 2 

-- 1 
CREATE OR REPLACE FUNCTION implicite(grade int) RETURNS setof employe AS $$
DECLARE e employe;
BEGIN
    FOR e IN SELECT grade_emp, nom_emp FROM employe WHERE grade = grade_emp LOOP
    RETURN NEXT e;
    END LOOP;
RETURN;
END;
$$ LANGUAGE PLpgSQL

-- 2
CREATE OR REPLACE FUNCTION fct_curs1() RETURNS INT AS $$
DECLARE nbEmp int;
BEGIN
    
