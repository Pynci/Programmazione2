
public abstract class Regola {
	
	public boolean convalida(Account account) {
		if (account == null || account.getPassword() == null || account.getPassword().isEmpty()) {
			return false;
		} 
		return applica(account);
	}
	
	protected abstract boolean applica(Account account);
	
	
}
