import java.util.Objects;

public class Adresse {
    private int numeroRue;
    private String rue, ville, pays;

    public Adresse(int numeroRue, String rue, String ville, String pays) {
	super();
	this.numeroRue = numeroRue;
	this.rue = rue;
	this.ville = ville;
	this.pays = pays;
    }

    // @Override
    @Override
    public String toString() {
	return numeroRue + " " + rue + " , " + ville + " , " + pays + "\n";
    }

    public int getNumeroRue() {
	return numeroRue;
    }

    public String getRue() {
	return rue;
    }

    public String getVille() {
	return ville;
    }

    public String getPays() {
	return pays;
    }

//    public boolean equals(Object o) {
//        if (this.getNumeroRue() == ((Adresse) o).getNumeroRue() &&
//                this.getRue() == ((Adresse) o).getRue() &&
//                this.getVille() == ((Adresse) o).getVille() &&
//                this.getPays() == ((Adresse) o).getPays()) {
//            return true;
//        } else {
//            return false;
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return numeroRue == adresse.numeroRue && Objects.equals(rue, adresse.rue) && Objects.equals(ville, adresse.ville) && Objects.equals(pays, adresse.pays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroRue, rue, ville, pays);
    }
}
