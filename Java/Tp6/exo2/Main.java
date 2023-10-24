package clubSport.exo2;

public class Main {
    public static void main(String[] args) {
        Lettre l = new Lettre("Horeb");
        CourrierUrgent cU = new CourrierUrgent(l);
        CourrierAccusédeRéception cAdR = new CourrierAccusédeRéception(l,"Gérard");

        System.out.println(cAdR.getExpediteur());
    }
}
