package SHIFUMIV1SansEnum;

import java.util.Scanner;

public class Humain extends Joueur {

    public Humain(String nom) {
	super(nom);
    }

    @Override
    public void choisitUnCoup() {
	Scanner sc = new Scanner(System.in);
	this.setCoupCourant(Coup.saisirCoup(sc));
    }
}
