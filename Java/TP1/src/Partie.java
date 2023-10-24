package SHIFUMIV1SansEnum;

/**
 * @author mariannesimonot
 */
public class Partie {

    private Joueur joueur1;

    private Joueur joueur2;
    private int nbToursMax;

    public Partie(Joueur j, Joueur k, int nbToursMax) {
	joueur1 = j;
	joueur2 = k;
	this.nbToursMax = nbToursMax;
    }

    public void go() {
	int nbtours = 0;
	while (nbtours < nbToursMax) {
	    this.unTour();
	    nbtours++;
	}
	System.out.println("fini ");

    }

    public void unTour() {
	System.out.println(" " + joueur1 + " et " + joueur2);
	joueur1.choisitUnCoup();
	joueur2.choisitUnCoup();
	System.out.print(joueur1.getNom() + " joue " + joueur1.getCoupCourant()
		+ " et ");
	System.out.println(joueur2.getNom() + " joue "
		+ joueur2.getCoupCourant());
	this.resoudreTour();

    }

    public void resoudreTour() {
	if (joueur1.getCoupCourant().bat(joueur2.getCoupCourant())) {
	    joueur1.marquePoint(2);
	} else if (joueur2.getCoupCourant().bat(joueur1.getCoupCourant())) {
	    joueur2.marquePoint(2);
	} else {
	    joueur1.marquePoint(1);
	    joueur2.marquePoint(1);
	}
    }

}
