
public class Multa {
	private String numeroVerbale;
	private int importo;
	private boolean pagata;
	
	public Multa(String numeroVerbale, int importo) {
		this.numeroVerbale = numeroVerbale;
		this.importo = importo;
		pagata = false;
	}
	
	public boolean isPagata() {
		return pagata;
	}
	
	public int getImporto() {
		return importo;
	}
	
	public String getNumeroVerbale() {
		return numeroVerbale;
	}
	
	public void paga() {
		pagata = true;
	}
	
	public boolean equals(Multa altra) {
		if(altra == null) {
			return false;
		}
		else if(this == altra) {
			return true;
		}
		else if(this.numeroVerbale.equalsIgnoreCase(altra.numeroVerbale)){
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "Numero verbale: " + numeroVerbale + ";\nImporto: " + importo + ";\nPagata: " + pagata;
	}
	
	
}
