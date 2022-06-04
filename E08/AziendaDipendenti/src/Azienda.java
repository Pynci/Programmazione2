
public class Azienda {
	Dipendente[] dipendenti;
	
	public Azienda(int numDipendenti) {
		this.dipendenti = new Dipendente[numDipendenti];
	}
	
	public boolean aggiungiDipendente(Dipendente nuovo) {
		int posizioneInserimento = -1;
		
		if(nuovo == null) {
			return false;
		}
		
		for(int i = 0; i < dipendenti.length; i++) {
			if(dipendenti[i] == null) {
				posizioneInserimento = i;
			}
			else {
				if(dipendenti[i].equals(nuovo)) {
					return false;
				}
			}
		}
		
		if(posizioneInserimento != -1) {
			dipendenti[posizioneInserimento] = nuovo;
			return true;
		}
		return false;
		
	}
	
	public double costoAnnuoDipendenti() {
		double somma = 0;
		
		for(int i = 0; i < dipendenti.length; i++) {
			if(dipendenti[i] != null) {
				somma += dipendenti[i].calcolaRal();
			}
		}
		
		return somma;
	}
}
