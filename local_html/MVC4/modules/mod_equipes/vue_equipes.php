<?php
require_once 'vue_generique.php';

class VueEquipes extends VueGenerique {
	public function liste ($tab_equipes) {
		?>
		<h1>Liste des joueurs</h1>
	<ul><?php
		foreach ($tab_equipes as $equipe) {
			?><li><a href="index.php?module=equipes&action=details&id=<?=$equipe["id"]?>"><?=$equipe["nom"]?></a></li><?php
		}
		?></ul><?php
	}
	
	public function details($details) {
        echo '<h2>Détails de l\'équipe</h2>';
        echo '<p>ID : ' . $details['id'] . '</p>';
        echo '<p>Nom : ' . $details['nom'] . '</p>';
        echo '<p>Année de création : ' . $details['annee_creation'] . '</p>';
        echo '<p>Description : ' . $details['bio'] . '</p>';
        echo '<p>Logo : ' . $details['logo'] . '</p>';
    }
	public function form_ajout() {
		echo '<li><a href="index.php?">Bienvenue</a></li>';
		echo '<h2>Ajouter une équipe</h2>';
		echo '<form method="post" enctype="multipart/form-data" action="index.php?module=equipes&action=ajout">';
		echo 'Nom : <input type="text" name="nom"><br>';
		echo 'Année de creation : <input type="number" min="1800" max="2024" name="annee"><br>';
		echo 'Bio : <textarea name="bio"></textarea><br>';
		echo 'Logo : <input type="file" name="logo"><br>';
		echo '<input type="submit" value="Ajouter">';
		echo '</form>';
	}



public function confirmAjout() {
	echo "Equipe bien ajoutée !";
}

public function erreurBD() {
	echo "Erreur lors de l'ajout/modification dans la BD";
}
}