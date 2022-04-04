public class Dipendente {
    public String nome = "";
    public int matricola = 0;
    public double costo = 0.0;

    public String toString(){
        String statoMatricola = "Matricola: " + matricola + "; ";
        String statoCosto = "Costo: " + costo + "; ";

        return statoMatricola + statoCosto + "\n";
    }
}
