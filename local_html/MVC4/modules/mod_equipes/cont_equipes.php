<?php
require_once 'modele_equipes.php';
require_once 'vue_equipes.php';

class ContEquipes {
    public $vue_equipes;
    public $modele_equipes;
    private $action;

    public function __construct() {
        $this->vue_equipes = new VueEquipes();
        $this->modele_equipes = new ModeleEquipes();
        $this->action = isset($_GET['action']) ? $_GET['action'] : 'bienvenue';
    }

    public function liste() {
        $donnees = $this->modele_equipes->getListe();
        $this->vue_equipes->liste($donnees);
    }

    public function bienvenue() {
        $this->vue_equipes->menu($this->action); // Affiche le menu pour l'action 
        echo "<h1>Bienvenue sur notre site !</h1>";
    }

    private function form_ajout () {
        $this->vue_equipes->form_ajout();
    }

    public function details() {
        $id = isset($_GET['id']) ? $_GET['id'] : null;

        if ($id !== null) {
            $detailsJoueur = $this->modele_equipes->getDetailsById($id);
            $this->vue_equipes->details($detailsJoueur);
        } else {
            // Gérer le cas où l'ID n'est pas spécifié
            echo "ID du joueur non spécifié.";
        }
    }
    private function ajout () {
        $donnees = $this->modele_equipes->getListe();

        $nom = isset ($_POST["nom"]) ? $_POST["nom"] : die("Nom manquant");
        $bio = isset ($_POST["bio"]) ? $_POST["bio"] : die("Bio manquant");
        $annee = isset ($_POST["annee"]) ? $_POST["annee"] : die("Année manquant");
        var_dump($_FILES);
        $logo = isset ($_FILES["logo"]) ? $_FILES["logo"] : die("Logo manquant");

        $nomfichier = $_FILES["logo"]["name"];
        $tmpname = $_FILES["logo"]["tmp_name"];

        $ext = pathinfo($nomfichier, PATHINFO_EXTENSION);
        $newfilename = "equipe_" . $donnees["id"] . "." . $ext;
        $destination = "logos/" . $newfilename;

        if(move_uploaded_file($nomfichier,$destination)){
            $this->modele_equipes->insertLogo($donnees["id"],$destination);
        }
        else{
            echo "Erreur lors de l'envoi du fichier";
        }

        if ($this->modele_equipes->ajouterEquipes($nom, $bio,$annee,$logo)) {
            $this->vue_equipes->confirmAjout();
        }
        else {
            $this->vue_equipes->erreurBD();
        }
    }

    public function exec() {
        switch ($this->action) {
            case 'bienvenue':
                $this->bienvenue();
                break;
            case 'liste':
                $this->liste();
                break;
            case 'form_ajout' :
                $this->form_ajout();
            case 'ajout' :
                $this->ajout();    
            case 'details':
                $this->details();
                break;
            default:
                // Action par défaut si l'action n'est pas reconnue
                $this->bienvenue();
                break;
        }
    }
}
?>