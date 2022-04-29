
//885969 Luca Pinciroli

public class Vino {
	private String nome;
	private int anno;
	private double prezzo;
	
	public Vino(String nome, int anno, double prezzo) {
		this.nome = nome;
		this.anno = anno;
		setPrezzo(prezzo);
	}
	
	public Vino(String nome, int anno) {
		this(nome, anno, 0);
	}
	
	public void setPrezzo(double prezzo) {
		if(prezzo >= 0) {
			this.prezzo = prezzo;
		}
		else {
			this.prezzo = 0;
		}
	}

	public String getNome() {
		return nome;
	}

	public int getAnno() {
		return anno;
	}

	public double getPrezzo() {
		return prezzo;
	}
	
	public boolean equals(Vino vino) {
		if(vino == null) {
			return false;
		}
		else if(this == vino) {
			return true;
		}
		else if(nome.equalsIgnoreCase(vino.getNome()) && anno == vino.getAnno()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
