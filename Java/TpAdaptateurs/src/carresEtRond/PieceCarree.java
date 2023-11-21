package carresEtRond;

public class PieceCarree {
	private double cote;
	private String couleur;

	public PieceCarree(double d, String c) {
		this.cote = d;
		this.couleur=c;
	}

	public double getCote() {
		return cote;
	}
	public String getCouleur() {
		return this.couleur;
	}

	@Override
	public String toString() {
		return "PieceCarree [cote=" + cote + ", couleur=" + couleur + "]";
	}


}
