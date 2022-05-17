
public class Confezione extends Prodotto {

	private int numeroPezzi;
	
	public Confezione(String descrizione, double costo_base, double iva, int numeroPezzi) {
		super(descrizione, costo_base, iva);
		this.numeroPezzi = numeroPezzi;
	}
	
	public Confezione(String descrizione, double costo_base, double iva) {
		this(descrizione, costo_base, iva,1);
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Confezione other = (Confezione) obj;
		if (numeroPezzi != other.numeroPezzi) {
			return false;
		}
		return true;
	}
	
	
}
