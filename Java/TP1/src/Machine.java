package SHIFUMIV1SansEnum;

public class Machine extends Joueur {

    public Machine() {
	super("IA");
    }

    @Override
    public void choisitUnCoup() {
	String s = this.getCoupCourant().getNom();
	Coup suivant = null;
	try {
	    switch (s) {

	    case "ciseaux":
		suivant = new Coup("pierre");
		break;
	    case "pierre":
		suivant = new Coup("papier");
		break;
	    case "papier":
		suivant = new Coup("ciseaux");
		break;
	    default:
		break;
	    }
	} catch (PasCoup e) {
	    System.out.println("erreur impossible dans Machine::choisitUnCoup");
	}

	this.setCoupCourant(suivant);
    }

}
