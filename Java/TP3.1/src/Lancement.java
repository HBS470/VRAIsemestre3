public class Lancement {

    public static void methode1(Mois mois) {
        switch (mois) {
            case Septembre: case Octobre: case Novembre:
                System.out.println("c'est l'automne");
                break;
            case Decembre: case Janvier: case Fevrier :
                System.out.println("c'est l’hiver");
                break;
            case Mars: case Avril: case Mai:
                System.out.println("c'est le printemps");
                break;
            case Juin: case Juillet : case Aout:
                System.out.println("c'est l’été");
                break;
            default :
                break;
        }
    }
    public static void main(String[] args) {
        Mois m1 = Mois.Aout;
        methode1(Mois.Fevrier);
        methode1(m1);


        System.out.println("nom de Aout" + m1.name());
        System.out.println("ordinal() de Aout " + m1.ordinal());
        System.out.println("ordinal() de Janvier " + Mois.Janvier.ordinal ());
// utilisation de valueOf() :
        Mois m2 = Mois.valueOf("Septembre");
        System.out.println("utilisation de compare() "+ Mois.Janvier.compareTo(Mois.Juillet));
        System.out.println("utilisation de compare() "+ Mois.Janvier.compareTo(Mois.Aout));
        System.out.println("utilisation de compare() "+ Mois.Aout.compareTo(Mois.Janvier));
        System.out.println("utilisation de compare() "+ Mois.Aout.compareTo(Mois.Fevrier));
    }
}