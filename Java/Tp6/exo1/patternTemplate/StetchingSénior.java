package clubSport.exo1.patternTemplate;

public class StetchingSénior extends Activite {
    public StetchingSénior(int capacite) {
        super("StetchingSénior", capacite);
    }

    @Override
    public boolean condition(Personne p) {
        return p.getAge()>60;
    }
}
