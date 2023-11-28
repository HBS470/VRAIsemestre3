import java.util.List;
import java.util.function.Predicate;

public class Exo1 {
    public static void main(String[] args) {
        Gens a, b, c, d;
        a = new Gens("lulu", 18);
        b = new Gens("tot", 17);
        c = new Gens("Lolo", 20);
        d = new Gens("bi", 20);

        List<Gens> coll = List.of(a,b,c,d);
        // 1

        Predicate<Gens> p = (g) -> g.getAge() < 20;
        System.out.println(coll.stream().anyMatch(p));

        // 2

        Predicate<Gens> p1 = (g) -> g.getAge() < 15;
        System.out.println(coll.stream().anyMatch(p1));

        // 3
        System.out.println(coll.stream().allMatch((g) -> g.getAge() >= 18));
        System.out.println(coll.stream().noneMatch(g -> g.getAge() < 18));

    }
}
