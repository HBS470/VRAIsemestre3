package IterEnumEnonce;

import java.util.Enumeration;
import java.util.Iterator;

public class CatalogueNumerique {

	public void afficherLesProduitsPasCher(Catalogue c){
		Iterator<Produit> it = new AdaptateurEnumeration<Produit>(c.elements());

		while(it.hasNext()){
			Produit p = it.next();
			if (p.getPrix() < 10){
				System.out.println(p);
			}
		}
	}
}
