package prodotti.lettura;

import prodotti.Prodotto;

public class Libro extends Prodotto {
	private String autore;
	protected String[] pagine;
	
	public Libro(String nome, double prezzo, double sconto, String autore, String[] pagine) {
		//controlli da implementare
		super(nome, prezzo, sconto);
		this.autore = autore;
		this.pagine = pagine;
	}
	
	//devo ancora scrivere i metodi
}
