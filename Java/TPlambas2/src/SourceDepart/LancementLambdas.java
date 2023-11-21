package SourceDepart;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class LancementLambdas {

    public static void main(String[] args) {
        Gens a, b, c, d;
        a = new Gens("lulu", 18);
        b = new Gens("toto", 17);
        c = new Gens("lulu", 20);
        d = new Gens("bibi", 20);

        Produit p112et30 = new Produit(112, 30);
        Produit p150et15 = new Produit(150, 15);
        Produit p120et30 = new Produit(120, 30);
        Produit p112et40 = new Produit(112, 40);
        Produit p120et30Bis = new Produit(120, 30);

        ArrayList<Gens> lesGens = new ArrayList<>();
        lesGens.add(a);
        lesGens.add(b);
        lesGens.add(c);
        lesGens.add(d);

        // completez avec des lambdas expressions et eventuellement le type de
        // la variable.:
        // 1: p est une fonction qui prend un gens et teste s'il a plus de 18
        // ans.
//         Predicate<Gens> p = (g) -> g.getAge() > 18;
//         System.out.println(p.test(a));
//         System.out.println(p.test(b));
//         System.out.println(p.test(c));

        // 2 :p2 est une fonction qui prend un gens et teste s'il s'appelle
        // "lulu".
//         Predicate<Gens> p2 = (g) -> g.getNom().equals("lulu");
//         System.out.println(p2.test(a));
//         System.out.println(p2.test(b));
//         System.out.println(p2.test(c));
        //
        // // 3 :p3 est une fonction qui prend un gens et teste si son nom
        // commence
        // // par l..
//         Predicate<Gens> p3 = (g) -> g.getNom().startsWith("l");
//         System.out.println(p3.test(a));
//         System.out.println(p3.test(b));
//         System.out.println(p3.test(c));
        //
        // // 4 : p4 est une fonction prenant un produit et testant si son prix
        // est sup
        // // a 35
//         Predicate <Produit> p4 = (Produit x) -> x.getPrix() > 35;
//         System.out.println(p4.test(p112et40));
//         System.out.println(p4.test(p112et30));
        //
        // // 5 : utiliser and or negate (cf javadoc Predicate) pour que p5
        // teste si un
        // // Gens s'appelle "lulu" et a plus de 18 ans.
//         Predicate<Gens> p5 = ((Predicate<Gens>) (g) -> g.getAge() > 18).and((g) -> g.getNom().equals("lulu"));
//         System.out.println(p5.test(a));
//         System.out.println(p5.test(b));
//         System.out.println(p5.test(c));

        // 6 : // sur qui p6 repondra t il true ?
//         Predicate<Gens> p6 = p5.or(p3.negate());
//         System.out.println(p6.test(b));
//         System.out.println(p6.test(c));
//         System.out.println(p6.test(d));
        // // f1 est une fonction prenant une String et retournant sa longueur.
//        Function<String, Integer> f1 = (x -> x.length());
        // // L'unique methode abstraite de l'interface fonctionnelle
        // Function<S,T>
        // // T apply(S x);
        // // appliquée à "bonjour" f1 retourne donc 7
//        System.out.println(f1.apply("bonjour"));
        //
        // // 7 : typer f11.
//         Function<Integer, Integer> f11 = x-> x+2;
//         System.out.println(f11.apply(2));
//         System.out.println(f11.apply(4));
        //
        // // 8 : f2 est une fonction qui prend un gens et retourne son age
//         Function<Gens,Integer> f2 = g -> g.getAge();
//         System.out.println(f2.apply(a));
//         System.out.println(f2.apply(b));
        //
        // // 9 : f3 est une fonction qui prend un gens et retourne la premiere
        // lettre de son
        // // nom.
//         Function<Gens,Character> f3 = g -> g.getNom().charAt(0);
//         System.out.println(f3.apply(a));
//         System.out.println(f3.apply(b));
        //
        // // 10 : utiliser andThen pour que f4 prenne un gens et retourne le
        // double de
        // // son age.
//         Function<Gens, Integer> f4 = ((Function<Gens,Integer>) g -> g.getAge()).andThen(g -> g*2);
//         System.out.println(f4.apply(a));
//         System.out.println(f4.apply(c));

        // // 11 typer :
//         Function<Gens,Character> f5 = ((Function<Gens, String>) x -> x.getNom()).andThen(y -> y.charAt(0));
//         System.out.println(f5.apply(a));
//         System.out.println(f5.apply(d));

        // Exercice 4
        // 3
        Function<Gens, Gens> f6 = g -> new Gens(g.getNom(),g.getAge()+2);
        System.out.println(lesGens);
        System.out.println();
        System.out.println("Age + 2 : ");
        System.out.println(appliquerAChacun(lesGens,f6));

        Function <Gens,Gens> f7 = g -> new Gens(g.getNom().toUpperCase(),g.getAge());
        System.out.println();
        System.out.println("Nom en Majuscule : ");
        System.out.println(appliquerAChacun(lesGens,f7));
    }

    public static ArrayList<Gens> appliquerAChacun(ArrayList<Gens> l, Function<Gens, Gens> f){
        ArrayList<Gens> result = new ArrayList<>();
        for (Gens g : l) {
            result.add(f.apply(g));
        }
        return result;
    }
}
