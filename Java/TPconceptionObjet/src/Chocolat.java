public class Chocolat extends DécorationSupp {
    public Chocolat(Dessert d) {
        super(d);
    }

    @Override
    public double prix() {
        return 0.50+ getDessertDeBase().prix();
    }

    @Override
    public String description() {
        if (getDessertDeBase() instanceof Chocolat) {
            return getDessertDeBase().description() + " ,chocolat";
        }
        return "Ce chocolat artisanal est produit et vendu\n" +
        "par l’entreprise Montreuil Chocolaterie. " + getDessertDeBase().description() + " ,chocolat";
    }
}
