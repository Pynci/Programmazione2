// IL COMANDO javadoc NELLA CONSOLE PERMETTE DI GENERARE LA DOCUMENTAZIONE SCRITTA TRAMITE COMMENTI
// Oppure, in intelliJ tools --> Generate JavaDoc

/**
 * Questa classe rappresenta un Rettangolo con base e altezza di tipo int
*/
public class Rettangolo {
    /** Rappresenta la base del rettangolo */
    public int base;
    /** Rappresenta l'altezza del rettangolo */
    public int altezza;

    //a) metodo semplice
    /**
     * Il metodo calcola e restituisce l'area del rettangolo
     * @return l'area del rettangolo
     */
    public int calcolaArea(){
        int area;
        area = base * altezza;  //NB: lo scope degli attributi è tutta la classe, anche dentro ai metodi
        return area;
    }

    /**
     * Verifica se base e altezza del rettangolo sono uguali
     * @param base1 Rappresenta la base.
     * @param altezza1 Rappresenta l'altezza.
     * @return true se sono uguali, false in caso contrario.
     */
    //b) tipi primitivi come parametri formali, inizio definizione equals
    public boolean equals(int base1, int altezza1){
        if(base == base1 && altezza == altezza1){
            return true;
        }
        return false;
    }

    public String toString(){
        String stato;
        int area = calcolaArea();

        stato = "Rettangolo di base: " + base + ", altezza: " + altezza + " e area: " + area;
        return stato;
    }

    //mi è creare un metodo con lo stesso identificativo a patto di cambiare i parametri formali
    //NB: non devo cambiare i NOMI dei parametri formali, ma i tipi!
    public boolean equals(Rettangolo rettangolo){
        //faccio questo controllo per evitare NullPointer Exception
        if(rettangolo == null){
            return false;
        }
        //l'identità da sicuramente esito true
        if(this == rettangolo){
            return true;
        }
        if(base == rettangolo.base && altezza == rettangolo.altezza){
            return true;
        }
        return false;
    }
}
