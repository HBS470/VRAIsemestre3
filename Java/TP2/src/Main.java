public class Main {
    public static void main(String[] args) throws PasEnseignant,Exception {
        Prag p = new Prag("Horeb",384);
        MaitreDeConférence m = new MaitreDeConférence("Gerard",0);

        Établissement e = new Établissement("IUT de Montreuil");

        e.ajouterEnseignant(p);
        e.ajouterEnseignant(m);

        e.ajouterHeures();

        e.pasHeuresComp();
        e.plusDeNheuresComp(1);
    }
}
