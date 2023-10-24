package clubSport.exo1.patternStrategy;


public class ConditionSénior implements Condition{
    @Override
    public boolean checkCondition(Personne p) {
        return p.getAge() > 60;
    }
}
