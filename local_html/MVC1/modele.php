<?php
include_once 'connexion.php';

class Modele extends Connexion {
    public function __construct(){
    }

    public function getListe(){
        $sql = 'SELECT * FROM Joueur';
        $stmt = self::$bdd->prepare($sql);
        $stmt->execute();

        return $stmt->fetchAll(PDO::FETCH_ASSOC);
    }

    public function getDetails($id){
        $sql = 'SELECT description FROM Joueur WHERE id = :id';
        $stmt = self::$bdd->prepare($sql);
        $stmt->bindParam(':id', $id, PDO::PARAM_INT);
        $stmt->execute();
    
        return $stmt->fetch(PDO::FETCH_ASSOC);
    }
    
}


?>