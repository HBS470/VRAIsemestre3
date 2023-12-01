package enonce;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    public List<String> lesNomsDesEtudiantsRecus(Module m){
        return etudiants.stream().filter(e -> e.note(m) >= 10).map(s-> s.getNom()).collect(Collectors.toList());
    }

    // Si l'étudiant n'a pas de note en S1, ça retourne son nom
    public String nomMajorS1(){
        Etudiant meilleur = etudiants.stream().reduce((note1, note2) -> note1.moyenne(Niveau.S1) > note2.moyenne(Niveau.S1) ? note1 : note2).get();
        return meilleur.getNom();
    }
}