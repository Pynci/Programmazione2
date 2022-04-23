
public class CasaIndipendente {
	private String indirizzo;
	private Locale[] locali;
	
	public CasaIndipendente(String indirizzo, int maxLocali) {
		if(maxLocali > 0) {
			locali = new Locale[maxLocali];
		}
		else {
			locali = new Locale[1];
		}
		
		if(indirizzo != null) {
			this.indirizzo = indirizzo;
		}
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	
	//continuare qui
}
