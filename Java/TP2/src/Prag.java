public class Prag extends EnsTitulaire {
    public Prag(String nom, int heurefaite) throws PasEnseignant {
        super(nom, heurefaite, 384);
    }

    public int hComp(){
        if (getHeurefaite() >= getServiceStatutaire()){
            return getHeurefaite() - getServiceStatutaire();
        }
        return 0;

    }
}
