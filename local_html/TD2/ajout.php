<?php
// Exercice 3.1
/*
$bdd = new PDO('mysql:host=database-etudiants.iut.univ-paris8.fr;dbname=dutinfopw201676', 'dutinfopw201676', 'hutunyzu');
$sql = 'INSERT INTO tabletest (texte) VALUES (?)';
$stmt = $bdd->prepare($sql);
$texte = $_GET['texte'];
$stmt->execute([$texte]);
*/

//Exercice 3.2

$bdd = new PDO('mysql:host=database-etudiants.iut.univ-paris8.fr;dbname=dutinfopw201676', 'dutinfopw201676', 'hutunyzu');
$sql = 'INSERT INTO tabletest (texte) VALUES (:texte)';
$stmt = $bdd->prepare($sql,[PDO::ATTR_CURSOR => PDO::CURSOR_FWDONLY]);
$texte = $_GET['texte'];
$stmt->execute(['texte'=> $texte]);
?>