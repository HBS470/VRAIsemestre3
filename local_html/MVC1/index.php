<?php
include_once 'modele.php';
include_once 'vue.php';
include_once 'controleur.php';
include_once 'connexion.php';

Connexion :: initConnexion();
$controleur = new Controleur();
$controleur->exec();
?>