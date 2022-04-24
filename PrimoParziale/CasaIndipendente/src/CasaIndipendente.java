
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
		else {
			indirizzo = "";
		}
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	
	public boolean addLocale(Locale locale) {
		boolean buonFine = false;
		int i = 0;
		
		if(locale != null) {
			while(i < locali.length) {
				if(locali[i] == null) {
					locali[i] = new Locale(locale.getMq(), locale.getTipo());
					buonFine = true;
					i = locali.length;
				}
				i++;
			}
		}

		return buonFine;
		
	}
	
	public int getSuperficieTotale() {
		int mqTotali = 0;
		
		for(int i = 0; i < locali.length; i++) {
			if(locali[i] != null) {
				mqTotali += locali[i].getMq();
			}
		}
		
		return mqTotali;
	}
	
	public int numLocaliDiUnTipo(String tipo) {
		int contatore = 0;
		
		for(int i = 0; i < locali.length; i++) {
			if(locali[i] != null && locali[i].getTipo().equals(tipo)) {
				contatore++;
			}
		}
		
		return contatore;
	}
	
	public boolean ristrutturaLocale(Locale locale, String nuovoTipo, int nuoviMq) {
		boolean esisteLocale = false;
		
		if(locale != null) {
			for(int i = 0; i < locali.length; i++) {
				if(locale.equals(locali[i])) {
					locali[i].setMq(nuoviMq);
					locali[i].setTipo(nuovoTipo);
					esisteLocale = true;
				}
			}
		}
		
		return esisteLocale;
	}
	
	public boolean ristrutturaLocale(Locale locale, String nuovoTipo) {
		if(locale != null) {
			return ristrutturaLocale(locale, nuovoTipo, locale.getMq());
		}
		else {
			return false;
		}
	}
	
	public boolean equals(CasaIndipendente altra) {
		if(altra == null) {
			return false;
		}
		else if(altra == this) {
			return true;
		}
		else if(altra.getIndirizzo().equals(indirizzo) && altra.getSuperficieTotale() == this.getSuperficieTotale()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
