<?php
$bdd = new PDO('mysql:host=database-etudiants.iut.univ-paris8.fr;dbname=dutinfopw201676', 'dutinfopw201676', 'hutunyzu');
$sql = 'SELECT texte FROM tabletest';
$stmt = $bdd->prepare($sql);
$stmt->execute();

echo $stmt;

?>
