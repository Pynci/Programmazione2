public class Test {
    public static void main(String[] args) {
        //PRIMO APPROCCIO

        Arbitro arbitro = new Arbitro();
        Squadra squadra1 = new Squadra();
        Squadra squadra2 = new Squadra();
        Partita partita = new Partita();

        arbitro.nome = "Tagliavento";
        arbitro.numeroTesserino = 12345;

        squadra1.nome = "Inter";
        squadra2.nome = "Sampdoria";

        partita.stadio = "Meazza";
        partita.arbitro = arbitro;
        partita.squadraDiCasa = squadra1;
        partita.squadraOspite = squadra2;

        System.out.println("DATI PARTITA");
        System.out.println("Nome arbitro: " + partita.arbitro.nome);
        System.out.println("Squadra di casa: " + partita.squadraDiCasa.nome);
        System.out.println("Squadra ospite: " + partita.squadraOspite.nome);
        System.out.println("Stadio: " + partita.stadio);
        System.out.println();

        squadra2.nome = "Juventus";

        System.out.println("DATI PARTITA");
        System.out.println("Nome arbitro: " + partita.arbitro.nome);
        System.out.println("Squadra di casa: " + partita.squadraDiCasa.nome);
        System.out.println("Squadra ospite: " + partita.squadraOspite.nome);
        System.out.println("Stadio: " + partita.stadio);
    }
}
