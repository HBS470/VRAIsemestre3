package modele;

import java.util.ArrayList;

public class Invocateur {
    private ArrayList<Commande> commandes;

    public Invocateur(ArrayList<Commande> commandes) {
        this.commandes = commandes;
    }

    public void enregistrer(Commande commande) {
        commandes.add(commande);
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
