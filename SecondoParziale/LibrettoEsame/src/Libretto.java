import java.util.*;

public class Libretto {
	
	private Set<Esame> esami;
	
	public Libretto() {
		esami = new HashSet<Esame>();
	}
	
	public boolean aggiungiEsame(Esame esame) throws EsameNonValidoException {
		if(esame != null) {
			return esami.add(esame);
		}
		else throw new EsameNonValidoException("ATTENZIONE: esame in ingresso è null");
	}
	
	public double calcolaMedia() {
		double somma = 0;
		int sommaCFU = 0;
		
		for(Esame esame: esami) {
			somma += esame.voto() * esame.getCFU();
			sommaCFU += esame.getCFU();
		}
		
		return somma/sommaCFU;
	}
	
	public int numeroEsamiSoloOrale() {
		int contatore = 0;
		
		for(Esame esame: esami) {
			if(esame instanceof EsameOrale) {
				contatore++;
			}
		}
		
		return contatore;
	}
	
	public String toString() {
		String daRitornare = "{";
		
		for(Esame esame: esami) {
			daRitornare += esame.toString();
		}
		
		return daRitornare + "}";
	}
}
