
public class ParcoAuto {
	private Auto[] autoAziendali;
	
	public ParcoAuto(int maxAuto) {
		autoAziendali = new Auto[maxAuto];
	}
	
	public Auto trovaAuto(Auto auto) {
		Auto trovata = null;
		
		if(auto != null) {
			int i = 0;
			while(i < autoAziendali.length && trovata == null) {
				if(autoAziendali[i] != null && autoAziendali[i].equals(auto)) {
					trovata = autoAziendali[i];
				}
				i++;
			}
		}
		
		return trovata;
	}
	
	public boolean inserisciNuovaAuto(String targa) {
		boolean inserita = false;
		
		if(targa != null && trovaAuto(new Auto(targa)) == null) {
			int i = 0;
			while(i < autoAziendali.length && !inserita) {
				if(autoAziendali[i] == null) {
					autoAziendali[i] = new Auto(targa);
					inserita = true;
				}
				i++;
			}
		}
		
		return inserita;
	}
	
	public boolean rientroAuto(Auto autoRientrata) {
		Auto autoDelParco = trovaAuto(autoRientrata);
		
		if(autoDelParco != null) {
			return autoDelParco.aggiornaKm(autoRientrata.getKmPercorsi() - autoDelParco.getKmPercorsi());
		}
		else {
			return false;
		}
	}
	
	public boolean rientroAuto(String targa, int kmAlRientro) {
		return rientroAuto(new Auto(targa,kmAlRientro));
	}
	
	
}
