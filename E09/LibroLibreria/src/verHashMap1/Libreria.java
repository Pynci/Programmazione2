package verHashMap1;
import java.util.*;

public class Libreria {
	private String nome;
	private Map<Libro,Integer> libri;
	
	public Libreria(String nome) throws LibreriaException {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}
		else {
			throw new LibreriaException("ATTENZIONE: nome non valido");
		}
		libri = new HashMap<Libro,Integer>();
	}
	
	public boolean aggiungiLibro(Libro libro) {
		if(libri.get(libro) != null) {
			libri.put(libro, libri.get(libro)+1);
		}
		else {
			libri.put(libro, 1);
		}
		return true;
	}
	
	public int quantitaLibri() {
		return libri.size();
	}
	
	public List<Libro> rimuoviLibriAnno(int anno){
		List<Libro> rimossi = new LinkedList<Libro>();
		Set<Libro> presenti = libri.keySet();
		for(Libro libro: presenti) {
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
