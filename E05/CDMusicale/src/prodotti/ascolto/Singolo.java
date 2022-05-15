package prodotti.ascolto;

public class Singolo extends CDMusicale {
	
	public Singolo(double prezzo, double sconto, Canzone canzone) {
		super(new String("Singolo:" + canzone.getTitolo()),prezzo,sconto);
	}
}
