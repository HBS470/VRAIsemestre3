package clubSport.exo1.patternStrategy;

public class StetchingSénior extends Activite {
    public StetchingSénior(int capacite) {
        super("Stetching Sénior", capacite,new ConditionSénior());
    }

}
