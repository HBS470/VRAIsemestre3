import java.util.ArrayList;
import java.util.Collection;
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
        List<Gens> vide = new ArrayList<Gens>();
        // 1
        List<Integer> val = List.of(2,5,7,4,12,3,8,3);
        List<Integer> lo = val.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());
        System.out.println(lo.stream().findFirst());

        // 2
        System.out.println(petit2(coll));
        System.out.println(petit2(vide));

        // 3
        System.out.println(petit3(coll));
        //System.out.println(petit3(vide));

        // 4
        petit4(coll);
        //petit4(vide);

        // 5 
        System.out.println(petit5(coll));

        // 6
        System.out.println(petit6(coll));

    }
    public static Optional<Gens> petit2(Collection<Gens> liste){
        return liste.stream().findAny();
        
    }

    public static Gens petit3 (Collection<Gens> liste){
        Optional <Gens> result = liste.stream().findAny();
        return result.get();
    }

    public static void petit4 (Collection<Gens> liste){
        Optional<Gens> verif = liste.stream().findAny();
        if (!verif.isPresent()) {
            System.out.println("impossible");
        }
        else {
            System.out.println(verif.get());
        }
    }

    public static Gens petit5 (Collection<Gens> liste){
        return liste.stream().filter(g -> g.getNom().startsWith("t")).findAny().get();
    }

    public static String petit6 (Collection<Gens> liste) {
        return liste.stream().filter(g -> g.getAge() >= 18).map(g -> g.getNom()).findAny().get();

    }
}
