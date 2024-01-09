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
  
    public Collection<Enseignant> nomsEnseignants() {
        SortedSet<Enseignant> noms = new TreeSet<Enseignant>((c1,c2) -> c1.compare(c2));
        noms.addAll(this.enseignants);
        return noms;
    }

    public Collection<Enseignant> lesResponsables() {
        Set<Enseignant> lesIntitules = new HashSet<Enseignant>();
        for (Cours c : lesCours) {
            lesIntitules.add(c.getResponsable());
        }
        return lesIntitules;
    }

    public Collection<String> lesNomsCoursDeEnseignant(String nom) {
        Set<String> lesIntitules = new HashSet<String>();
        for (Cours c : lesCours) {
            if (c.getResponsable().getNom().equals(nom)) {
                lesIntitules.add(c.getIntitule());
            }
        }
        return lesIntitules;
    }

    public Collection<Enseignant> lesResponsablesL2NomPuisIdentifiant(){
        SortedSet<Enseignant> responsables = new TreeSet<Enseignant>((c1,c2) -> c1.compareNomPuisId(c2));
        for (Cours c : lesCours) {
            if (c.getNiveau() == Niveau.L2) {
                responsables.add(c.getResponsable());
            }
        }
        return responsables;
    }

    public int nbreResponsable(){
       return lesResponsables().size();
    }

    public Collection<Enseignant> enseignantsSansHeuresCompTrieHeuresFaitesPuisNom(){

    }

    }

