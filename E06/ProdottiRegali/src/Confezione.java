
public class Confezione extends Prodotto {
	
	private int numeroPezzi;

	public Confezione(String descrizione, double costo_base, double iva) {
		this(descrizione, costo_base, iva, 1);
	}
	
	public Confezione(String descrizione, double costo_base, double iva, int numeroPezzi) {
		super(descrizione, costo_base, iva);
		setNumeroPezzi(numeroPezzi);
	}

	public int getNumeroPezzi() {
		return numeroPezzi;
	}

	public void setNumeroPezzi(int numeroPezzi) {
		this.numeroPezzi = numeroPezzi;
	}
	
	@Override
	public double getPrezzo() {
		return super.getPrezzo() * numeroPezzi;
	}
	
	//overridare equals confrontando anche il numero dei pezzi

}
