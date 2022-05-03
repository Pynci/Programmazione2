
public class Auto {
	private int valore;
	private String modello;
	
	public Auto(int valore, String modello) {
		this.valore = valore;
		this.modello = modello;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public int getValore() {
		return valore;
	}
	
	public String toString() {
		return "valore=" + valore + " modello=" + modello;
	}
}
