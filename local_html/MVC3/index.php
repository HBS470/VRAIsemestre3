<!DOCTYPE html>
<html>
	<head>
		<meta charset= "UTF-8" />
		<title>Site PHP</title>

	</head>
    <header>
        <h1 style="text-align:center">
            Site PHP
        </h1>
    </header>

	<body>
<?php
require_once 'modules/connexion.php';
Connexion::initConnexion();


if (isset($_GET['module'])) {
    $module = $_GET['module'];

    switch ($module) {
        case 'joueurs':
            require_once 'modules/mod_joueurs/mod_joueurs.php';
            new ModJoueurs();
            $moduleAffichage = (new VueJoueurs())->getAffichage();
            echo $moduleAffichage;
            break;
        case 'equipes':
            require_once 'modules/mod_equipes/mod_equipes.php';
            new ModEquipes();
            $moduleAffichage = (new VueEquipes())->getAffichage();
            echo $moduleAffichage;
            break;
        case 'connexion':
            require_once 'modules/mod_connexion/mod_connexion.php';
            new ModConnexion();
            $moduleAffichage = (new VueConnexion())->getAffichage();
            echo $moduleAffichage;
            break;   
        default:
        
            break;
    }
} 

else {
    echo '<ul>';
        echo '<li><a href="index.php?">Bienvenue</a></li>';
        echo '<li><a href="index.php?module=joueurs&action=liste">Liste des joueurs</a></li>';
        echo '<li><a href="index.php?module=equipes&action=liste">Liste des équipes</a></li>';
        if (isset($_SESSION['utilisateur'])) {
            echo '<li>Vous êtes déjà connecté sous l\'identifiant "' . $_SESSION['utilisateur'] . '"</li>';
            echo '<li><a href="index.php?module=connexion&action=deconnexion">Déconnexion</a></li><br><br>';
        } else {
            echo '<li><a href="index.php?module=connexion&action=inscription">Inscription</a></li>';
            echo '<li><a href="index.php?module=connexion&action=connexion">Connexion</a></li>';
        }
        echo'</ul>';
        echo "<h1 style='text-align:center'>Bienvenue sur notre site !</h1>";

}


?>

	</body>
    <footer>
        Coordonnées de contact : hsilva@iut.univ-paris8.fr<br>
        Mentions légales 
    </footer>
</html>


