public class Azienda {
    public String nome;
    public Dipendente[] dipendenti;

    public String toString(){
        String statoDipendenti = "";
        for(int i = 0; i < dipendenti.length; i++){
            if(dipendenti[i] != null){
                statoDipendenti = statoDipendenti + "Dipendente " + i + "\n " + dipendenti[i].toString() + "\n";
            }
            else{
                statoDipendenti = statoDipendenti + "Dipendente " + i + "\n " + "Posto vuoto\n";
            }
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
            int i = 0;
            do{
                if(dipendenti[i] == null){
                    dipendenti[i] = new Dipendente();
                    dipendenti[i].nome = nome;
                    dipendenti[i].matricola = matricola;
                    dipendenti[i].costo = costo;
                    postoTrovato = true;
                }
                i++;
            }
            while(i < dipendenti.length && postoTrovato == false);
        }

        return postoTrovato;
    }

    public boolean assumi(Dipendente nuovoDip){
        if(nuovoDip != null){
            return assumi(nuovoDip.nome, nuovoDip.matricola, nuovoDip.costo);
        }
        return false;
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

    public Dipendente licenzia(Dipendente dip){
        if(dip != null){
            return licenzia(dip.matricola);
        }
        return null;
    }


}
