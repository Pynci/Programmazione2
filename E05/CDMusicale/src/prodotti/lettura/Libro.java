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

	public String getAutore() {
		return autore;
	}

	public int getNumPagine() {
		int numPagine = 0;
		
		for(int i = 0; i < pagine.length; i++) {
			if(pagine[i] != null) {
				numPagine++;
			}
		}
		
		return numPagine;
	}
	
	public String toString() {
		return super.toString() + "[autore:" + autore + "][numPagine:" + getNumPagine() + "]";
	}
	
	public String sfoglia() {
		String lettura = "";
		
		for(int i = 0; i < pagine.length; i++) {
			if(pagine[i] != null && !pagine[i].isEmpty()) {
				lettura += "\n" + pagine[i];
			}
		}
		
		return lettura;
	}
	
	
}
