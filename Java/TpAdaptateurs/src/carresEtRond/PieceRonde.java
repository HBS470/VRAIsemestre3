package carresEtRond;

public class PieceRonde implements FormeRonde{
	private double rayon;
	private String couleur;
	
	public PieceRonde(double rayon, String couleur) {
		this.rayon = rayon;
		this.couleur=couleur;
	}
	
	public PieceRonde() {
		this.rayon=0;
	}
	
	@Override
	public String getCouleur() {
		return this.couleur;
	}
	@Override
	public double getRayon() {
		return this.rayon;
	}

	@Override
	public String toString() {
		return "PieceRonde [rayon=" + rayon + ", couleur=" + couleur + "]";
	}




}
