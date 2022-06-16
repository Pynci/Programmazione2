package verHashMap1;

import java.util.Objects;

public class Libro {
	private String autore;
	private String titolo;
	private int anno;
	private int numeroVolume;
	
	public Libro(String autore, String titolo, int anno) throws LibroException {
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
		
		this.anno = anno;
	}
	
	public Libro(String autore, String titolo, int anno, int numeroVolume) throws LibroException {
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

	public int getAnno() {
		return anno;
	}

	public int getNumeroVolume() {
		return numeroVolume;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(anno, other.anno) && Objects.equals(autore, other.autore)
				&& Objects.equals(titolo, other.titolo);
	}
	
	
	
}
