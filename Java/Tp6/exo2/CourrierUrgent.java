package clubSport.exo2;

public class CourrierUrgent extends DecorateurCourrier {
    public CourrierUrgent(Courrier c) {
        super(c);
    }

    @Override
    public double coutAffranchissement() {
        return 2 * super.coutAffranchissement();
    }
}
