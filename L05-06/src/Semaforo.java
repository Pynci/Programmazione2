public class Semaforo {
    private int colore = 2;

    public void setColore(int colore){
        if(colore >= 0 && colore <= 2){
            this.colore = colore;
        }
    }

    public void cambiaColore(){
        colore = (colore + 1) % 3;
    }

    public int getColore(){
        return colore;
    }
}
