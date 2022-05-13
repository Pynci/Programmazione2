
public class Libro extends Prodotto{

	String autore;
	String titolo;
	
	public Libro(double costo, String autore, String titolo) {
		super(costo);
		if (autore==null) {
			this.autore = "Anonimo";
		} else {
			this.autore = autore;
		}
		if(titolo==null) {
			this.titolo = "Sconosciuto";
		} else {
			this. titolo = titolo;
		}
	}
	
	@Override
	public String toString() {
		return "Libro [autore=" + autore + ", titolo=" + titolo + " " + super.toString() + "]";
	}
	
}
