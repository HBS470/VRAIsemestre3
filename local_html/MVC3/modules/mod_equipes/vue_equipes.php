<?php
require_once 'vue_generique.php';

class VueEquipes extends VueGenerique {
	public function liste ($tab_equipes) {
		echo '<li><a href="index.php?">Bienvenue</a></li>';
		?>
		<h1>Liste des joueurs</h1>
	<ul><?php
		foreach ($tab_equipes as $equipe) {
			?><li><a href="index.php?module=equipes&action=details&id=<?=$equipe["id"]?>"><?=$equipe["nom"]?></a></li><?php
		}
		?></ul><?php
	}
	
	public function details($details) {
        echo '<li><a href="index.php?">Bienvenue</a></li>';
        echo '<h2>Détails de l\'équipe</h2>';
        echo '<p>ID : ' . $details['id'] . '</p>';
        echo '<p>Nom : ' . $details['nom'] . '</p>';
        echo '<p>Année de création : ' . $details['annee_creation'] . '</p>';
        echo '<p>Description : ' . $details['description'] . '</p>';
        //echo '<p>Pays : ' . $details['pays'] . '</p>';
        echo '<p>Logo : ' . $details['logo'] . '</p>';
    }


	public function menu () {
		//Menu global
?>
			<ul>
			 <li><a href="index.php?">Bienvenue</a></li>
			 <li><a href="index.php?module=joueurs&action=liste">Liste des joueurs</a></li>
			 <li><a href="index.php?module=equipes&action=liste">Liste des équipes</a></li>
			<?php
			if (isset($_SESSION['utilisateur'])) {
				echo '<li>Vous êtes déjà connecté sous l\'identifiant "' . $_SESSION['utilisateur'] . '"</li>';
				echo '<li><a href="index.php?module=connexion&action=deconnexion">Déconnexion</a></li>';
			} else {
				echo '<li><a href="index.php?module=connexion&action=inscription">Inscription</a></li>';
				echo '<li><a href="index.php?module=connexion&action=connexion">Connexion</a></li>';
			}
			?>
			</ul>
<?php

		//Menu spécifique au module
?>
<?php

}
}