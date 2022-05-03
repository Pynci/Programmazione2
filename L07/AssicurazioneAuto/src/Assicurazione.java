
public class Assicurazione {
	private Auto auto;
	
	public Assicurazione(Auto auto) {
		this.auto = auto;
	}
	
	public double calcolaPremio() {
		if(auto.getValore() < 10000) {
			return auto.getValore() * 0.2;
		}
		else {
			return auto.getValore() * 0.1;
		}
	}
	
	public String toString() {
		//arrivato qui calcolaPremio() non chiama il metodo della classe Assicurazione
		//ma quello della sottoclasse AssicurazioneBonusMalus (la ragione la affronteremo col polimorfismo)
		return auto.toString() + " premio=" + calcolaPremio();
	}
}
