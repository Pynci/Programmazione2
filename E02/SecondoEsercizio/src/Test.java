//Testo dell'esercizio: vedi UML esercizio 1b, slide associazioni
public class Test {
    public static void main(String[] args) {
        Tesi tesi = new Tesi();
        tesi.titolo = "Visualizzatore di spazi";

        Docente docente1 = new Docente();
        docente1.nome = "Rossi";

        Laureando pippo = new Laureando();
        pippo.nome = "Pippo";
        pippo.matricola = 123456;
        pippo.tesi = tesi;
        pippo.relatore = docente1;

        //NB: il testo dell'esercizio non vuole un riferimento al docente correlatore direttamente nel main
        pippo.correlatore = new Docente();
        pippo.correlatore.nome = "Bianchi";

        Laureando pluto = new Laureando();
        pluto.nome = "Pluto";
        pluto.relatore = pippo.relatore;
        pluto.correlatore = pippo.correlatore;
        pluto.correlatore.nome = "Bianchissimo";

        System.out.println("Dati pippo");
        System.out.println("nome: " + pippo.nome);
        System.out.println("matricola: " + pippo.matricola);
        System.out.println("relatore: " + pippo.relatore.nome);
        System.out.println("correlatore: " + pippo.correlatore.nome);
        System.out.println();

        System.out.println("Dati pluto");
        System.out.println("nome: " + pluto.nome);
        System.out.println("matricola: " + pluto.matricola);
        System.out.println("relatore: " + pluto.relatore.nome);
        System.out.println("correlatore: " + pluto.correlatore.nome);
        System.out.println();
        System.out.println();

        pluto.correlatore = new Docente();  //creo il docente senza riferimento diretto nel main
        pluto.correlatore.nome = pippo.correlatore.nome;    //in questo modo hanno lo stesso STATO
        pluto.correlatore.nome = "Bianchi";

        System.out.println("Dati pippo");
        System.out.println("nome: " + pippo.nome);
        System.out.println("matricola: " + pippo.matricola);
        System.out.println("relatore: " + pippo.relatore.nome);
        System.out.println("correlatore: " + pippo.correlatore.nome);
        System.out.println();

        System.out.println("Dati pluto");
        System.out.println("nome: " + pluto.nome);
        System.out.println("matricola: " + pluto.matricola);
        System.out.println("relatore: " + pluto.relatore.nome);
        System.out.println("correlatore: " + pluto.correlatore.nome);
        System.out.println();
    }
}
