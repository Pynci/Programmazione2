public class TestPrivacyLeak {
    public static void main(String[] args) {
        Punto p = new Punto(1, 1);
        Cerchio c = new Cerchio(2, p);
        System.out.println(c);

        //SE ESPRESSAMENTE RICHIESTO:
        //le modifiche al cerchio dovrebbero essere effettuate solo dal metodo set nella classe Cerchio
        //qui è possibile accedere al centro del cerchio dall'esterno!
        p.setX(100);
        System.out.println(c);

        //stessa cosa per il get: non deve essere possibile prendere con il get il riferimento diretto
        //all'oggetto Punto che rappresenta il centro del cerchio
        Punto centroC = c.getCentro();
        centroC.setX(90);
        System.out.println(c);

        //come risolvere? modificando il get affinché restituisca un nuovo oggetto con lo stesso stato di quello richiesto
    }
}
