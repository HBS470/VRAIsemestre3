import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Exo3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,5,7,4,3,8,3);
        Gens a, b, c, d;
        a = new Gens("lulu", 18);
        b = new Gens("tot", 17);
        c = new Gens("Lolo", 20);
        d = new Gens("bi", 20);

        List<Gens> coll = List.of(a,b,c,d);
        
        // 1 
        System.out.println(list.stream().reduce(0, (x,y)-> x+y));

        // 2
        Optional <Integer> somme = list.stream().reduce((x,y)->x+y);
        System.out.println(somme); 

        // 3
        List<Integer>l = Arrays.asList(4, 5, 7, 4, 3, 8, 3);
        Optional<Integer>nbre1 = l.stream().reduce((x, y)->x + 1);
        System.out.println(nbre1.get());
        /* C'est 10 qui s'affiche car x prend comme valeur la première valeur du tableau donc 4 */
        
        // 4
        System.out.println(list.stream().reduce(1, (x,y) ->x*y));
    
        // 5
        System.out.println(petit5(coll));
    }

    public static String petit5(Collection <Gens> liste){
        return liste.stream().filter(g -> g.getAge() == 20).map(g -> g.getNom()).reduce((p1,p2) -> p1 + ", " + p2).get();


    }

}
