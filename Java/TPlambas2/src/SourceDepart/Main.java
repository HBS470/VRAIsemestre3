package SourceDepart;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Exercice 1
        Departement d = new Departement();
        Enseignant e = new Enseignant("Horeb");
        Enseignant e2 = new Enseignant("Simonot");
        Cours c1 = new Cours("Maths",e,Niveau.L2);
        Cours c2 = new Cours("JavaFX",e2,Niveau.L3);
        Cours c3 = new Cours("Java",e2,Niveau.L1);
        d.ajouter(c1);
        d.ajouter(c2);
        d.ajouter(c3);
        System.out.println("Les cours de L2 : " + d.selectionnerCours(c->c.getNiveau().equals(Niveau.L2)));
        System.out.println("Les cours de Simonot : " + d.selectionnerCours(c->c.getResponsable().equals(e2)));

        // Exercice 3

        Predicate<Cours> p = c -> c.getResponsable().getNom().equals("Horeb");
        Predicate<Cours> p2 = c -> c.getNiveau().equals(Niveau.L3);

        System.out.println("Les cours d'Horeb : " + d.selectionnerCours(p));
        System.out.println("Les cours de L3 : " + d.selectionnerCours(p2));

    }
}
