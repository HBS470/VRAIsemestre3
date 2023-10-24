package clubSport.exo3;

public class Cercle implements Forme {
    private int x;
    private int y;
    private int rayon;

    public Cercle(int x, int y, int rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public void dessine() {
    }

    ;
}
