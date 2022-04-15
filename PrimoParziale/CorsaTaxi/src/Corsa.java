public class Corsa {
    private String destinazione;
    private double costoKm;
    private int kmPercorsi;

    //costruttori

    public Corsa(String destinazione, double costoKm) {
        this.destinazione = destinazione;
        this.costoKm = costoKm;
        this.kmPercorsi = 0;
    }

    public Corsa(String destinazione) {
        this(destinazione,0.5);
    }

    //getter

    public String getDestinazione() {
        return destinazione;
    }

    public double getCostoKm() {
        return costoKm;
    }

    public int getKmPercorsi() {
        return kmPercorsi;
    }

    public void aggiungiKm(int kmPercorsi) {
        if(kmPercorsi >= 0) {
            this.kmPercorsi += kmPercorsi;
        }
    }

    public double calcolaTariffa() {
        return costoKm * kmPercorsi;
    }

    public double calcolaTariffa(int supplemento) {
        return calcolaTariffa() + supplemento;
    }
}
