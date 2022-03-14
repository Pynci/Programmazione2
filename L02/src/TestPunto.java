public class TestPunto {
  public static void main(String a[]) {
    //dichiarazione
    //tipo id;
    int v;
    int w;

    Punto p1;
    Punto p2;


    //assegnare un valore
    v = 3;
    w = 3;

    //3;
    //creo un'istanza di tipo Punto
    // new Classe()
    p1 = new Punto();
    p2 = new Punto();

    //identità
    boolean esito = false;
    if(v == w)
      esito = true;
    System.out.println(esito);

    esito = false;
    if(p1 == p2)
      esito = true;
    System.out.println("identita' " + esito);

    //accesso ai valori
    //nomeistanza.attributo
    p1.x = 1;
    p2.x = 1;

    esito = false;
    if(p1.x == p2.x && p1.y == p2.y)
      esito = true;

    System.out.println("ugiaglianza " + esito);

    int z = v;
    Punto p3 = p1;

    esito = false;
    if(p1 == p3)
      esito = true;
    System.out.println("identita' " + esito);

    p2 = null;
  }
}
