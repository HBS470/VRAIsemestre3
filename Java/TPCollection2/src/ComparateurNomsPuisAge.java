import java.util.Comparator;

public class ComparateurNomsPuisAge implements Comparator<Gens> {

    @Override
    public int compare(Gens g1, Gens g2) {
        if (g1.getNom().compareTo(g2.getNom()) == 0) {
            return g1.getAge() - g2.getAge();
        } else
            return g1.getNom().compareTo(g2.getNom());
    }
}
