package SHIFUMIV1SansEnum;

import java.util.Scanner;

public class Coup {

    private String nom;

    public Coup(String s) throws PasCoup {
	if (s.equals("pierre") || s.equals("papier") || s.equals("ciseaux")) {
	    nom = s;
	} else
	    throw new PasCoup();
    }

    public boolean bat(Coup c) {
	return (this.nom.equals("ciseaux") && c.nom.equals("papier"))
		|| (this.nom.equals("papier") && c.nom.equals("pierre"))
		|| (this.nom.equals("pierre") && c.nom.equals("ciseaux"));
    }

    public String getNom() {
	return nom;
    }

    @Override
    public String toString() {
	return nom.toString();
    }

    public static Coup saisirCoup(Scanner sc) {
	System.out
	.println("quel coup choisissez vous ? : taper pierre, papier ou ciseaux ");
	try {
	    Coup coupChoisi = new Coup(sc.nextLine());
	    System.out.println("le coup choisi est " + coupChoisi);
	    return coupChoisi;
	} catch (PasCoup e) {
	    System.out.println("ceci n'est pas un coup possible");
	    return saisirCoup(sc);
	}
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Coup other = (Coup) obj;
	if (nom == null) {
	    if (other.nom != null)
		return false;
	} else if (!nom.equals(other.nom))
	    return false;
	return true;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nom == null) ? 0 : nom.hashCode());
	return result;
    }

}
