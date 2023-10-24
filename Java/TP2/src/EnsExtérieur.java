public class EnsExtérieur extends Enseignant {

    public EnsExtérieur(String nom, int heurefaite) throws PasEnseignant {
        super(nom, heurefaite);
    }

    public int hComp(){
        return getHeurefaite();
    }
}
