package carresEtRond;

import static java.lang.Math.*;

public class AdaptateurCarré implements FormeRonde {
    private PieceCarree p;

    public AdaptateurCarré(PieceCarree p) {
        this.p = p;
    }

    public double getRayon(){
        return (p.getCote()/2)*sqrt(2);
    }
    public String getCouleur(){
        return p.getCouleur();
    }
}
