
/*Un prodotto è qualcosa che può essere venduta ad un certo costo*/
public class Prodotto {

	private double costo;
	
	public Prodotto(double costo) {
		if (costo<0) {
			this.costo = 0.0;
		} else {
			this.costo = costo;
		}
	}
	
	public double getCosto() {
		return costo;
	}
	
	public void setCosto(double costo) {
		if (costo>0)
			this.costo = costo;
	}
	
	@Override
	public String toString() {
		return "Costo=" + costo;
	}
	
}
