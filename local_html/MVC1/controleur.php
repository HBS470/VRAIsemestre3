<?php
include_once 'modele.php';
include_once 'vue.php';

class Controleur {
    private $modele;
    private $vue;
    private $action;

    public function __construct(){
        $this-> modele = new Modele();
        $this-> vue = new Vue();
        $this-> action = isset($_GET['action']) ? $_GET['action'] : 'bienvenue';
    }

    public function liste(){
        $tab = $this->modele->getListe();
        $this-> vue->affiche_liste($tab);
    }

    public function exec(){
        switch($this->action){
            case 'Bienvenue' :
                $this->bienvenue();
                break;
            case 'liste' :
                $this->liste();
                break;
            case 'details' :
                $this->details();
            default :
                $this->vue->menu();  
        }
    }

    public function bienvenue(){
        echo 'Bienvenue';
    }

    public function details(){
        $id = isset($_GET['id']) ? $_GET['id'] : null;

        if ($id !== null){
            $details = $this->modele->getDetails($id);

            if($details !== null){
                $this->vue->affiche_details($details);
            }
            else {
                echo'Joueur inexistant';
            }
        }
        else{
            echo 'ID introuvable';
        }
    }

}


?>