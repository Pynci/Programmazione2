
public class EsameScritto extends Esame {
	
	public static final int PESO_TEORIA = 40;
	private double votoTeoria;
	private double votoPratica;
	
	public EsameScritto(int CFU, String codice, double votoTeoria, double votoPratica) throws EsameNonValidoException {
		super(CFU, codice);
		if((votoTeoria + votoPratica)/2 >= 18 && (votoTeoria + votoPratica)/2 <= 31) {
			this.votoTeoria = votoTeoria;
			this.votoPratica = votoPratica;
		}
		else throw new EsameNonValidoException("ATTENZIONE: uno o più voti non sono validi");
	}
	
	@Override
	public double voto() {
		return (PESO_TEORIA * votoTeoria + (100-PESO_TEORIA) * votoPratica)/100;
	}

}
