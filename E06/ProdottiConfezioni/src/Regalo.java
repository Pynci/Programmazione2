
public class Regalo {
	Object contenuto;
	
	public Regalo(Object contenuto) {
		this.contenuto = contenuto;
	}
	
	public String scarta() {
		return "[contenuto:" + contenuto.toString() + "]";
	}
	
	public double getPrezzo() {
		if(contenuto instanceof Prodotto) {
			return ((Prodotto) contenuto).getPrezzo();
		}
		else {
			return 0;
		}
	}
}
