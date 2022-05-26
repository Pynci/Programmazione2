
public class Prodotto {

	private String descrizione;
	private double costo_base;
	private double iva;
	
	public Prodotto(String descrizione, double costo_base, double iva) {
		setDescrizione(descrizione);
		setCosto_base(costo_base);
		setIva(iva);
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getCosto_base() {
		return costo_base;
	}

	public void setCosto_base(double costo_base) {
		this.costo_base = costo_base;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	
	public double getPrezzo() {
		return costo_base * iva;
	}
	
	public String toString() {
		return "[descrizione:" + descrizione + "][costo_base:" + costo_base + "][iva:" + iva + "]";
	}

	@Override
	public boolean equals(Object obj) {
		//effettuo il controllo sulla classe e su null
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		//casto l'oggetto a prodotto e confronto gli attributi
		Prodotto other = (Prodotto) obj;
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
	
	

}
