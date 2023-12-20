package SourceDepart;

import java.util.*;
import java.util.function.Predicate;

public class Departement {

    private ArrayList<Enseignant> enseignants;
    private Set<Cours> lesCours;



    public Departement() {
	enseignants = new ArrayList<Enseignant>();
	lesCours = new HashSet<Cours>();

    }

  
    public void ajouter(Enseignant e) {
	enseignants.add(e);
    }

    public Enseignant getEnseignant(int i) {
	return enseignants.get(i);
    }


    @Override
    public String toString() {
	return "Departement [enseignants=" + enseignants + "\n lesCours= \n"
		+ lesCours + "]";
    }

    
    public void ajouter(Cours c)  {
    	lesCours.add(c);
    }

    public Collection<String> lesIntitulesDeCours() {
        Set<String> lesIntitules = new HashSet<String>();
        for (Cours c : lesCours) {
            lesIntitules.add(c.getIntitule());
        }
        return lesIntitules;
    }

    public Collection<String> lesIntitulesDeCoursTrie() {
        SortedSet<String> lesIntitules = new TreeSet<String>((c1,c2) -> c1.compareTo(c2));
        for (Cours c : lesCours) {
            lesIntitules.add(c.getIntitule());
        }
        return lesIntitules;
    }

    public Collection<Cours> lesCoursParNiveauPuisNom() {
        SortedSet<Cours> lesCours = new TreeSet<Cours>((c1,c2) -> c1.compare(c2));
        lesCours.addAll(this.lesCours);
        return lesCours;
    }
  
    public Collection<Enseignant> NomsEnseignants() {
        SortedSet<Enseignant> noms = new TreeSet<Enseignant>((c1,c2) -> {
            if (c1.getNom().compareTo(c2.getNom()) == 0){
                return c2.getNom().compareTo(c1.getNom());
            }
            return c1.getNom().compareTo(c2.getNom());
        });
        noms.addAll(this.enseignants);
        return noms;
    }
  
 
   
}
