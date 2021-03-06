package verTreeSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

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
		libri = new TreeSet<Libro>();
	}
	
	//TODO capire come mai il test genera un'eccezione dovuta ad un cast mai richiesto
	
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
