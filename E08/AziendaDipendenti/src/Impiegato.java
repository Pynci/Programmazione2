
public class Impiegato extends Dipendente {
	
	public Impiegato(String nome, int matricola, double stipendioMensile) throws DipendenteException {
		super(nome, matricola, stipendioMensile);
	}
	
	@Override
	public double calcolaRal() {
		return 13 * this.getStipendioMensile();
	}
}
