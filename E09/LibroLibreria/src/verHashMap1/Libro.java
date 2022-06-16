package verHashMap1;

public class Libro {
	private String autore;
	private String titolo;
	private String anno;
	private int numeroVolume;
	
	public Libro(String autore, String titolo, String anno) throws LibroException {
		if(autore != null && !autore.isEmpty()) {
			this.autore = autore;
		}
		else {
			throw new LibroException("ATTENZIONE: autore non valido");
		}
		
		if(titolo != null && !titolo.isEmpty()) {
			this.titolo = titolo;
		}
		else {
			throw new LibroException("ATTENZIONE: titolo non valido");
		}
		
		if(anno != null && !anno.isEmpty()) {
			this.anno = anno;
		}
		else {
			throw new LibroException("ATTENZIONE: anno non valido");
		}
	}
	
	public Libro(String autore, String titolo, String anno, int numeroVolume) throws LibroException {
		this(autore, titolo, anno);
		
		if(numeroVolume > 0) {
			this.numeroVolume = numeroVolume;
		}
		else {
			throw new LibroException("ATTENZIONE: numero volume non valido");
		}
	}
	
	@Override
	public String toString() {
		return "[autore:" + autore + ",titolo:" + titolo + ",anno:" + anno + ",numeroVolume:" + numeroVolume + "]";
	}

	public String getAutore() {
		return autore;
	}

	public String getTitolo() {
		return titolo;
	}

	public String getAnno() {
		return anno;
	}

	public int getNumeroVolume() {
		return numeroVolume;
	}
	
	
	
}
