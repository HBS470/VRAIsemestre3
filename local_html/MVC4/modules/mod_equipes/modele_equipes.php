<?php
require_once 'modules/connexion.php';

class ModeleEquipes extends Connexion {
  
    public function getListe() {
        try {
            $query = self::$bdd->prepare("SELECT * FROM Equipe");
            $query->execute();
            $resultats = $query->fetchAll(PDO::FETCH_ASSOC);
            return $resultats;
        } catch (PDOException $e) {
            die('Erreur lors de la récupération des données : ' . $e->getMessage());
        }
    }
    public function ajouterEquipes($nom, $bio, $annee,$logo) {
        try {
            $sql = "INSERT INTO Equipe (nom, annee_creation,bio,logo) VALUES (:nom, :annee,:bio,:logo)";
            $stmt = self::$bdd->prepare($sql);
            $stmt->bindParam(':nom', $nom, PDO::PARAM_STR);
            $stmt->bindParam(':annee', $annee, PDO::PARAM_STR);
            $stmt->bindParam(':bio', $bio, PDO::PARAM_STR);
            $stmt->bindParam(':logo', $logo, PDO::PARAM_STR);
            return $stmt->execute(); // Exécute la requête d'insertion
         } catch (PDOException $e) {
             die('Erreur lors de l\'ajout du joueur : ' . $e->getMessage());
        }
       }

    public function getDetailsById($id) {
        try {
            $query = self::$bdd->prepare("SELECT * FROM Equipe WHERE id = :id");
            $query->bindParam(':id', $id, PDO::PARAM_INT);
            $query->execute();
            $detailsJoueur = $query->fetch(PDO::FETCH_ASSOC);
            return $detailsJoueur;
        } catch (PDOException $e) {
            die('Erreur lors de la récupération des détails du joueur : ' . $e->getMessage());
        }
    }

    public function insertLogo($id, $logo) {
        try {
            $sql = "UPDATE Equipe SET logo=:logo WHERE id=:id";
            $stmt = self::$bdd->prepare($sql);
            $stmt->bindParam(':nom', $nom, PDO::PARAM_STR);
            $stmt->bindParam(':logo', $logo, PDO::PARAM_STR);
            return $stmt->execute();
        }
        catch (PDOException $e){
            echo ("Erreur lors de la modif de logo !".$e->getMessage()."<br/>");
        }
    }

}
?>