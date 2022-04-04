public class Azienda {
    public String nome;
    public Dipendente[] dipendenti;

    public String toString(){
        String statoDipendenti = "";
        for(int i = 0; i < dipendenti.length; i++){
            statoDipendenti = statoDipendenti + "Dipendente " + i + "\n " + dipendenti[i].toString() + "\n";
        }
        return statoDipendenti;
    }

    public double calcolaCosto(){
        double costoTotale = 0.0;
        for(int i = 0; i < dipendenti.length; i++){
            costoTotale += dipendenti[i].costo;
        }

        return costoTotale;
    }

    public boolean assumi(String nome, int matricola, double costo){

        boolean giaPresente = false;
        boolean postoTrovato = false;

        for(int i = 0; i < dipendenti.length; i++){
            if(dipendenti[i] != null && dipendenti[i].matricola == matricola){
                giaPresente = true;
            }
        }

        if(!giaPresente){
            for(int i = 0; i < dipendenti.length; i++) {
                if(dipendenti[i] == null){
                    dipendenti[i] = new Dipendente();
                    dipendenti[i].nome = nome;
                    dipendenti[i].matricola = matricola;
                    dipendenti[i].costo = costo;
                    postoTrovato = true;
                }
            }
        }

        return postoTrovato;
    }

    public Dipendente licenzia(int matricola){
        Dipendente licenziato = new Dipendente();

        for(int i = 0; i < dipendenti.length; i++){
            if(dipendenti[i] != null && dipendenti[i].matricola == matricola){
                licenziato.nome = dipendenti[i].nome;
                licenziato.matricola = dipendenti[i].matricola;
                licenziato.costo = dipendenti[i].costo;
                dipendenti[i] = null;
            }
        }

        return licenziato;
    }


}
