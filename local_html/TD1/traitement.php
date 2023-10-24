<!DOCTYPE html>
<html>
<head>
<title>Résultats formulaire</title>
</head>
 
<body>
<?php
echo "Bonjour, vous vous appelez : \n";
echo $nom = $_GET['nom'] . "\n";
echo "et vous êtes un(e) ";
echo $select = $_GET['select'] . "\n";
if (isset($_GET['check'])){
echo $check = "oui";
}
else{
echo $check = "non";
}
?>
</body>
 
</html