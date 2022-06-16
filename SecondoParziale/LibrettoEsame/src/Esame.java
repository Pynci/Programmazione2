import java.util.Objects;

public abstract class Esame {
	private int CFU;
	private String codice;
	
	public Esame(int CFU, String codice) throws EsameNonValidoException {
		if(CFU > 0) {
			this.CFU = CFU;
		}
		else throw new EsameNonValidoException("ATTENZIONE: CFU insufficienti");
		
		if(codice != null && !codice.isEmpty()) {
			this.codice = codice;
		}
		else throw new EsameNonValidoException("ATTENZIONE: codice non valido");
	}
	
	public abstract double voto();

	public int getCFU() {
		return CFU;
	}

	public String getCodice() {
		return codice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Esame other = (Esame) obj;
		return Objects.equals(codice, other.codice);
	}
	
	public String toString() {
		return "[codice:" + getCodice() + ", CFU:" + getCFU() + ", voto:" + voto() + "]";
	}
}
