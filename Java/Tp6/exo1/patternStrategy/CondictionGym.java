package clubSport.exo1.patternStrategy;


public class CondictionGym implements Condition {
    @Override
    public boolean checkCondition(Personne p) {
        return p.getSexe() == Sexe.Femme;
    }
}
