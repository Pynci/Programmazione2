import java.util.Objects;

public abstract class Dipendente {
	private String nome;
	private int matricola;
	private double stipendioMensile;
	
	public Dipendente(String nome, int matricola, double stipendioMensile) throws DipendenteException {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}
		else {
			throw new DipendenteException("nome invalido");
		}
		
		if(matricola >= 0) {
			this.matricola = matricola;
		}
		else {
			throw new DipendenteException("matricola negativa");
		}
		
		if(stipendioMensile >= 1000) {
			this.stipendioMensile = stipendioMensile;
		}
		else {
			throw new DipendenteException("stipendio da fame");
		}
	}
	
	public abstract double calcolaRal();

	public double getStipendioMensile() {
		return stipendioMensile;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dipendente other = (Dipendente) obj;
		return matricola == other.matricola && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(stipendioMensile) == Double.doubleToLongBits(other.stipendioMensile);
	}
	
	
	
	
}
