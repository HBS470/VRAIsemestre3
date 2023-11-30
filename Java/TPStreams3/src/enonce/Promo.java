package enonce;

import java.util.List;

public class Promo {
    private String nom;
    private List<Etudiant> etudiants;

    public Promo(String n,List<Etudiant> e) {
        this.nom = n;
        this.etudiants = e;
    }

    public String getNom(){
        return nom;
    }

    public String lesNomsDesEtudiantsRecus(Module m){
        return etudiants.stream().filter(e -> e.getNotes().getVal() >= 10 && t -> t.getNotes().getModule() == m).map(z->z.getNom()).get();
    }

    public String nomMajorS1(){
        
    }
}