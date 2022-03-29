//ESERCIZIO 6 PDF ASSOCIAZIONI
public class Test {
    public static void main(String[] args) {
        Azienda azienda1 = new Azienda();
        azienda1.dipendente1 = new Dipendente();
        azienda1.dipendente2 = new Dipendente();
        azienda1.dipendente3 = new Dipendente();

        azienda1.dipendente1.matricola = 1234;
        azienda1.dipendente2.matricola = 1235;
        azienda1.dipendente3.matricola = 1236;

        azienda1.dipendente1.costo = 1000.0;
        azienda1.dipendente2.costo = 1100.0;
        azienda1.dipendente3.costo = 900.0;

        double costoComplessivo;
        costoComplessivo = azienda1.dipendente1.costo + azienda1.dipendente2.costo + azienda1.dipendente3.costo;
        System.out.println("Costo complessivo: " + costoComplessivo);

        azienda1.dipendente2 = new Dipendente();
        //TODO: continuare qui (il testo va interpretato dato che non si capisce una mazza)
    }
}
