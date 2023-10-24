<?php

class Vue {
    public function __construct() {
    }

    public function affiche_liste($tab) {
        echo '<a href="index.php?action=bienvenue">Bienvenue sur notre site</a><br><br>';

       
        echo '<tr><th><b>Nom des joueurs</b></th></tr><br>';

        foreach ($tab as $joueur) {
            echo '<table>';
            echo '<a href="index.php?action=details&id=' . $joueur['id'] . '">' . $joueur['nom'] . '</a><br>';
        }
        
    }

    public function menu(){
        echo '<a href="index.php?action=bienvenue">Bienvenue sur notre site</a><br><br>';
        echo "<a href='index.php?action=liste'> Liste des joueurs  </a> <br><br>";
    }

    public function affiche_details($details) {
        echo '<h1>Détails du joueur</h1>';
        echo '<p><b>Description</b> : ' . $details['description'] . '</p>';
    }
    
}


?>
