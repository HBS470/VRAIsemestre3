package SourceDepart;

/**
 * @author mariannesimonot
 */
public  class Enseignant {
    public static int compteur = 0;
    private int identifiant;
    private String nom;

    public Enseignant(String nom) {
	this.nom = nom;
	this.identifiant = compteur;
	compteur++;
    }

    public int getIdentifiant() {
	return identifiant;
    }

    public String getNom() {
	return nom;
    }

 
    public int compare(Enseignant e2) {
        return this.getNom().compareTo(e2.getNom());
    }

    public int compareNomPuisId(Enseignant e2){
        if (this.getNom().compareTo(e2.getNom()) == 0) {
            return this.getIdentifiant() - e2.getIdentifiant();
        }
        return this.getNom().compareTo(e2.getNom());
    }


    @Override
    public String toString() {
	return ( nom );
    }

}
