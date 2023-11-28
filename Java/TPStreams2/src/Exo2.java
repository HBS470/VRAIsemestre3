import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exo2 {
    public static void main(String[] args) {
        Gens a, b, c, d;
        a = new Gens("lulu", 18);
        b = new Gens("tot", 17);
        c = new Gens("Lolo", 20);
        d = new Gens("bi", 20);

        List<Gens> coll = List.of(a,b,c,d);
        // 1
        List<Integer> val = List.of(2,5,7,4,12,3,8,3);
        List<Integer> lo = val.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
        System.out.println(lo.stream().findFirst());

        // 2
        Optional<Gens> result = coll.stream().findAny();
        System.out.println(result);
    }
}
