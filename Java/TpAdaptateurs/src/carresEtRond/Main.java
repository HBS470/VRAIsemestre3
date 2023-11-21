package carresEtRond;

public class Main {
    public static void main(String[] args) {
        TrouRond tr = new TrouRond(10);
        PieceCarree p = new PieceCarree(5,"red");
        PieceCarree p2 = new PieceCarree(15,"red");
        AdaptateurCarré ac = new AdaptateurCarré(p);
        AdaptateurCarré ac2 = new AdaptateurCarré(p2);


        tr.inserer(ac);
        tr.inserer(ac2);

    }
}
