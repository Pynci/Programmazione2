import java.util.Objects;

public abstract class Dipendente {
	private String nome;
	private int matricola;
	private double stipendioMensile;
	
	public Dipendente(String nome, int matricola, double stipendioMensile) {
		this.nome = nome;
		this.matricola = matricola;
		this.stipendioMensile = stipendioMensile;
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
