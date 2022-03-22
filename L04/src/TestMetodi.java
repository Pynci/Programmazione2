public class TestMetodi {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo();
        r1.base = 2;
        r1.altezza = 4;

        Rettangolo r2 = new Rettangolo();
        r2.base = 4;
        r2.altezza = 2;

        //a)
        System.out.println("a)");
        int a1 = r1.calcolaArea();
        int a2 = r2.calcolaArea();
        System.out.println("Area r1: " + a1);
        System.out.println("Area r2: " + a2);

        //b)
        System.out.println("b)");
        boolean esito;
        esito = r1.equals(2,6);
        System.out.println("Esito del confronto:" + esito);

    }
}
