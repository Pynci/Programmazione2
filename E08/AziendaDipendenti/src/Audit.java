
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
	
	public boolean isSorted(Dipendente[] dipendenti) throws InvalidArrayException {
		try {
			
			Dipendente precedente = dipendenti[0];
			for(int i = 0; i < dipendenti.length; i++) {
				Dipendente successivo = dipendenti[i];
				if(successivo.calcolaRal() > precedente.calcolaRal()) {
					return false;
				}
				precedente = successivo;
			}
			return true;
			
		}
		catch(NullPointerException npe) {
			throw new InvalidArrayException();
		}
		catch(IndexOutOfBoundsException ioobe) {
			return true;
		}
		
	}
	
	public Dipendente topRal(Dipendente[] dipendenti) throws InvalidArrayException {
		if(isSorted(dipendenti)) {
			return dipendenti[0];
		}
		else {
			throw new InvalidArrayException("array non ordinato");
		}
	}
	
}
