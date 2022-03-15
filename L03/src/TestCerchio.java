public class TestCerchio {
    public static void main(String[] args) {
        //NB
        //Il valore di default dei tipi complessi è null (che significa "non referenzia nessun oggetto", non "indefinito")


        //dichiaro p1 e gli assegno un nuovo oggetto di tipo Punto
        Punto p1 = new Punto();
        //dichiaro c1 di tipo complesso Cerchio e gli assegno un nuovo oggetto di tipo Cerchio
        Cerchio c1 = new Cerchio();

        //Assegno l'oggetto puntato da p1 a c1.centro (che è di tipo Punto)
        c1.centro = p1;
        //se ora facessi un confronto con == risulterebbe true perché puntano alla stessa area di memoria

        //modifico le coordinate del centro passando sia dal cerchio che dal punto stesso,
        //a dimostrazione del fatto che puntano allo stesso oggetto
        c1.centro.x = 1;
        p1.y = 1;

        //Ora creo un cerchio che a differenza del primo non ha nel main un riferimento diretto al proprio centro
        Cerchio c2 = new Cerchio();
        c2.centro = new Punto();    //in questo modo è possibile accedere all'oggetto Punto (centro del cerchio) solo passando da c2
        c2.centro.x = 1;
        c2.centro.y = 1;

        //ora effettuo delle prove di identità e uguaglianza
        boolean esito = c1 == c2;
        System.out.println(esito);

        esito = c1.centro == p1;
        System.out.println(esito);

        esito = (c2.raggio == c1.raggio) && (c2.centro.x == c1.centro.x) && (c2.centro.y == c1.centro.y);
        System.out.println(esito);
    }
}
