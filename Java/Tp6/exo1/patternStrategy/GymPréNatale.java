package clubSport.exo1.patternStrategy;

public class GymPréNatale extends Activite {
    public GymPréNatale(int capacite) {
        super("Gym PréNatale", capacite,new CondictionGym());
    }

}
