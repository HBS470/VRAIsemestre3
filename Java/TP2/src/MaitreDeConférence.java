public class MaitreDeConférence extends EnsTitulaire {
    public MaitreDeConférence(String nom, int heurefaite) throws PasEnseignant {
        super(nom, heurefaite, 192);
    }

    public int hComp(){
        int heures = 0;
        if (getHeurefaite() >= getServiceStatutaire()){
            heures++;
        }
        return heures;
    }
}
