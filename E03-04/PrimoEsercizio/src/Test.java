//Esercizio 1 (pdf incapsulamento)
public class Test {
    public static void main(String[] args) {
        //creazione azienda
        Azienda azienda = new Azienda();
        azienda.nome = "Andrews Construction";
        azienda.dipendenti = new Dipendente[3];

        //creazione e stampa primo dipendente
        Dipendente primoDipendente = new Dipendente();
        primoDipendente.nome = "Michele Scalogni";
        primoDipendente.matricola = 1;
        primoDipendente.costo = 100.0;
        System.out.println("Primo primoDipendente:");
        System.out.println(primoDipendente.toString() + "\n");

        //assunzione primo dipendente
        azienda.assumi(primoDipendente);
        System.out.println(azienda.toString());

        //creazione secondo dipendente
        Dipendente secondoDipendente = new Dipendente();
        secondoDipendente.matricola = 2;
        secondoDipendente.nome = "Casemiro Grumaioli";
        secondoDipendente.costo = 140.0;

        //assunzione secondo dipendente
        azienda.assumi(secondoDipendente);
        System.out.println(azienda.toString());

        //licenziamento primo dipendente
        primoDipendente = azienda.licenzia(1);
        System.out.println(azienda);

        //assunzione nuovo dipendente
        azienda.assumi("Pueblo Scatarri",3,150.0);
        System.out.println(azienda);
    }
}
