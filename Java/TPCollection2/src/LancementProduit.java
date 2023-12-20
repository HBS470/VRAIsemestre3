
import java.util.SortedSet;
import java.util.TreeSet;

public class LancementProduit {

    public static void main(String[] args) {
        Produit p112et30 = new Produit(112, 30);
        Produit p150et15 = new Produit(150, 15);
        Produit p120et30 = new Produit(120, 30);
        Produit p112et40 = new Produit(112, 40);
        Produit p120et30Bis = new Produit(120, 30);

        ComparateurParRefPuisPrix comp = new ComparateurParRefPuisPrix();
        System.out.println(comp.compare(p120et30,p112et40));

        SortedSet<Produit> ss1 = new TreeSet<>(comp);
        ss1.add(p112et30);
        ss1.add(p150et15);
        ss1.add(p120et30);
        ss1.add(p112et40);
        ss1.add(p120et30Bis);
        System.out.println(ss1);


       SortedSet<Produit> ss2 = new TreeSet<>((p1,p2) -> {
           if (p1.getReference() == p2.getReference()) {
               return p1.getPrix() - p2.getPrix();
           } else
               return p1.getReference() - p2.getReference();
       });
        ss2.add(p112et30);
        ss2.add(p150et15);
        ss2.add(p120et30);
        ss2.add(p112et40);
        ss2.add(p120et30Bis);
        System.out.println(ss2);
    }
}

