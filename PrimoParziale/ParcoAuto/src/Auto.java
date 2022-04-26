
public class Auto {
	private String targa;
	private int km;
	
	public Auto(String targa, int kmPercorsi) {
		this.targa = targa;
		km = kmPercorsi;
	}
	
	public Auto(String targa) {
		this(targa,0);
	}
	
	public boolean aggiornaKm(int kmAggiuntivi) {
		if(kmAggiuntivi >= 0) {
			km += kmAggiuntivi;
			return true;
		}
		else {
			return false;
		}
	}

	public String getTarga() {
		return targa;
	}

	public int getKmPercorsi() {
		return km;
	}
	
	public boolean equals(Auto altra) {
		if(altra == null) {
			return false;
		}
		else if(this == altra) {
			return true;
		}
		else if(this.targa.equalsIgnoreCase(altra.targa)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "targa: " + targa + " km: " + km;
	}
	
	
}
