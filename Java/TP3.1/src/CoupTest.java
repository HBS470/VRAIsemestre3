import org.junit.jupiter.api.BeforeEach;

import java.util.Scanner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class CoupTest {
    private Coup cis;
	private Coup pap;
	private Coup pie;

	// ce qui est dans la méthode annotée @BeforeEach
	//est execute AVANT CHAQUE TEST
	@BeforeEach
	void setUp() throws Exception {
		cis = Coup.ciseaux;
		pap = Coup.papier;
		pie = Coup.pierre;

	}
    @org.junit.jupiter.api.Test
     void bat() {
        assertTrue(pie.bat(cis));
        assertTrue(pap.bat(pie));
        assertTrue(cis.bat(pap));
        assertFalse(pie.bat(pie));
        assertFalse(pie.bat(pap));
        assertFalse(pap.bat(pap));
        assertFalse(pap.bat(cis));
        assertFalse(cis.bat(cis));
        assertFalse(cis.bat(pie));
    }

    @org.junit.jupiter.api.Test
    void saisirCoup() {
        Scanner sc = new Scanner("chou-fleur" + "\n" + "voiture" + "\n"
				+ "papier" + "\n" + "truc");
		assertEquals(Coup.saisirCoup(sc), pap);
    }
}