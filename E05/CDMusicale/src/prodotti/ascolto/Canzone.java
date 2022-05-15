package prodotti.ascolto;

public class Canzone {
	private String titolo;
	private int durata;
	
	public Canzone(String titolo, int durata) {
		if(titolo != null && !titolo.isBlank() && !titolo.isEmpty()){
			this.titolo = titolo;
		}
		else {
			this.titolo = "titolo";
		}
		
		if(durata > 0) {
			this.durata = durata;
		}
		else {
			durata = 10;
		}
	}
	
	public boolean equals(Canzone altra) {
		if(altra == null) {
			return false;
		}
		else if(this == altra) {
			return true;
		}
		else if(titolo.equals(altra.titolo) && durata == altra.durata) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "[titolo:" + titolo + "][durata:" + durata + "]";
	}

	public String getTitolo() {
		return titolo;
	}

	public int getDurata() {
		return durata;
	}
	
	
}
