
public class CassettaPosta {
	private int numeroLettere;
	private int numeroLettereMax;
	private String nome;
	
	public CassettaPosta(String nome, int numeroLettereMax) {
		if(nome != null) {
			this.nome = nome;
		}
		else {
			this.nome = "";
		}
		
		if(numeroLettereMax>0) {
			this.numeroLettereMax = numeroLettereMax;
		}
		else {
			this.numeroLettereMax = 1;
		}
	}
	
	public CassettaPosta(String nome) {
		this(nome,5);
	}
	
	//in dubbio se serve o no
	public String getNome() {
		return nome;
	}

	public boolean inserisciLettera() {
		if(numeroLettere < numeroLettereMax) {
			numeroLettere++;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public int prelevaPosta() {
		int temp = numeroLettere;
		numeroLettere = 0;
		return temp;
	}
	
	public boolean equals(CassettaPosta altra) {
		if(altra == null) {
			return false;
		}
		else if(this == altra) {
			return true;
		}
		else if(this.nome.equals(altra.nome)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return "nome CP: " + nome + ";\nLettere attuali: " + numeroLettere + ";\nLettere massime: " + numeroLettereMax;
	}
	
	
	
}
