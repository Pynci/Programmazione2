
public class VoloDiretto extends Volo {
	
	private int durataInMinuti;
	private int numeroTratte;
	
	public VoloDiretto(String aeroportoPartenza, String aeroportoArrivo, int durataInMinuti) throws VoloNonValidoException {
		super(aeroportoPartenza, aeroportoArrivo);
		numeroTratte = 1;
		
		if(durataInMinuti > 0) {
			this.durataInMinuti = durataInMinuti;
		}
		else {
			throw new VoloNonValidoException("ATTENZIONE: durata non valida");
		}

	}
	
	@Override
	public int getNumeroTratte() {
		return numeroTratte;
	}

	@Override
	public int getDurataInMinuti() {
		return durataInMinuti;
	}
	
	public String toString() {
		return "{" + super.toString() + "[durataInMinuti:" + getDurataInMinuti() + "]" + "}";
	}
}
