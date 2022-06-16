
public class EsameOrale extends Esame {

	private double voto;
	
	public EsameOrale(int CFU, String codice, double voto) throws EsameNonValidoException {
		super(CFU, codice);
		if(voto >= 18 && voto <= 31) {
			this.voto = voto;
		}
		else throw new EsameNonValidoException("ATTENZIONE: voto non valido");
	}
	
	@Override
	public double voto() {
		return voto;
	}

}
