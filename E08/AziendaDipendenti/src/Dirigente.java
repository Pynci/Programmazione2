
public class Dirigente extends Dipendente {
	
	private double benefit;
	
	public Dirigente(String nome, int matricola, double stipendioMensile, double benefit) {
		super(nome, matricola, stipendioMensile);
		this.benefit = benefit;
	}
	
	@Override
	public double calcolaRal() {
		return 14 * this.getStipendioMensile() + benefit;
	}

	public double getBenefit() {
		return benefit;
	}

}
