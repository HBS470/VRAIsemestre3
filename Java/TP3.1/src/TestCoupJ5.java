//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.Scanner;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//class TestCoupJ5 {
//	private Coup cis;
//	private Coup pap;
//	private Coup pie;
//
//	// ce qui est dans la méthode annotée @BeforeEach
//	//est execute AVANT CHAQUE TEST
//	@BeforeEach
//	void setUp() throws Exception {
//		cis = new Coup("ciseaux");
//		pap = new Coup("papier");
//		pie = new Coup("pierre");
//
//	}
//
//	@Test
//	public void constructionCoupCorrecte() throws PasCoup {
//		Coup c1 = new Coup("pierre");
//		assertEquals(c1.getNom(), "pierre");
//		Coup c2 = new Coup("papier");
//		assertEquals(c2.getNom(), "papier");
//		Coup c3 = new Coup("ciseaux");
//		assertEquals(c3.getNom(), "ciseaux");
//	}
//
//	@Test
//	public void constructionCoupInCorrecte() throws PasCoup {
//		assertThrows(PasCoup.class, ()-> new Coup("itititti"));
//		//Coup c1 = ;
//	}
//
//	@Test
//	public void egalite() throws PasCoup {
//		assertEquals(pie, (new Coup("pierre")));
//		assertEquals(pap, (new Coup("papier")));
//		assertEquals(cis, (new Coup("ciseaux")));
//		assertFalse(pie.equals(pap));
//		assertFalse(pie.equals(cis));
//
//	}
//
//	@Test
//	public void bat() {
//		assertTrue(pie.bat(cis));
//		assertTrue(pap.bat(pie));
//		assertTrue(cis.bat(pap));
//		assertFalse(pie.bat(pie));
//		assertFalse(pie.bat(pap));
//		assertFalse(pap.bat(pap));
//		assertFalse(pap.bat(cis));
//		assertFalse(cis.bat(cis));
//		assertFalse(cis.bat(pie));
//	}
//
//	@Test
//	public void testSaisirCoup() {
//		Scanner sc = new Scanner("chou-fleur" + "\n" + "voiture" + "\n"
//				+ "papier" + "\n" + "truc");
//		assertEquals(Coup.saisirCoup(sc), pap);
//	}
//
//
//}
