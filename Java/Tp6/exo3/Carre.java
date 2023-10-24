package clubSport.exo3;

public class Carre implements Forme {
    private int x;
    private int y;
    private int cote;

    public Carre(int x, int y, int cote) {
        this .x = x;
        this .y = y;
        this .cote = cote;
    }
    public void translate ( int dx, int dy) {
        x += dx;
        y += dy;
    }
    public void dessine (){

    };
}
