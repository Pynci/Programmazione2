
public class Validatore {

	private Regola[] regole;
	
	public Validatore(int maxRegole) throws CapacityException {
		if(maxRegole > 0) {
			regole = new Regola[maxRegole];
		}
		else {
			throw new CapacityException("numero massimo di regole non valido");
		}
	}
	
	public void aggiungiRegola(Regola nuovaRegola) throws CapacityException {
		if(nuovaRegola != null) {
			/*
			 * Andrebbe aggiunstata l'aggiunta anche nella precedente esercitazione
			 * Nel caso non lo avessi ancora fatto mandami una PR! :D
			 */
			boolean aggiunta = false;
			int i = 0;
			while(i < regole.length && !aggiunta) {
				if(regole[i] == null) {
					regole[i] = nuovaRegola;
					aggiunta = true;
				}
				i++;
			}

			if(!aggiunta) throw new CapacityException("numero massimo di regole raggiunto");
		}
	}
	
	public boolean convalida(Account account) {
		if(account != null) {
			for(int i = 0; i < regole.length; i++) {
				if(regole[i] != null && !regole[i].convalida(account)) {
					return false;
				}
			}
		}
		return true;
	}

}
