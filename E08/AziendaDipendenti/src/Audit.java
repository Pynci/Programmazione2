
public class Audit {
	
	public boolean benefitTroppoAlto(Dipendente dipendente) {
		try {
			Dirigente dirigente = (Dirigente) dipendente;
			double benefit = dirigente.getBenefit();
			if(benefit > 10000) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(NullPointerException npe) {
			System.out.println("WARNING: reference is null");
		}
		catch(ClassCastException cce) {
			System.out.println("WARNING: invalid cast");
		}
		catch(Exception e) {
			System.out.println("WARNING: an error occured");
		}
		finally {
			System.out.println("Exception handled!");
		}
		return false;
	}
	
}
