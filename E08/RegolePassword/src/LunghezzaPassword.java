
public class LunghezzaPassword extends Regola {

	private int lunghezzaMinima;
	
	public LunghezzaPassword(int lunghezzaMinima) throws RegolaException {
		if(lunghezzaMinima > 0) {
			this.lunghezzaMinima = lunghezzaMinima;
		}
		else {
			throw new RegolaException("lunghezza minima invalida");
		}
	}

	@Override
	protected boolean applica(Account account) {
		if(account.getPassword().length() >= lunghezzaMinima) {
			return true;
		}
		return false;
	}

}
