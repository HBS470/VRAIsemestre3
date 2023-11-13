package modele;

import CinemaExceptions.CinemaException;
import CinemaExceptions.ErreurSalle;
import CinemaExceptions.ErreurSeanceEnCours;
import CinemaExceptions.NombrePlacesErreur;

public class Commande {

    private String nom;

    public Commande(String nom) {
        this.nom = nom;
    }

    public Commande() {
    }

    public void executer() throws CinemaException {

    }

    public void undo() {

    }

    public String getNom() {
        return nom;
    }
}
