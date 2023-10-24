
<?php
$bdd = new PDO('mysql:host=database-etudiants.iut.univ-paris8.fr;dbname=dutinfopw201676', 'dutinfopw201676', 'hutunyzu');
$sql =  'SELECT id,texte FROM tabletest';
foreach  ($bdd->query($sql) as $row) {
    print $row['id'] . "\t";
    print  $row['texte'] . "\t";
}
?>
