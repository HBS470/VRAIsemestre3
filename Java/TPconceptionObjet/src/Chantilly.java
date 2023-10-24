public class Chantilly extends DécorationSupp {
    public Chantilly(Dessert d) {
        super(d);
    }

    @Override
    public double prix() {
        return 0.80+getDessertDeBase().prix();
    }

    @Override
    public String description() {
        return getDessertDeBase().description() + " ,chantilly ";
    }
}
