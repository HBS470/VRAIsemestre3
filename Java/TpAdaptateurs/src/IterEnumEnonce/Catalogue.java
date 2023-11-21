package IterEnumEnonce;

import java.util.Enumeration;
import java.util.Vector;

/*
 * C'est le vieux catalogue, qui contient 
 * tous les produits de l'entreprise et qu'on n'a pas
 *  le droit de modifier...
 */
public class Catalogue {
	private Vector<Produit> produits;
	
	
	public Catalogue() {
		produits = new Vector<Produit>();
	}

	public Enumeration<Produit> elements(){
		return produits.elements();
	}
	
	public void ajouter(Produit p) {
		produits.add(p);
	}
	
	
	

}
