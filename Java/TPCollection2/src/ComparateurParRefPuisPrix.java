import java.util.Comparator;

public class ComparateurParRefPuisPrix implements Comparator<Produit> {
    @Override
    public int compare(Produit p, Produit q) {
        if (p.getReference() == q.getReference()) {
            return p.getPrix() - q.getPrix();
        } else
            return p.getReference() - q.getReference();
    }

}

