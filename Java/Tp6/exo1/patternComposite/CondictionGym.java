package clubSport.exo1.patternComposite;


import java.util.ArrayList;

public class CondictionGym extends Condition {
    public CondictionGym(ArrayList<Condition> conditions) {
        super(conditions);
    }

    @Override
    public boolean checkCondition(Personne p) {
        return p.getSexe() == Sexe.Femme;
    }
}
