public class Main {
    public static void main(String[] args) {
        Dessert d = new Chocolat(new Chocolat(new Gaufre()));
        System.out.println(d.description());
        System.out.println(d.prix() + " €");
    }
}
