package verHashMap2;
import java.util.*;

public class Libreria {
	private String nome;
	private Map<Integer,HashSet<Libro>> libri;
	
	public Libreria(String nome) throws LibreriaException {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}
		else {
			throw new LibreriaException("ATTENZIONE: nome non valido");
		}
		libri = new HashMap<Integer,HashSet<Libro>>();
	}
	
	public boolean aggiungiLibro(Libro nuovo) {
		HashSet<Libro> perAnno = libri.get(nuovo.getAnno());
		boolean esito;
		if(perAnno != null) {
			esito = perAnno.add(nuovo);
			libri.put(nuovo.getAnno(), perAnno);
		}
		else {
			perAnno = new HashSet<Libro>();
			esito = perAnno.add(nuovo);
			libri.put(nuovo.getAnno(), perAnno);
		}
		return esito;
	}
	
	public int quantitaLibri() {
		int somma = 0;
		Collection<HashSet<Libro>> valori = libri.values();
		for(HashSet<Libro> hashset: valori) {
			somma += hashset.size();
		}
		return somma;
	}
	
	public List<Libro> rimuoviLibriAnno(int anno){
		HashSet<Libro> rimossi = libri.get(anno);
		List<Libro> daRitornare = new LinkedList<Libro>();
		if(rimossi != null) {
			for(Libro rimosso: rimossi) {
				daRitornare.add(rimosso);
			}
			libri.remove(anno);
		}
		return daRitornare;
	}
	
	public String toString() {
		return "Libreria {" + nome + ", " + libri.toString() + "}";
	}
}
