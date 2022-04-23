
public class SkipassGiornaliero {
	private DatiAttivazione dati;
	
	public SkipassGiornaliero(DatiAttivazione dati) {
		this.dati = dati;
	}
	
	public boolean controllaValidita(int giorno) {
		if(giorno == dati.getGiorno()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Skipass di " + dati.getNome() +", valido per il giorno " + dati.getGiorno();
	}
}
