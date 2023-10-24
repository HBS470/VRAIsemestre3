package clubSport.exo2;

public class DecorateurCourrier extends Courrier {
    private Courrier courrierDeBase;
    public DecorateurCourrier(Courrier c) {
        super(c.getDestinataire());
        this.courrierDeBase = c;
    }

    @Override
    public double coutAffranchissement() {
        return 0;
    }

    @Override
    public boolean auxNormes() {
        return super.auxNormes();
    }

    @Override
    public String getDestinataire() {
        return super.getDestinataire();
    }

    public Courrier getCourrierDeBase() {
        return courrierDeBase;
    }
}
