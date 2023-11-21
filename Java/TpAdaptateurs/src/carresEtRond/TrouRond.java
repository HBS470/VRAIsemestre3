package carresEtRond;

import java.util.ArrayList;

public class TrouRond {
	ArrayList<FormeRonde> l;
    private double rayon;

    public TrouRond(double r) {
        this.rayon = r;
        this.l= new ArrayList<FormeRonde>();
    }

    public double getRayon() {
        return rayon;
    }

    public boolean admet(FormeRonde p) {
    	return  (this.getRayon() >= p.getRayon());
    }
    
    public void inserer(FormeRonde p)  {
    	if(this.admet(p)) {
    		System.out.println("la FormeRonde " + p + " est ajoutée au reservoir");
    		l.add(p);
    	}
    	else {
    		System.out.println("la FormeRonde " + p + " ne peut  pas entrer, son rayon est trop grand : " + p.getRayon());
    	}
    }

	@Override
	public String toString() {
		return "TrouRond [rayon= " + rayon + "\n " + "l=" + l +   "]";
	}
    
}
