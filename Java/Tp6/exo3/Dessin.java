package clubSport.exo3;

//Composite
public class Dessin extends Forme {
    private ArrayList<Forme> formes;

    public Dessin() {
        this.formes = new ArrayList<Forme>();
        }

    public void add(Forme f){
        formes.add(f);
    }

    public void translate (int dx, int dy){
            for (Forme f : formes){
                f.translate (dx,dy);
            }
    }

    public void dessine (){
            for (Forme f : formes){
                f.dessine();
            }
        }
}