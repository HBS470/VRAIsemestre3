import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Exercice 1
        List<Integer> list = List.of(2,4,7,8);

        long test = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println("Nombre d'entiers pairs : "+test);

        // Exercice 2
        // 1
        List<Integer> test2 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("Entiers pairs : " + test2);

        // 2
        List<String> string = List.of("toto","bidule","truc");
        Set<String> set1 = string.stream().filter(x -> x.length() == 4).collect(Collectors.toSet());
        System.out.println("Mots de longueur 4 : " + set1);

        // Exercice 3
        // 1
        Gens a, b, c, d;
        a = new Gens("lulu", 18);
        b = new Gens("tot", 17);
        c = new Gens("Lolo", 20);
        d = new Gens("bi", 20);


        List<Gens> coll = List.of(a,b,c,d);
        List<Integer> age = coll.stream().map(x -> x.getAge()).collect(Collectors.toList());
        System.out.println("Age des gens : "+age);

        // 2
        List<Integer> lenghtName = coll.stream().map(x -> x.getNom().length()).collect(Collectors.toList());
        System.out.println("Longueur des noms des gens : "+lenghtName);

        // 3
//        List<String> lesNomsMinuscule1 = coll.stream().map(x −> {
//            System.out.println("mapping nom de" + x);
//            return x.getNom();
//        }).map(x −> {
//            System.out.println("mapping lowercase" + x);
//            return x.toLowerCase();
//        }).collect (Collectors .toList());
//        System.out.println("liste des noms minuscule1" + lesNomsMinuscule1);

        // 4
        List<Integer>  p = List.of(1,2,3,4,5,6,7,8);
        System.out.println(m1(p));

        // Exercice 4
        // 1
        List<String> l = coll.stream().filter(x -> x.getNom().startsWith("l") || x.getNom().startsWith("L")).map(x -> x.getNom()).collect(Collectors.toList());
        System.out.println("Liste des noms qui commencent par ’l’ ou ’L’ des gens de coll : "+l);

        // 2
        List<String> h = coll.stream().filter(x -> x.getAge() == 20).map(x -> x.getNom()).collect(Collectors.toList());
        System.out.println("Liste des noms des gens de coll qui ont 20 ans : " + h);

        // 3
        List<String> nomsDes20AnsBis = new ArrayList<>();
        for (Gens g : coll){
            if(g.getAge() == 20) {
                nomsDes20AnsBis.add(g.getNom());
            }
        }
        System.out.println("liste NomsDes20AnsBis : " + nomsDes20AnsBis);

        // 4
        List<Integer> taille = coll.stream().filter(x -> x.getNom().length() > 3).map(x -> x.getNom().length()).collect(Collectors.toList());
        System.out.println("Taille des noms supérieurs à 3 : "+taille);
    }
    public static List<Integer> m1(List<Integer> l){
        return l.stream().map(x-> x * 2).toList();
    }

}
