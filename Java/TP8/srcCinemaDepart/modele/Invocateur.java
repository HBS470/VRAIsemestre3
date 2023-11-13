package modele;

import CinemaExceptions.CinemaException;

import java.util.ArrayList;
import java.util.Stack;

public class Invocateur {
    private ArrayList<Commande> commandes;


    public Invocateur() {
        this.commandes = new ArrayList<>();
    }

    public void enregistrer(Commande commande) throws CinemaException {
        commandes.add(commande);
        commande.executer();
    }

    public void undo(){

    }

    @Override
    public String toString() {
        return "Invocateur{" +
                "commandes=" + commandes +
                '}';
    }
}
