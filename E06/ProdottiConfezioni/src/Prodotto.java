import java.util.Objects;

public class Prodotto {
	
	private double costo_base=0, iva=1;
	private String descrizione;
	
	public Prodotto(String descrizione, double costo_base, double iva) {
		super();
		setCosto_base(costo_base);
		setDescrizione(descrizione);
		setIva(iva);
	}
	
	
	public double getIva() {
		return iva;
	}


	public void setIva(double iva) {
		this.iva = iva;
	}


	double getCosto_base() {
		return costo_base;
	}

	void setCosto_base(double costo_base) {
		this.costo_base = costo_base;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public double getPrezzo(){
		//iva verrà espresso come 1.22 (22%)
		return getCosto_base() * getIva();
	}
	
	public String toString(){
		return descrizione + " costo base " + costo_base + " Prezzo finale: " + getPrezzo();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		//verifica che this e obj siano della stessa classe
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Prodotto other = (Prodotto) obj;
		//NB: non fa il controllo con == per evitare di incappare in problemi
		//legati all'arrotondamento dei double
		if (Double.doubleToLongBits(costo_base) != Double.doubleToLongBits(other.costo_base)) {
			return false;
		}
		if (descrizione == null) {
			if (other.descrizione != null) {
				return false;
			}
		} else if (!descrizione.equalsIgnoreCase(other.descrizione)) {
			return false;
		}
		if (Double.doubleToLongBits(iva) != Double.doubleToLongBits(other.iva)) {
			return false;
		}
		return true;
	}
	
	public Prodotto dividi(int n) {
		return new Prodotto(descrizione, costo_base/n, iva);
	}
	
	public Prodotto dividi() {
		return dividi(2);
	}


	
	
}
