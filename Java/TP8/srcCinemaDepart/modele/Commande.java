package modele;

import CinemaExceptions.ErreurSalle;
import CinemaExceptions.ErreurSeanceEnCours;
import CinemaExceptions.NombrePlacesErreur;

public class Commande {

    private String nom;

    public Commande(String nom) {
        this.nom = nom;
    }

    public void executer() throws NombrePlacesErreur, ErreurSalle, ErreurSeanceEnCours {

    }

    public void undo() {

    }

    public String getNom() {
        return nom;
    }
}
