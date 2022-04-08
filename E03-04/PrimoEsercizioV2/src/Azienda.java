public class Azienda {
    public String nome;
    private Dipendente[] dipendenti;

    public Azienda(){
        dipendenti = new Dipendente[1];
        nome = "prova";
    }

    public Azienda(String nome, int numeroDipendenti){
        this.nome = nome;
        dipendenti = new Dipendente[numeroDipendenti];
    }

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
        return nome + "\n" + statoDipendenti;
    }

    public double calcolaCosto(){
        double costoTotale = 0.0;
        for(int i = 0; i < dipendenti.length; i++){
            costoTotale += dipendenti[i].getCosto();
        }

        return costoTotale;
    }

    public boolean assumi(String nome, double costo){

        boolean postoTrovato = false;

        int i = 0;
        do{
            if(dipendenti[i] == null){
                dipendenti[i] = new Dipendente(nome,getNewMatricola(),costo);
                postoTrovato = true;
            }
            i++;
        }
        while(i < dipendenti.length && !postoTrovato);

        return postoTrovato;
    }

    public boolean assumi(Dipendente nuovoDip){
        if(nuovoDip != null){
            return assumi(nuovoDip.getNome(), nuovoDip.getCosto());
        }
        else{
            return false;
        }
    }

    public Dipendente licenzia(int matricola){
        Dipendente licenziato = new Dipendente();

        for(int i = 0; i < dipendenti.length; i++){
            if(dipendenti[i] != null && dipendenti[i].getMatricola() == matricola){
                licenziato.setNome(dipendenti[i].getNome());
                //licenziato.matricola = dipendenti[i].matricola;
                licenziato.setCosto(dipendenti[i].getCosto());
                dipendenti[i] = null;
            }
        }

        return licenziato;
    }

    public Dipendente licenzia(Dipendente dip){
        if(dip != null){
            return licenzia(dip.getMatricola());
        }
        return null;
    }

    public int numDip(){
        if(dipendenti != null){
            return dipendenti.length;
        }
        else{
            return 0;
        }
    }

    private int getNewMatricola(){
        int max = 0;

        for(int i = 0; i < numDip(); i++){
            if(dipendenti[i] != null && dipendenti[i].getMatricola() > max){
                max = dipendenti[i].getMatricola();
            }
        }

        if(max == 0){
            return 0;
        }
        else{
            return max+1;
        }
    }

    //TODO: metodi contains


}
