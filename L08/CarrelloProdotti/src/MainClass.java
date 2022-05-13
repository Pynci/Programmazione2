
public class MainClass {

	public static void main(String[] args) {
		
		Carrello c = new Carrello(10);
		
		c.aggiungiProdotto(new Libro(12.0,"Dan Brown","Il Codice da Vinci"));
		c.aggiungiProdotto(new CD(15.0,"Wish You Were Here",5));
		c.aggiungiProdotto(new BigliettoAuguri(2.0,"compleanno"));
		
		System.out.println("Costo Totale=" + c.calcolaCostoTotale());
		
		System.out.println(c.toString());
	}

}
