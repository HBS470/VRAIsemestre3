package SourceDepart;

import java.util.ArrayList;
import java.util.function.Predicate;


public class Departement {

    private ArrayList<Enseignant> enseignants;
    private ArrayList<Cours> lesCours;



    public Departement() {
	enseignants = new ArrayList<Enseignant>();
	 lesCours = new ArrayList<Cours>();

    }

  
    public void ajouter(Enseignant e) {
	enseignants.add(e);
    }

    public Enseignant getEnseignant(int i) {
	return enseignants.get(i);
    }

	public ArrayList<Cours> selectionnerCours(Predicate<Cours> p) {
		ArrayList<Cours> res = new ArrayList<Cours>();
		for (Cours c : lesCours) {
			if (p.test(c)) {
				res.add(c);
			}
		}
		return res ;
	}

    @Override
    public String toString() {
	return "Departement [enseignants=" + enseignants + "\n lesCours= \n"
		+ lesCours + "]";
    }

    
    public void ajouter(Cours c)  {
    	boolean dejaLa=false;
    	for (Cours leCours : lesCours) {
    		if (leCours.equals(c)) {
    			dejaLa=true;
    		}
    	}
    	if(!dejaLa)
    		lesCours.add(c);
    }

 
  

  
 
   
}
