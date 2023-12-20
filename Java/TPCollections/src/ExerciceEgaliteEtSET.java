
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExerciceEgaliteEtSET {

    public static void main(String[] args) {

	// ******************************************************
	// enlever les commentaires pour section 1 , exercice 1
	// *****************************************************

	Adresse a1, a2, a3, a4, a5;
	a1 = new Adresse(34, "bd Magenta", "Paris", "France");
	a2 = new Adresse(34, "bd Magenta", "Cahors", "France");
	a3 = new Adresse(12, "rue boule", "Marseille", "France");
	a4 = new Adresse(34, "bd Magenta", "Paris", "USA");
	a5 = new Adresse(34, "bd Magenta", "Paris", "France");

	System.out.println(" a1 est il egal a a2 ? :" + a1.equals(a2));
	System.out.println(" a1 est il egal a a3 ? :" + a1.equals(a3));
	System.out.println(" a1 est il egal a a4 ? :" + a1.equals(a4));
	System.out.println(" a1 est il egal a a5 ? :" + a1.equals(a5));
	System.out.println(" a1 est il egal a a1 ? :" + a1.equals(a1));
		System.out.println();
	// *****************************************************************
	// enlever les commentaires pour section 1 , exercice 2 question 3
	// *****************************************************************

	 Personne p1 = new Personne("Dupont", "antoine", a1);
	 Personne p2 = new Personne("Durand", "marie", a2);
	 Personne p3 = new Personne("Dupond", "leo", a1);
	 Personne p4 = new Personne("Dupont", "antoine", a1);
	 Personne p5 = new Personne("Dupont", "antoine", a5);

	 System.out.println(" p1 est il egal a p2 ? :" + p1.equals(p2));
	 System.out.println(" p1 est il egal a p3 ? :" + p1.equals(p3));
	 System.out.println(" p1 est il egal a p4 ? :" + p1.equals(p4));
	 System.out.println(" p1 est il egal a p5 ? :" + p1.equals(p5));
	 System.out.println(" p1 est il egal a p1 ? :" + p1.equals(p1));
	// *****************************************************************
	// enlever les commentaires pour Section 2 (Set) exercice 1, 2 et 3)
	// *****************************************************************

		ArrayList<Adresse> la = new ArrayList<>();
		la .add(a1);
		la .add(a2);
		la .add(a3);
		la .add(a4);
		System.out.println("contains : " + la.contains(a5));
		System.out.println();
		/*
		* Renvoie true car a1 et a5 sont égales avec la méthode equals implementée
		* Renvoie false car a1 et a5 ne sont pas égales avec la methode equals de base*/

	 System.out.println("set 1**********************");
	 Set<Adresse> carnet = new HashSet<>();
	 System.out.println(carnet.add(a1));
	 System.out.println(carnet.add(a2));
	 System.out.println(carnet.add(a3));
	 System.out.println(carnet.add(a4));
	 System.out.println(carnet.add(a5));
	 System.out.println(carnet.add(a1));

	 System.out.println(carnet);
	 // Il n'y a pas de doublons dans un set donc les deux dernières lignes ne sont pas ajoutées

	 Set<Personne> carnet2 = new HashSet<>();
	 System.out.println("egal p1 p2 : " + p1.equals(p2));
	 System.out.println(carnet2.add(p1));
	 System.out.println(carnet2.add(p2));
	 System.out.println(carnet2.add(p3));
	 System.out.println(carnet2.add(p4));

	 System.out.println(carnet2);

    }

	/* 1) Savoir définir l’ ́egalit́e dans une classe (equals) */

	// Exercice 1
	// 1
	/* Les variables considérées comme égales sont les variables qui ont la même adresse mémoire.*/

	// 2
	/* Non */

	// 3
	/* a1 et a5 */

	// Exercice 2
	/* a et d */


	/* 2) La structure de données Set */

	// Exercice 1
	// Il n'y a pas de doublons dans un set donc les deux dernières lignes ne sont pas ajoutées

	// Exercice 2
	/* La méthode hascode est reliée à la méthode equals car elle permet de vérifier si deux objets sont égaux.
	* donc si on l'enleve aucun objet ne sont égaux */



}
