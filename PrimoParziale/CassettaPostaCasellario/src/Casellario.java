
public class Casellario {
	private CassettaPosta[] cassette;
	
	public Casellario(int numeroCassette) {
		if(numeroCassette>0) {
			cassette = new CassettaPosta[numeroCassette];
		}
		else {
			cassette = new CassettaPosta[1];
		}
	}
	
	private boolean isPresente(CassettaPosta cassetta) {
		boolean trovata = false;
		int i = 0;
		
		while(i < cassette.length && !trovata) {
			if(cassette[i] != null) {
				trovata = cassetta.equals(cassette[i]);
			}
			i++;
		}
		
		return trovata;
	}
	
	public boolean aggiungiCassettaPosta(CassettaPosta cassetta) {
		boolean inserita = false;
		
		if(cassetta == null || isPresente(cassetta)) {
			inserita = false;
		}
		else {
			int i = 0;
			while(i < cassette.length && !inserita) {
				if(cassette[i] == null) {
					cassette[i] = cassetta;
					inserita = true;
				}
				i++;
			}
		}
		
		return inserita;
	}
	
	public boolean aggiungiCassettaPosta(String nome, int numeroLettere) {
		CassettaPosta cassetta = new CassettaPosta(nome, numeroLettere);
		return aggiungiCassettaPosta(cassetta);
	}
	
	public boolean rimuovi(CassettaPosta cassetta) {
		boolean rimossa = false;
		
		if(cassetta != null && isPresente(cassetta)) {
			for(int i = 0; i < cassette.length; i++) {
				if(cassetta.equals(cassette[i])) {
					cassette[i] = null;
					rimossa = true;
				}
			}
		}
		
		return rimossa;
	}
	
}
