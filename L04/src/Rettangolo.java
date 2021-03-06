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

    public Rettangolo(){
        //this() serve a usare il nome della classe per risolvere il costruttore
        this(1,1);
        //NB: la keyword "this()" deve essere la prima istruzione presente nel costruttore!
    }

    public Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    public Rettangolo(Rettangolo rettangolo){
        this(rettangolo.base, rettangolo.altezza);
        //NB: do per scontato che rettangolo sarà diverso da null, altrimenti dovrei effettuare
        //un controllo e non potrei utilizzare la keyword this()
    }

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
        return rettangolo.equals(base, altezza);
    }

    //in questo metodo non si fa mai riferimento a this --> posso scriverlo come un metodo di classe --> STATIC
    public static boolean equals(Rettangolo r1, Rettangolo r2){
        if(r1 != null && r2 != null){
            if(r1.base == r2.base && r1.altezza == r2.altezza){
                return true;
            }
        }
        return false;
    }

}
