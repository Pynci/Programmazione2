//Esercizio 1 (pdf incapsulamento)
public class Test {
    public static void main(String[] args) {
        Azienda azienda = new Azienda();
        azienda.nome = "Andrews Construction";
        azienda.dipendenti = new Dipendente[3];

        Dipendente primoDipendente = new Dipendente();
        primoDipendente.nome = "Michele Scalogni";
        primoDipendente.matricola = 1;
        primoDipendente.costo = 100.0;
        System.out.println("Primo primoDipendente:");
        System.out.println(primoDipendente.toString() + "\n");

        azienda.assumi(primoDipendente);
        System.out.println(azienda.toString());

        Dipendente secondoDipendente = new Dipendente();
    }
}
