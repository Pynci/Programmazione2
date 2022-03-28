public class NuovoTest {
    public static void main(String[] args) {
        //SECONDO APPROCCIO

        Partita partita = new Partita();
        partita.arbitro = new Arbitro();
        partita.squadraOspite = new Squadra();
        partita.squadraDiCasa = new Squadra();

        partita.arbitro.nome = "Tagliavento";
        partita.arbitro.numeroTesserino = 12345;
        partita.squadraDiCasa.nome = "Inter";
        partita.squadraOspite.nome = "Sampdoria";
        partita.stadio = "Meazza";

        System.out.println("DATI PARTITA");
        System.out.println("Nome arbitro: " + partita.arbitro.nome);
        System.out.println("Squadra di casa: " + partita.squadraDiCasa.nome);
        System.out.println("Squadra ospite: " + partita.squadraOspite.nome);
        System.out.println("Stadio: " + partita.stadio);
    }
}
