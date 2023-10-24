
public abstract class Enseignant{
  private int id;
  private String nom;
  private int heurefaite;
  private int compteur = 1;

  public Enseignant(String nom, int heurefaite) throws PasEnseignant {
    if (heurefaite >= 0) {
      this.id = compteur;
      this.nom = nom;
      this.heurefaite = heurefaite;
      compteur++;
    }
    else {
      throw new PasEnseignant();
    }
  }

  public void ajouterHeure(int n) throws Exception {
    if (n > 0) {
      this.heurefaite += n;
    }
    else {

      throw new Exception();
    }
  }

  public int getHeurefaite() {
    return heurefaite;
  }

  public abstract int hComp();

  public int retributionHcomp(){
    return hComp()*40;
  }

  @Override
  public String toString() {
    return "Enseignant{" +
            "id=" + id +
            ", nom='" + nom + '\'' +
            ", heurefaite=" + heurefaite +
            '}';
  }

  public int getId() {
    return id;
  }

  public String getNom() {
    return nom;
  }
}

