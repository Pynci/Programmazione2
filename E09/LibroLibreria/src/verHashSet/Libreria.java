package verHashSet;
import java.util.List;
import java.util.ArrayList;

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
}
