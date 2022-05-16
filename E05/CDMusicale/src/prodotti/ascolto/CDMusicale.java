package prodotti.ascolto;

import prodotti.Prodotto;

public class CDMusicale extends Prodotto {
	private Canzone[] canzoni;
	
	protected CDMusicale(String nome, double prezzo, double sconto) {
		super(nome,prezzo,sconto);
		canzoni = new Canzone[1];
	}
	
	public CDMusicale(String nome, double prezzo, double sconto, Canzone[] canzoni) {
		this(nome,prezzo,sconto);
		setCanzoni(canzoni);
	}
	
	protected void setCanzoni(Canzone[] canzoni) {
		for(int i = 0; i < this.canzoni.length; i++) {
			if(canzoni[i] != null) {
				this.canzoni[i] = canzoni[i];
			}
			if(canzoni.length == i+1) {
				i = this.canzoni.length;
			}
		}
	}
	
	public String riproduci() {
		String riproduzione = "";
		
		for(int i = 0; i < canzoni.length; i++) {
			if(canzoni[i] != null) {
				riproduzione += canzoni[i].getTitolo() + "\n";
			}
		}
		
		return riproduzione;
	}
	
	public String toString() {
		return super.toString() + "[numeroCanzoni:" + canzoni.length + "]";
	}
}
