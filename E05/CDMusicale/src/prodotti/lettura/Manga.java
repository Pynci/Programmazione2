package prodotti.lettura;

public class Manga extends Libro {
	private String titoloOriginale;
	
	public Manga(String nome, double prezzo, double sconto, String autore, String[] pagine, String titoloOr) {
		super(nome,prezzo,sconto,autore,pagine);
		this.titoloOriginale = titoloOr;
	}
	
	public String toString() {
		return super.toString() + "[titoloOriginale:" + titoloOriginale + "]";
	}
	
	public String sfoglia() {
		String lettura = "";
		
		for(int i = pagine.length; i > 0; i--) {
			if(pagine[i] != null && !pagine[i].isEmpty()) {
				lettura += "\n" + pagine[i];
			}
		}
		
		return lettura;
	}
}
