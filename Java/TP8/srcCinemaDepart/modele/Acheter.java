package modele;

import CinemaExceptions.ErreurSalle;
import CinemaExceptions.ErreurSeanceEnCours;
import CinemaExceptions.NombrePlacesErreur;

public class Acheter extends Commande {
    private int nbBillets;
    private int numSalle;
    private Cinema leCinema;

    public Acheter(int nbBillets, int numSalle,Cinema c) {
        super("Acheter");
        this.nbBillets = nbBillets;
        this.numSalle = numSalle;
        this.leCinema = c;
    }

    @Override
    public void executer() throws NombrePlacesErreur,ErreurSalle, ErreurSeanceEnCours{
        Salle s = leCinema.getSalle(numSalle);
        s.acheterSeanceEnCours(nbBillets);
    }

    @Override
    public void undo() {

    }

    @Override
    public String getNom() {
        return null;
    }
}
