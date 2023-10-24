public abstract class DécorationSupp extends Dessert{
    private Dessert dessertDeBase;

    public DécorationSupp(Dessert d) {
        dessertDeBase = d;
    }

    @Override
    public double prix() {
        return 0;
    }

    @Override
    public String description() {
        return null;
    }

    public Dessert getDessertDeBase() {
        return dessertDeBase;
    }
}
