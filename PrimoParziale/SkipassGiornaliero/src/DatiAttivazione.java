
public class DatiAttivazione {
	private int giorno;
	private String nome;
	
	public DatiAttivazione(int giorno, String nome) {
		//controllo che il giorno sia valido
		if(giorno > 0 && giorno <= 365) {
            this.giorno = giorno;
	    }
	    else {
	            this.giorno = 1;
	    }
		
		this.nome = nome;
	}
	
	public int getGiorno() {
		return giorno;
	}
	
	public String getNome() {
		return nome;
	}
}
