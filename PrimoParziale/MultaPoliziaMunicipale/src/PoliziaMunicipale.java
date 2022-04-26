
public class PoliziaMunicipale {
	private String comune;
	private Multa[] multe;
	
	public PoliziaMunicipale(String comune, int multeMax) {
		this.comune = comune;
		multe = new Multa[multeMax];
	}
	
	public PoliziaMunicipale(String comune) {
		this(comune,1000);
	}
	
	public boolean multaInserita(Multa multa) {
		boolean trovata = false;
		int i = 0;
		
		while(i < multe.length && !trovata) {
			if(multe[i] != null) {
				if(multe[i].equals(multa)) {
					trovata = true;
				}
			}
			i++;
		}
		
		return trovata;
	}
	
	public boolean aggiungiMulta(Multa multa) {
		boolean inserita = false;
		int i = 0;
		
		while(i < multe.length && !inserita) {
			if(multa != null && !multaInserita(multa)) {
				if(multe[i] == null) {
					multe[i] = multa;
					inserita = true;
				}
			}
			i++;
		}
		
		return inserita;
	}
	
	public boolean aggiungiMulta(String numeroVerbale, int importo) {
		if(numeroVerbale != null && numeroVerbale != "" && importo > 0) {
			Multa multa = new Multa(numeroVerbale, importo);
			return aggiungiMulta(multa);
		}
		else {
			return false;
		}
	}
	
	public Multa rimuoviMulta(Multa multa) {
		if(multa != null && multaInserita(multa)) {
			for(int i = 0; i < multe.length; i++) {
				if(multe[i] != null && multe[i].equals(multa)) {
					Multa temp = multe[i];
					multe[i] = null;
					return temp;
				}
			}
		}
		
		return null;
	}
	
	public int fatturato() {
		int totale = 0;
		
		for(int i = 0; i < multe.length; i++) {
			if(multe[i] != null && multe[i].isPagata()) {
				totale += multe[i].getImporto();
			}
		}
		
		return totale;
	}
	
	
}
