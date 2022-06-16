import java.util.List;

public class VoloMultiTratta extends Volo {
	
	private List<VoloDiretto> tratte;
	
	public VoloMultiTratta(List<VoloDiretto> tratte) throws VoloNonValidoException {
		super(estraiAeroportoPartenza(tratte), estraiAeroportoArrivo(tratte));
		
		VoloDiretto precedente = tratte.get(0);
		for(int i = 1; i < tratte.size(); i++) {
			if(!precedente.getAeroportoArrivo().equals(tratte.get(i).getAeroportoPartenza())) {
				throw new VoloNonValidoException("ATTENZIONE: le tratte non corrispondono");
			}
			precedente = tratte.get(i);
		}
		
		this.tratte = tratte;
	}
	
	private static String estraiAeroportoPartenza(List<VoloDiretto> tratte) throws VoloNonValidoException {
		if(tratte != null && tratte.size() >= 2) {
			return tratte.get(0).getAeroportoPartenza();
		}
		else throw new VoloNonValidoException("ATTENZIONE: numero di tratte insufficiente");
	}
	
	private static String estraiAeroportoArrivo(List<VoloDiretto> tratte) throws VoloNonValidoException {
		if(tratte != null && tratte.size() >= 2) {
			return tratte.get(tratte.size()-1).getAeroportoArrivo();
		}
		else throw new VoloNonValidoException("ATTENZIONE: numero di tratte insufficiente");
	}
	
	@Override
	public int getNumeroTratte() {
		return tratte.size();
	}

	@Override
	public int getDurataInMinuti() {
		int somma = 0;
		for(VoloDiretto volo: tratte) {
			somma += volo.getDurataInMinuti();
		}
		return somma;
	}
	
	public String toString() {
		return "{" + super.toString() + "[numeroTratte:" + getNumeroTratte() + "][durataInMinuti:" + getDurataInMinuti() + "]";
	}

}
