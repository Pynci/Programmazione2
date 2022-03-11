public class PuntoTest {
    public static void main(String[] args) {
        int v;
        int w;
        Punto p1;
        Punto p2;

        v = 3;
        w = 3;

        p1 = new Punto();
        p2 = new Punto();

        //identità
        boolean esito = false;
        if(p1 == p2){
            esito = true;
        }
        System.out.println("Identità: " + esito);

        //accesso ai valori
        p1.x = 1;
        p2.x = 1;

        //completare il codice
    }
}
