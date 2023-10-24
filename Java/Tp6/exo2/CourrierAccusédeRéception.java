package clubSport.exo2;

public class CourrierAccusédeRéception extends DecorateurCourrier {

    private String expediteur;

    public CourrierAccusédeRéception(Courrier c, String expediteur) {
        super(c);
        this.expediteur = expediteur;
    }

    @Override
    public boolean auxNormes() {
        return super.auxNormes() && expediteur != null;
    }

    public String getExpediteur() {
        return expediteur;
    }
}



