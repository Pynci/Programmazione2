
public class Uguaglianza extends Regola {

	@Override
	protected boolean applica(Account account) {
		if(account.getUsername().equals(account.getPassword())) {
			return false;
		}
		return true;
	}

}
