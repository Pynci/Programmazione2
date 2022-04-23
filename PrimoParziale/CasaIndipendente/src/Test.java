import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void testCreazioneLocali() {
		Locale l1 = new Locale(10, "sala");
		assertEquals(10, l1.getMq());
		assertEquals("sala", l1.getTipo());
		assertEquals(new String("sala"), l1.getTipo());
		
		Locale l2 = new Locale("camera");
		assertEquals(10, l2.getMq());
		assertEquals("camera", l2.getTipo());
		
		Locale l3 = new Locale(0, "camera");
		assertEquals(5, l3.getMq());
		assertEquals("camera", l3.getTipo());
		
		Locale l4 = new Locale(6, null);
		assertEquals(6, l4.getMq());
		assertEquals("camera", l4.getTipo());
	}
	
	@org.junit.Test
	public void testConfrontoLocali() {
		Locale l1 = new Locale(10, "sala");
		Locale l2 = new Locale(12, "camera");
		assertFalse(l1.equals(l2));
		
		Locale l3 = new Locale(10, "camera");
		assertFalse(l1.equals(l3));
		
		Locale l4 = new Locale (12, "camera");
		assertTrue(l2.equals(l4));
		
		Locale l5 = new Locale("sala");
		assertTrue(l1.equals(l5));
		assertFalse(l1.equals(null));
	}
	
	@org.junit.Test
	public void testCreaCasaIndipendente() {
		CasaIndipendente c = new CasaIndipendente("via esempio, comune esempio", 2);
		assertTrue(c.getSuperficieTotale() == 0);
		
		Locale l1 = new Locale(20, "sala");
		Locale l2 = new Locale(10, "cucina");
		
		c.addLocale(l1);
		c.addLocale(l2);
		assertTrue(c.getSuperficieTotale() == 30);
		
		assertFalse(c.addLocale(l1));
		assertTrue(c.getSuperficieTotale() == 30);
	}
	

	@org.junit.Test
	public void testNumLocaliPerTipo() {
		CasaIndipendente c1 = new CasaIndipendente("via esempio, comune esempio",4);
	
		Locale l1 = new Locale(20, "sala");
		Locale l2 = new Locale(10, "cucina");
		Locale l3 = new Locale(10, "camera");
		Locale l4 = new Locale(10, "camera");
		
		c1.addLocale(l1);
		c1.addLocale(l2);
		c1.addLocale(l3);
		c1.addLocale(l4);
		
		assertTrue(c1.numLocaliDiUnTipo("sala") == 1);
		assertTrue(c1.numLocaliDiUnTipo("cucina") == 1);
		assertTrue(c1.numLocaliDiUnTipo("camera") == 2);
		assertTrue(c1.numLocaliDiUnTipo("altro") == 0);
		assertTrue(c1.numLocaliDiUnTipo(null) == 0);
		
	}
	
	@org.junit.Test
	public void testRistrutturaCasaIndipendente() {
		CasaIndipendente c1=new CasaIndipendente("via esempio, comune esempio",4);
	
		Locale l1 = new Locale(20, "sala");
		Locale l2 = new Locale(10, "cucina");
		Locale l3 = new Locale(10, "camera");
		
		c1.addLocale(l1);
		c1.addLocale(l2);
		c1.addLocale(l3);
		
		assertTrue(c1.numLocaliDiUnTipo("bagno") == 0);
		assertTrue(c1.numLocaliDiUnTipo("sala") == 1);
		
		c1.ristrutturaLocale(l1, "bagno");
		assertTrue(c1.numLocaliDiUnTipo("bagno") == 1);
		assertTrue(c1.getSuperficieTotale() == 40);
		assertTrue(c1.numLocaliDiUnTipo("sala") == 0);
		
		c1.ristrutturaLocale(l2, "sala", 12);
		assertTrue(c1.numLocaliDiUnTipo("sala") == 1);
		assertTrue(c1.getSuperficieTotale() == 42);
		
		c1.ristrutturaLocale(new Locale(12, "sala"), "tinello", 13);
		assertTrue(c1.numLocaliDiUnTipo("sala") == 0);
		assertTrue(c1.numLocaliDiUnTipo("tinello") == 1);
		assertTrue(c1.getSuperficieTotale() == 43);
		
		c1.ristrutturaLocale(new Locale(13, "tinello"), null, 0);
		assertTrue(c1.numLocaliDiUnTipo("sala") == 0);
		assertTrue(c1.numLocaliDiUnTipo("camera") == 2);
		assertTrue(c1.getSuperficieTotale() == 35);
		
		
	}
	
	@org.junit.Test
	public void testEqualsCasaIndipendente() {
		CasaIndipendente c1 = new CasaIndipendente("via esempio, comune esempio",4);
	
		Locale l1 = new Locale(20, "sala");
		Locale l2 = new Locale(10, "cucina");
		Locale l3 = new Locale(10, "camera");
		
		c1.addLocale(l1);
		c1.addLocale(l2);
		c1.addLocale(l3);

		CasaIndipendente c2 = new CasaIndipendente("via esempio, comune esempio",5);
		
		Locale l4 = new Locale(20, "cucina");
		Locale l5 = new Locale(10, "sala");
		Locale l6 = new Locale(10, "camera");
		
		c2.addLocale(l4);
		c2.addLocale(l5);
		
		assertFalse(c1.equals(c2));
		
		c2.addLocale(l6);
		assertTrue(c1.equals(c2));
		
		assertFalse(c1.equals(null));
		
	}
}
