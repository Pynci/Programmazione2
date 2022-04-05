public class Cerchio {
    private int raggio;
    private Punto centro;

    public Cerchio(int raggio, Punto centro){
        setRaggio(raggio);
        setCentro(centro);
    }

    public Cerchio(int raggio){
        this(raggio, new Punto());
    }

    public Cerchio(){
        this(1);
    }

    //costruttore per copia
    public Cerchio(Cerchio cerchio){
        this(cerchio.raggio, cerchio.centro);
        //NB: posso usare la dotNotation anche se sono attributi privati perché mi trovo dentro la classe
    }

    public void setRaggio(int raggio) {
        if(raggio > 0){
            this.raggio = raggio;
        }
        else{
            this.raggio = 1;
        }
    }

    public void setCentro(Punto centro) {
        if(centro != null){
            this.centro = centro;
        }
        else{
            this.centro = new Punto();
        }
    }

    public int getRaggio() {
        return raggio;
    }

    public Punto getCentro() {
        return centro;
    }

    public String toString(){
        return "Carchio di raggio: " + raggio + ", e centro " + centro;
        //NB: anche non scrivendo raggio.toString() o centro.toString() viene richiamato tale metodo
        // perché sto effettuando una concatenazione di una stringa
    }

    public boolean equals(Cerchio cerchio){
        if(cerchio == null){
            return false;
        }
        if(this == cerchio){
            return true;
        }
        if(raggio == cerchio.raggio && equals(cerchio)){    //è come scrivere this.equals(cerchio)
            return true;
        }
        return false;
    }
}
