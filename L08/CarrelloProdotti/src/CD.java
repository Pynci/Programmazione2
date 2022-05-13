
public class CD extends Prodotto{

	String titoloAlbum;
	int numeroCanzoni;
	

	public CD(double costo, String titoloAlbum, int numeroCanzoni) {
		super(costo);
		if (titoloAlbum==null) {
			this.titoloAlbum = "";
		}else {
			this.titoloAlbum = titoloAlbum;
		}
		if (numeroCanzoni<=0) {
			this.numeroCanzoni = 1;
		} else {
			this.numeroCanzoni = numeroCanzoni;
		}
	}
	
	@Override
	public String toString() {
		return "CD [titoloAlbum=" + titoloAlbum+ ", numeroCanzoni=" + numeroCanzoni+ " " + super.toString() + "]";
	}
	
}
