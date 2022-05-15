package prodotti;

public class Prodotto {
	private double prezzo;
	private double sconto;
	private String nome;
	
	public Prodotto(String nome, double prezzo, double sconto) {
		//eventuali controlli ancora da implementare
		this.nome = nome;
		this.prezzo = prezzo;
		this.sconto = sconto;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getSconto() {
		return sconto;
	}

	public void setSconto(double sconto) {
		this.sconto = sconto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double calcolaPrezzo() {
		return prezzo - sconto;
	}
	
	public String toString() {
		return "[nome:" + nome + "; prezzo: " + prezzo + "; sconto: " + sconto + ";]";
	}
}
