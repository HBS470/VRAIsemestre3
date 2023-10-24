import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Tests {
    private Prag prag;
    private MaitreDeConférence mcf;
    @Before
    public void setUp() throws Exception {
        prag = new Prag("Gerard",20);
        mcf = new MaitreDeConférence("Horeb",50);
    }

    @Test
    public void ajoutEnseignant() throws PasEnseignant {
        assertThrows(PasEnseignant.class, ()-> new EnsExtérieur("Horeb",0));
        assertThrows(PasEnseignant.class, ()-> new EnsExtérieur("Horeb",-1));

    }

    @Test
    public void ajoutHeure() throws PasEnseignant,Exception {
        prag.ajouterHeure(30);
        assertEquals(50,prag.getHeurefaite());
        assertThrows(Exception.class, ()-> prag.ajouterHeure(-50));
    }

    @Test
    public void heuresSupp() throws Exception {
        prag.ajouterHeure(364);
        System.out.println(prag.getHeurefaite());
        assertEquals(0,prag.hComp());

        prag.ajouterHeure(30);
        System.out.println(prag.getHeurefaite());
        assertEquals(30,prag.hComp());

    }
}
