<?php
include_once 'modele.php';
include_once 'vue.php';
include_once 'controleur.php';

class Connexion {
    protected static $bdd;

    public function __construct(){

    }

    public static function initConnexion(){
        self::$bdd = new PDO('mysql:host=database-etudiants.iut.univ-paris8.fr;dbname=dutinfopw201676', 'dutinfopw201676', 'hutunyzu');
    } 


}




?>