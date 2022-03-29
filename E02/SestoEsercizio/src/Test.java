//ESERCIZIO 6 PDF ASSOCIAZIONI
public class Test {
    public static void main(String[] args) {
        Azienda azienda1 = new Azienda();
        azienda1.dipendenti = new Dipendente[3];
        double costoComplessivo = 0.0;

        //inizializzo i dipendenti
        for(int i = 0; i < azienda1.dipendenti.length; i++){
            azienda1.dipendenti[i] = new Dipendente();
        }

        //primo dipendente
        azienda1.dipendenti[0].matricola = 1234;
        azienda1.dipendenti[0].costo = 1000.0;

        //secondo dipendente
        azienda1.dipendenti[1].matricola = 1235;
        azienda1.dipendenti[1].costo = 1100.0;

        //terzo dipendente
        azienda1.dipendenti[2].matricola = 1236;
        azienda1.dipendenti[2].costo = 900.0;

        //stampo a video il costo complessivo
        for(int i = 0; i < azienda1.dipendenti.length; i++){
            costoComplessivo += azienda1.dipendenti[i].costo;
        }
        System.out.println("Costo complessivo: " + costoComplessivo);

        //licenzio il dipendente 1235
        for(int i = 0; i < azienda1.dipendenti.length; i++){
            if(azienda1.dipendenti[i].matricola == 1235){
                azienda1.dipendenti[i] = new Dipendente(); //il costo passa a 0
            }
        }

        //stampo nuovamente a video il costo complessivo
        costoComplessivo = 0;
        for(int i = 0; i < azienda1.dipendenti.length; i++){
            costoComplessivo += azienda1.dipendenti[i].costo;
        }
        System.out.println("Costo complessivo: " + costoComplessivo);
    }
}
