
public class Validatore {

	private Regola[] regole;
	
	public Validatore(int maxRegole) {
		if(maxRegole > 0) {
			regole = new Regola[maxRegole];
		}
		else {
			regole = new Regola[5];
		}
	}
	
	public void aggiungiRegola(Regola nuovaRegola) {
		if(nuovaRegola != null) {
			for(int i = 0; i < regole.length; i++) {
				if(regole[i] == null) {
					regole[i] = nuovaRegola;
				}
			}
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
