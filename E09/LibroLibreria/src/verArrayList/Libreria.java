package verArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Libreria {
	private String nome;
	private List<Libro> libri;
	
	public Libreria(String nome) throws LibreriaException {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}
		else {
			throw new LibreriaException("ATTENZIONE: nome non valido");
		}
		libri = new ArrayList<Libro>();
	}
	
	public boolean aggiungiLibro(Libro nuovo) {
		if(libri.contains(nuovo)) {
			return false;
		}
		else {
			return libri.add(nuovo);
		}
	}
	
	public int quantitaLibri() {
		return libri.size();
	}
	
	public List<Libro> rimuoviLibriAnno(int anno) {
		List<Libro> rimossi = new LinkedList<Libro>();
		for(Libro libro: libri) {
			if(libro.getAnno() == anno) {
				rimossi.add(libro);
			}
		}
		for(Libro rimosso: rimossi) {
			libri.remove(rimosso);
		}
		return rimossi;
	}
	
	public String toString() {
		String stringa = "{\n";
		for(Libro libro: libri) {
			stringa += libro.toString() + "\n";
		}
		stringa += "}";
		return stringa;
	}
}
