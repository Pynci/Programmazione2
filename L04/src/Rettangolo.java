public class Rettangolo {
    public int base;
    public int altezza;

    //a) metodo semplice
    public int calcolaArea(){
        int area;
        area = base * altezza;  //NB: lo scope degli attributi è tutta la classe, anche dentro ai metodi
        return area;
    }

    //b) tipi primitivi come parametri formali, inizio definizione equals
    public boolean equals(int base1, int altezza1){
        if(base == base1 && altezza == altezza1){
            return true;
        }
        return false;
    }
}
