
public class Dirigente extends Dipendente {
	
	private double benefit;
	
	public Dirigente(String nome, int matricola, double stipendioMensile, double benefit) throws DipendenteException {
		super(nome, matricola, stipendioMensile);
		
		if(benefit >= 0) {
			this.benefit = benefit;
		}
		else {
			throw new DipendenteException("benefit negativo");
		}
	}
	
	@Override
	public double calcolaRal() {
		return 14 * this.getStipendioMensile() + benefit;
	}

	public double getBenefit() {
		return benefit;
	}

}
