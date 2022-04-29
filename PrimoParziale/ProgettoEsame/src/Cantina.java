
//885969 Luca Pinciroli

public class Cantina {
	private Vino[] vini;
	
	public Cantina(int dimensione) {
		if(dimensione > 0) {
			vini = new Vino[dimensione];
		}
		else {
			vini = new Vino[10];
		}
	}
	
	public Cantina() {
		this(10);
	}
	
	public boolean aggiungi(Vino vino) {
		if(vino != null) {
			for(int i = 0; i < vini.length; i++) {
				if(vini[i] == null) {
					vini[i] = vino;
					return true;
				}
			}
		}
		return false;
	}
	
	public Vino[] preleva(Vino vino, int numeroBottiglie) {
		Vino[] prelevati;
		int qtaBottiglie = 0;
		
		/*
		 * Conto quante bottiglie uguali a quella cercata sono presenti nella cantina.
		 * NB: nel caso in cui vino sia uguale a null il metodo equals restituisce false,
		 * impedendo all'esecuzione di procedere e sfociare in un'eccezione.
		 */
		for(int i = 0; i < vini.length; i++) {
			if(vino.equals(vini[i]) && vini[i].getPrezzo() > 0) {
				qtaBottiglie++;
			}
		}
		
		/*
		 * Se la cantina non ha bottiglie l'array deve avere dimensione 0,
		 * altrimenti se le bottiglie della cantina sono meno di quelle richieste le
		 * restituisco tutte.
		 * Se invece posso esaudire il numero di bottiglie richiesto restituisco solo
		 * quelle necessarie.
		 */
		if(qtaBottiglie == 0) {
			prelevati = new Vino[0];
		}
		else if(qtaBottiglie < numeroBottiglie) {
			prelevati = new Vino[qtaBottiglie];
			int i = 0;
			
			//prelevo le bottiglie e le rimuovo dalla cantina
			while(qtaBottiglie > 0 && i < vini.length) {
				if(vino.equals(vini[i]) && vini[i].getPrezzo() > 0) {
					prelevati[prelevati.length - qtaBottiglie] = vini[i];
					vini[i] = null;
					qtaBottiglie--;
				}
				i++;
			}
		}
		else {
			prelevati = new Vino[numeroBottiglie];
			int i = 0;
			
			//prelevo le bottiglie e le rimuovo dalla cantina
			while(numeroBottiglie > 0 && i < vini.length) {
				if(vino.equals(vini[i]) && vini[i].getPrezzo() > 0) {
					prelevati[prelevati.length - numeroBottiglie] = vini[i];
					vini[i] = null;
					numeroBottiglie--;
				}
				i++;
			}
		}
		
		return prelevati;
	}
	
	public Vino[] preleva(Vino vino) {
		return preleva(vino, 1);
	}
	
	public float valoreComplessivoCantina() {
		float sommaPrezzi = 0;
		
		for(int i = 0; i < vini.length; i++) {
			if(vini[i] != null) {
				sommaPrezzi += vini[i].getPrezzo();
			}
		}
		
		return sommaPrezzi;
	}
}
