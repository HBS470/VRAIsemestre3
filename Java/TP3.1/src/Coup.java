import java.util.Scanner;

public enum Coup {
    pierre,ciseaux,papier;

    Coup() {
    }

    public boolean bat(Coup c) {
        return (this.compareTo(Coup.ciseaux) == 0 && c.compareTo(Coup.papier) == 0)
                || (this.compareTo(Coup.papier) == 0 && c.compareTo(Coup.pierre) == 0)
                || (this.compareTo(Coup.pierre) == 0 && c.compareTo(Coup.ciseaux) == 0);
    }


    public static Coup saisirCoup(Scanner sc){
        System.out.println("quel coup choisissez vous ? : taper pierre, papier ou ciseaux ");
        String input = sc.nextLine().toLowerCase();

        switch (input) {
            case "pierre":
                System.out.println("le coup choisi est pierre");
                return pierre;
            case "papier":
                System.out.println("le coup choisi est papier");
                return papier;
            case "ciseaux":
                System.out.println("le coup choisi est ciseaux");
                return ciseaux;
            default:
                System.out.println("ceci n'est pas un coup possible");
                return saisirCoup(sc);
        }
    }
}
