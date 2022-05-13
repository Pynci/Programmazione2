
public class BigliettoAuguri extends Prodotto{

	private String tipoRicorrenza;
	
	public BigliettoAuguri(double costo, String tipoRicorrenza) {
		super(costo);
		if (tipoRicorrenza==null) {
			this.tipoRicorrenza="compleanno";
		} else {
			this.tipoRicorrenza = tipoRicorrenza;
		}
	}
	
	@Override
	public String toString() {
		return "Biglietto Auguri [tipoRicorrenza=" + tipoRicorrenza + " " + super.toString() + "]";
	}
}
