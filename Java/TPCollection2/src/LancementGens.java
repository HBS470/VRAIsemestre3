import java.util.SortedSet;
import java.util.TreeSet;

public class LancementGens {
    public static void main(String[] args) {
        Gens g1,g2,g3,g4;
        g1 = new Gens("lulu",18);
        g2 = new Gens("toto",17);
        g3 = new Gens("lulu",20);
        g4 = new Gens("bibi",25);

        SortedSet<Gens> ss1 = new TreeSet<>(new ComparateurNomsPuisAge());

        ss1.add(g1);
        ss1.add(g2);
        ss1.add(g3);
        ss1.add(g4);
        System.out.println(ss1);
    }
}
