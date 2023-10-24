package SHIFUMIV1SansEnum;

/**
 * @author mariannesimonot
 */
public abstract class Joueur {
    private String nom;
    private int score;
    private Coup coupCourant;

    public Joueur(String nom) {
	this.score = 0;
	this.nom = nom;
	try {
	    this.coupCourant = new Coup("pierre");
	} catch (PasCoup e) {
	    System.out.println("erreur impossible dans Joueur()");
	}
    }

    public Coup getCoupCourant() {
	return coupCourant;
    }

    public void setCoupCourant(Coup coupCourant) {
	this.coupCourant = coupCourant;
    }

    public String getNom() {
	return nom;
    }

    public abstract void choisitUnCoup();

    public int getScore() {
	return score;
    }

    @Override
    public String toString() {
	return (this.getNom() + "  score : " + this.score + " ");
    }

    public void marquePoint(int i) {
	score = score + i;

    }

    public void setScore(int i) {
	score = i;

    }
}
