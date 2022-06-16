
public abstract class Volo {
	
	private String aeroportoPartenza;
	private String aeroportoArrivo;
	
	public Volo(String aeroportoPartenza, String aeroportoArrivo) throws VoloNonValidoException {
		if(Aeroporti.aeroportoValido(aeroportoPartenza)) {
			this.aeroportoPartenza = aeroportoPartenza;
		}
		else {
			throw new VoloNonValidoException("ATTENZIONE: aeroporto di partenza non valido");
		}
		
		if(Aeroporti.aeroportoValido(aeroportoPartenza)) {
			this.aeroportoArrivo = aeroportoArrivo;
		}
		else {
			throw new VoloNonValidoException("ATTENZIONE: aeroporto di arrivo non valido");
		}
		
	}
	
	public abstract int getNumeroTratte();
	public abstract int getDurataInMinuti();

	public String getAeroportoPartenza() {
		return aeroportoPartenza;
	}

	public String getAeroportoArrivo() {
		return aeroportoArrivo;
	}
	
	public String toString() {
		return "[aeroportoPartenza:" + aeroportoPartenza + ",aeroportoArrivo:" + aeroportoArrivo + "]"; 
	}
	
}
