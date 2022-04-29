import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCantina {

	// ********************************** Test su Vino
	// Creazione
	@Test
	public void testVinoCreazione1() {
		Vino vino = new Vino("Brunello", 2020, 18.50);
		assertEquals(new String("Brunello"), vino.getNome());
		assertEquals(2020, vino.getAnno());
		assertEquals(18.50, vino.getPrezzo(), 0.05);
	}

	@Test
	public void testVinoCreazione2() {
		Vino vino = new Vino("Brunello", 2020, -18.50);
		assertEquals(new String("Brunello"), vino.getNome());
		assertEquals(2020, vino.getAnno());
		assertEquals(0.0, vino.getPrezzo(), 0.05);

	}

	@Test
	public void testVinoCreazione3() {
		Vino vino = new Vino("Brunello", 2020);
		assertEquals(new String("Brunello"), vino.getNome());
		assertEquals(2020, vino.getAnno());
		assertEquals(0.0, vino.getPrezzo(), 0.05);

	}

	// equals
	@Test
	public void testVinoEquals1() {
		Vino vino1 = new Vino("Brunello", 2020, 18.5);
		Vino vino2 = new Vino("Brunello", 2020, 18.5);
		assertTrue(vino1.equals(vino2));
	}

	@Test
	public void testVinoEquals2() {
		Vino vino1 = new Vino("Brunello", 2020, 18.5);
		Vino vino2 = new Vino("BRunello", 2020, 18.5);
		assertTrue(vino1.equals(vino2));
	}

	@Test
	public void testVinoEquals3() {
		Vino vino1 = new Vino("Brunello", 2021, 18.5);
		Vino vino2 = new Vino("Brunello", 2020, 18.5);
		assertFalse(vino1.equals(vino2));
	}

	@Test
	public void testVinoEquals4() {
		Vino vino1 = new Vino("Brunello", 2020, 28.5);
		Vino vino2 = new Vino("Brunello", 2020, 18.5);
		assertTrue(vino1.equals(vino2));
	}

	@Test
	public void testVinoEquals5() {
		Vino vino1 = new Vino("Teroldego", 2020, 18.5);
		Vino vino2 = new Vino("Brunello", 2020, 18.5);
		assertFalse(vino1.equals(vino2));
	}

	@Test
	public void testVinosetPrezzo1() {
		Vino vino = new Vino("Teroldego", 2020);
		vino.setPrezzo(18.5);
		assertEquals(18.5, vino.getPrezzo(), 0.05);
	}

	@Test
	public void testVinosetPrezzo2() {
		Vino vino = new Vino("Teroldego", 2020);
		vino.setPrezzo(-1.0);
		assertEquals(0.0, vino.getPrezzo(), 0.05);
	}

	// ********************************** Test su Cantina

	// aggiungiVino con oggetto
	@Test
	public void testCantinaAggiungiVino1() {
		Cantina cantina = new Cantina(3);
		boolean esito = cantina.aggiungi(new Vino("Brunello", 2020, 28.5));
		assertTrue(esito);
	}

	@Test
	public void testCantinaAggiungiVino2() { // aggiungo null
		Cantina cantina = new Cantina(3);
		boolean esito = cantina.aggiungi(null);
		assertFalse(esito);
	}

	@Test
	public void testCantinaAggiungiVino3() { // saturazione cantina
		Cantina cantina = new Cantina(2);
		boolean esito = cantina.aggiungi(new Vino("Brunello", 2018, 28.5));
		esito = cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		esito = cantina.aggiungi(new Vino("Amarone", 2017, 35.5));
		assertFalse(esito);
	}

	// prelevaVino con numero di bottiglie
	@Test
	public void prelevaVino1() { // numero sufficiente di bottiglie
		Cantina cantina = new Cantina();
		cantina.aggiungi(new Vino("Brunello", 2018, 28.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Amarone", 2017, 35.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		assertEquals(119.5, cantina.valoreComplessivoCantina(), 0.05);
		Vino[] prelevati = cantina.preleva(new Vino("Brunello", 2020, 18.5), 2);
		assertNotNull(prelevati);
		assertEquals(2, prelevati.length);
		assertTrue(new Vino("Brunello", 2020, 18.5).equals(prelevati[0]));
		assertTrue(new Vino("Brunello", 2020, 18.5).equals(prelevati[1]));
		// verifico che oltre ad essere stati restituiti, sono anche stati tolti
		assertEquals(82.5, cantina.valoreComplessivoCantina(), 0.05);
	}

	@Test
	public void prelevaVino2() { // numero insufficiente di bottiglie
		Cantina cantina = new Cantina();
		cantina.aggiungi(new Vino("Brunello", 2018, 28.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Amarone", 2017, 35.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		assertEquals(119.5, cantina.valoreComplessivoCantina(), 0.05);
		Vino[] prelevati = cantina.preleva(new Vino("Brunello", 2020, 18.5), 4);
		assertNotNull(prelevati);
		assertEquals(3, prelevati.length);
		assertTrue(new Vino("Brunello", 2020, 18.5).equals(prelevati[0]));
		assertTrue(new Vino("Brunello", 2020, 18.5).equals(prelevati[1]));
		assertTrue(new Vino("Brunello", 2020, 18.5).equals(prelevati[2]));
		// verifico che oltre ad essere stati restituiti, sono anche stati tolti
		assertEquals(64.0, cantina.valoreComplessivoCantina(), 0.05);
	}

	@Test
	public void prelevaVino3() { // bottioglie non presenti
		Cantina cantina = new Cantina();
		cantina.aggiungi(new Vino("Brunello", 2018, 28.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Amarone", 2017, 35.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		assertEquals(119.5, cantina.valoreComplessivoCantina(), 0.05);
		Vino[] prelevati = cantina.preleva(new Vino("Teroldego", 2020, 18.5), 4);
		assertNotNull(prelevati);
		assertEquals(0, prelevati.length);
		// verifico che oltre ad essere stati restituiti, sono anche stati tolti
		assertEquals(119.5, cantina.valoreComplessivoCantina(), 0.05);
	}

	@Test
	public void prelevaVino4() { // bottiglie senza prezzo
		Cantina cantina = new Cantina();
		cantina.aggiungi(new Vino("Brunello", 2018, 28.5));
		cantina.aggiungi(new Vino("Brunello", 2020));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Amarone", 2017, 35.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		assertEquals(101.0, cantina.valoreComplessivoCantina(), 0.05);
		Vino[] prelevati = cantina.preleva(new Vino("Brunello", 2020, 18.5), 4);
		assertNotNull(prelevati);
		assertEquals(2, prelevati.length);
		assertTrue(new Vino("Brunello", 2020, 18.5).equals(prelevati[0]));
		assertTrue(new Vino("Brunello", 2020, 18.5).equals(prelevati[1]));
		// verifico che oltre ad essere stati restituiti, sono anche stati tolti
		assertEquals(64.0, cantina.valoreComplessivoCantina(), 0.05);
	}

	// prelevaVino singolo
	@Test
	public void prelevaVinoSingolo1() { // numero sufficiente di bottiglie
		Cantina cantina = new Cantina();
		cantina.aggiungi(new Vino("Brunello", 2018, 28.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Amarone", 2017, 35.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		assertEquals(119.5, cantina.valoreComplessivoCantina(), 0.05);
		Vino[] prelevati = cantina.preleva(new Vino("Brunello", 2020, 18.5));
		assertNotNull(prelevati);
		assertEquals(1, prelevati.length);
		assertTrue(new Vino("Brunello", 2020, 18.5).equals(prelevati[0]));
		// verifico che oltre ad essere stati restituiti, sono anche stati tolti
		assertEquals(101.0, cantina.valoreComplessivoCantina(), 0.05);
	}

	@Test
	public void prelevaVinoSingolo2() { // bottioglie non presenti
		Cantina cantina = new Cantina();
		cantina.aggiungi(new Vino("Brunello", 2018, 28.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Amarone", 2017, 35.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		assertEquals(119.5, cantina.valoreComplessivoCantina(), 0.05);
		Vino[] prelevati = cantina.preleva(new Vino("Teroldego", 2020, 18.5));
		assertNotNull(prelevati);
		assertEquals(0, prelevati.length);
		// verifico che non siano stati prelevati
		assertEquals(119.5, cantina.valoreComplessivoCantina(), 0.05);
	}

	@Test
	public void prelevaVinoSingolo3() { // bottiglie senza prezzo
		Cantina cantina = new Cantina();
		cantina.aggiungi(new Vino("Brunello", 2018, 28.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Amarone", 2017));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		assertEquals(84.0, cantina.valoreComplessivoCantina(), 0.05);
		Vino[] prelevati = cantina.preleva(new Vino("Amarone", 2017));
		assertNotNull(prelevati);
		assertEquals(0, prelevati.length);
		// verifico che non siano stati prelevati
		assertEquals(84.0, cantina.valoreComplessivoCantina(), 0.05);
	}

	// valoreComplessivoCantina
	@Test
	public void valoreComplessivoCantina1() {
		Cantina cantina = new Cantina(4);
		cantina.aggiungi(new Vino("Brunello", 2018, 28.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Amarone", 2017, 35.5));
		assertEquals(82.5, cantina.valoreComplessivoCantina(), 0.05);
	}

	@Test
	public void valoreComplessivoCantina2() { // nessun vino
		Cantina cantina = new Cantina(4);
		assertEquals(0.0, cantina.valoreComplessivoCantina(), 0.05);
	}

	@Test
	public void valoreComplessivoCantina3() { // con posizone vuota
		Cantina cantina = new Cantina(4);
		cantina.aggiungi(new Vino("Brunello", 2018, 28.5));
		cantina.aggiungi(new Vino("Brunello", 2020, 18.5));
		cantina.aggiungi(new Vino("Amarone", 2017, 35.5));
		cantina.preleva(new Vino("Brunello", 2020, 18.5));
		assertEquals(64.0, cantina.valoreComplessivoCantina(), 0.05);
	}

}
