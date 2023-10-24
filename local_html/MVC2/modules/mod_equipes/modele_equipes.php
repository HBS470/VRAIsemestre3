<?php

class ModeleEquipes extends Connexion{
	
	public function get_liste () {
		$req = "SELECT * FROM Equipe";
		$pdo_req = self::$bdd->query($req);
		return $pdo_req->fetchAll();
	}
	
	public function get_details ($id) {
		$req = "SELECT * FROM Equipe WHERE id = :id";
		$pdo_req = self::$bdd->prepare($req);
		$pdo_req->bindParam("id", $id, PDO::PARAM_INT);
		$pdo_req->execute();
		return $pdo_req->fetch();
	}
	
	
	
	
}
