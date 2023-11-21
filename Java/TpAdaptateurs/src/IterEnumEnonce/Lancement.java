package IterEnumEnonce;

import java.util.*;

public class Lancement {
	public static void main (String args[]) {
		Vector<String> v = new Vector<String>(Arrays.asList("bonjour", "comment", "ca" ,"va ?"));
		Iterator<String> iterator = new AdaptateurEnumeration<String>(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Catalogue ca= new Catalogue();
		ca.ajouter(new Produit("yaourt", 3));
		ca.ajouter(new Produit("caviar", 50));
		ca.ajouter(new Produit("baguette", 1));

		CatalogueNumerique cn= new CatalogueNumerique();
		cn.afficherLesProduitsPasCher(ca);



	}

}
