public abstract class EnsTitulaire extends Enseignant {

    private int serviceStatutaire;

    public EnsTitulaire(String nom, int heurefaite, int serviceStatutaire) throws PasEnseignant {
        super(nom, heurefaite);
        this.serviceStatutaire = serviceStatutaire;
    }


    public abstract int hComp();

    public int getServiceStatutaire() {
        return serviceStatutaire;
    }

    @Override
    public String toString() {
        return "EnsTitulaire{" +
                    "id=" + getId()+
                ", nom='" + getNom() + '\'' +
                ", heurefaite=" + getHeurefaite() +
                "serviceStatutaire=" + serviceStatutaire +
                '}';
    }
}
