import java.util.ArrayList;
import java.util.Scanner;

public class Établissement {
    private final Scanner SC = new Scanner(System.in).useDelimiter("\n");
    private String nom;
    private ArrayList<Enseignant> enseignants;
    private int heuresComplémentaires;
    private int sommeDesHeuresComps;

    public Établissement(String nom) {
        this.nom = nom;
        enseignants = new ArrayList<>();
        heuresComplémentaires = 0;
        sommeDesHeuresComps = 0;
    }

    public void ajouterEnseignant(Enseignant e){
        enseignants.add(e);
    }

    public void ajouterHeures() throws Exception {
        int heures;
        for (Enseignant prof : enseignants){
            System.out.println("Combien d'heures effectuera " + prof.getNom() + " ? : ");
            heures = SC.nextInt();
            while (heures < 0) {
                System.out.println("Les heures ne peuvent pas être négatives ! Veuillez réessayer : ");
                heures = SC.nextInt();
            }
                prof.ajouterHeure(heures);
        }
        for (Enseignant e : enseignants){
            System.out.println("L'enseignant " + e.getNom() + " doit effectuer " + e.getHeurefaite() + " heures.");
        }
    }

    public void getNomEnseignant(){
        for (Enseignant e : enseignants){
            System.out.println(e.getNom());
        }
    }

    public void pasHeuresComp(){
        for (Enseignant e : enseignants){
            if (e.hComp() == 0 ) {
                System.out.println(e.getNom());
            }
        }
    }

    public void plusDeNheuresComp(int h){
        boolean heure = false;
        for (Enseignant e : enseignants){
            if (e.hComp() > h){
                heure = true;
            }
        }
        System.out.println(heure);
    }

    @Override
    public String toString() {
        for (Enseignant e : enseignants) {
            return e.getNom() + " { Catégorie : " +""+  " Heures effectuées : " + e.getHeurefaite()
                    + " Heures complémentaires :  " + e.hComp() + " }";
        }
        return null;
    }

}
