public class Dipendente {
    private String nome = "";
    private int matricola = 0;
    private double costo = 0.0;

    public Dipendente(){
        this("innominato",0,1000);
    }

    public Dipendente(String nome, int matricola, double costo){
        this.nome = nome;
        this.matricola = matricola;
        this.costo = costo;
    }

    public Dipendente(String nome, int matricola){
        this(nome, matricola, 1000);
    }

    public Dipendente(Dipendente dipendente){
        this(dipendente.nome, dipendente.matricola, dipendente.costo);
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricola() {
        return matricola;
    }

    private void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String toString(){
        String statoMatricola = "Matricola: " + matricola + "; ";
        String statoCosto = "Costo: " + costo + "; ";

        return statoMatricola + statoCosto;
    }

    public boolean equals(Dipendente dipendente){
        if(dipendente == null){
            return false;
        }
        if(dipendente == this){
            return true;
        }
        if(dipendente.matricola == this.matricola){
            return true;
        }
        else{
            return false;
        }
    }
}
