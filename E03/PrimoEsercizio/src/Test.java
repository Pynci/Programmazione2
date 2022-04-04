//Esercizio 1 (pdf incapsulamento)
public class Test {
    public static void main(String[] args) {
        Azienda azienda = new Azienda();
        azienda.dipendenti = new Dipendente[3];

        Dipendente dipendente = new Dipendente();
        dipendente.nome = "Michele Scalogni";
        dipendente.matricola = 1;
        dipendente.costo = 100.0;
        System.out.println("Primo dipendente:");
        System.out.println(dipendente.toString());

        azienda.assumi(dipendente);
        System.out.println(azienda.toString());
    }
}
