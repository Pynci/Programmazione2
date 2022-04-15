public class Taxi {
    private int totaleCorseEffettuate;
    private Corsa[] corseEffettuate;
    private Corsa corsaInSvolgimento;

    public Taxi() {
        totaleCorseEffettuate = 0;
        this.corseEffettuate = new Corsa[5];
    }

    public boolean nuovaCorsa(String destinazione) {
        if(this.corsaInSvolgimento == null && destinazione != null && !destinazione.equals("") && totaleCorseEffettuate < 5) {
            corsaInSvolgimento = new Corsa(destinazione);
            return true;
        }
        else {
            return false;
        }
    }

    public void terminaCorsa(int kmPercorsi) {
        if(corsaInSvolgimento != null) {
            corsaInSvolgimento.aggiungiKm(kmPercorsi);
            int i = 0;
            while(i < corseEffettuate.length) {
                if(corseEffettuate[i] == null) {
                    corseEffettuate[i] = new Corsa(corsaInSvolgimento.getDestinazione());
                    corseEffettuate[i].aggiungiKm(corsaInSvolgimento.getKmPercorsi());
                    totaleCorseEffettuate++;
                    i = corseEffettuate.length;
                }
                i++;
            }
            corsaInSvolgimento = null;
        }
    }

    public int getTotaleCorseEffettuate() {
        return totaleCorseEffettuate;
    }

    public boolean isLibero() {
        if(corsaInSvolgimento == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public Corsa trovaCorsaConCostoMaggiore(String destinazione) {
        boolean trovata = false;
        Corsa corsaMaxCosto = new Corsa(destinazione);

        for(int i = 0; i < corseEffettuate.length; i++) {
            if(corseEffettuate[i] != null && corseEffettuate[i].getDestinazione().equals(destinazione)) {
                trovata = true;
                if(corseEffettuate[i].calcolaTariffa() > corsaMaxCosto.calcolaTariffa()) {
                    corsaMaxCosto = corseEffettuate[i];
                }
            }
        }

        if(trovata) {
            return corsaMaxCosto;
        }
        else {
            return null;
        }
    }


}