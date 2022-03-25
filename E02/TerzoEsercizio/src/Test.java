//Testo dell'esercizio: vedi UML esercizio 2 delle slide sulle associazioni
public class Test {
    public static void main(String[] args) {
        Lettera lettera = new Lettera();
        lettera.peso = 80;

        lettera.mittente = new Persona();
        lettera.mittente.nome = "Pluto";
        lettera.mittente.indirizzo = "Milano";

        lettera.destinatario = new Persona();
        lettera.destinatario.nome = "Pippo";
        lettera.destinatario.indirizzo = "Roma";

        //prima lettera --> primo metodo (utilizzando i reference allo stesso oggetto di prima)
        Lettera risposta1 = new Lettera();
        risposta1.mittente = lettera.destinatario;
        risposta1.destinatario = lettera.mittente;

        //seconda lettera --> secondo metodo (creazione di un nuovo oggetto e copia dello stato di quello precedente)
        Lettera risposta2 = new Lettera();
        //NB: se capita nullPointer Exception è perché non ho istanziato gli oggetti dichiarati internamente alla classe risposta2 (ma volendo comunque dargli un valore)
        risposta2.mittente = new Persona();
        risposta2.destinatario = new Persona();
        risposta2.mittente.nome = lettera.destinatario.nome;
        risposta2.destinatario.nome = lettera.mittente.nome;
        risposta2.mittente.indirizzo = lettera.destinatario.indirizzo;
        risposta2.destinatario.indirizzo = lettera.mittente.indirizzo;

        lettera.mittente.nome = "Panco";

        System.out.println("Dati lettera");
        System.out.println("nome mittente: " + lettera.mittente.nome);
        System.out.println("nome destinatario: " + lettera.destinatario.nome);
        System.out.println();

        System.out.println("Dati risposta1");
        System.out.println("nome mittente: " + risposta1.mittente.nome);
        System.out.println("nome destinatario: " + risposta1.destinatario.nome);
        System.out.println();

        System.out.println("Dati risposta2");
        System.out.println("nome mittente: " + risposta2.mittente.nome);
        System.out.println("nome destinatario: " + risposta2.destinatario.nome);
        System.out.println();
    }
}
