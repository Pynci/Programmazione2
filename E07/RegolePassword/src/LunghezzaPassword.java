
public class LunghezzaPassword extends Regola {

	private int lunghezzaMinima;
	
	public LunghezzaPassword(int lunghezzaMinima) {
		this.lunghezzaMinima = lunghezzaMinima;
	}

	@Override
	protected boolean applica(Account account) {
		if(account.getPassword().length() >= lunghezzaMinima) {
			return true;
		}
		return false;
	}

}
