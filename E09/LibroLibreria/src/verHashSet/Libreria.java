package verHashSet;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

public class Libreria {
	private String nome;
	private Set<Libro> libri;
	
	public Libreria(String nome) throws LibreriaException {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}
		else {
			throw new LibreriaException("ATTENZIONE: nome non valido");
		}
		libri = new HashSet<Libro>();
	}
	
	public boolean aggiungiLibro(Libro libro) {
		return libri.add(libro);
	}
	
	public int quantitaLibri() {
		return libri.size();
	}
	
	public List<Libro> rimuoviLibriAnno(int anno){
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
		return "Libreria {" + nome + ", " + libri.toString() + "}";
	}
}
