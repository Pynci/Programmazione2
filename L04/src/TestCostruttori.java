public class TestCostruttori {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo();
        System.out.println(r1.toString());

        Rettangolo r2 = new Rettangolo(8,10);
        System.out.println(r2.toString());

        Rettangolo r3 = new Rettangolo(r2); //NB: r2 e r3 sono due istanze diverse con lo stesso stato
        System.out.println(r3.toString());
    }
}
