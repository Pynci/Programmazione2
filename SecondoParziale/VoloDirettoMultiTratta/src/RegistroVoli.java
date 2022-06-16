import java.io.*;
import java.util.*;

public class RegistroVoli {
	private Map<String,Volo> voli;
	
	public RegistroVoli() {
		voli = new HashMap<String,Volo>();
	}
	
	public Volo getVolo(String codice) {
		return voli.get(codice);
	}
	
	public void aggiungiVolo(String codice, Volo volo) throws CodiceVoloNonValidoException {
		if(codice.length() == 5) {
			voli.put(codice, volo);
		}
		else throw new CodiceVoloNonValidoException("ATTENZIONE: la lunghezza del codice non è valida");
	}
	
	public void aggiungiVolo(String codice, String aeroportoPartenza, String aeroportoArrivo, int durata) throws CodiceVoloNonValidoException, VoloNonValidoException {
		aggiungiVolo(codice, new VoloDiretto(aeroportoPartenza, aeroportoArrivo, durata));
	}
	
	public String[] getListaCodiciDeiVoli() {
		String[] arrayCodici = new String[voli.size()];
		Set<String> codici = voli.keySet();
		int i = 0;
		
		for(String codice: codici) {
			arrayCodici[i] = codice.toString();
			i++;
		}
		
		return arrayCodici;
	}
	
	public void dumpSuFile(String nomeFile) throws IOException {
		PrintWriter streamSuFile = new PrintWriter(new FileOutputStream(nomeFile));
		Set<String> codici = voli.keySet();
		
		for(String codice: codici) {
			streamSuFile.print(codice + " ");
			streamSuFile.println(voli.get(codice));
			if(streamSuFile.checkError()) {
				streamSuFile.close();
				throw new IOException("ATTENZIONE: errore nella scrittura su file");
			}
		}
		
		streamSuFile.close();
	}
}
