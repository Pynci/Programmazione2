
public class Carrello {

	private Prodotto prodotti[];
	
	public Carrello(int numProdottiMax) {
		if (numProdottiMax<=0) {
			prodotti = new Prodotto[5];
		} else {
			prodotti = new Prodotto[numProdottiMax];			
		}
	}
	
	public boolean aggiungiProdotto(Prodotto p) {
		for (int i=0; i<prodotti.length; i++) {
			if (prodotti[i]==null) {
				prodotti[i]=p;
				return true;
			}
		}
		return false;
	}
	
	public double calcolaCostoTotale() {
		double costoTotale=0;
		
		for(int i=0; i<prodotti.length; i++) {
			if (prodotti[i]!=null) {
				costoTotale+=prodotti[i].getCosto();
			}
		}
		
		return costoTotale;
	}
	
	@Override
	public String toString() {
		String s = "Carrello con: \n";
		for(int i=0; i<prodotti.length && prodotti[i] != null; i++) {
			s+=prodotti[i].toString() + "\n";
		}
		return s;
	}
	
}
