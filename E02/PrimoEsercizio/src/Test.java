public class Test {
    public static void main(String[] args) {
        A a1;
        A a2;
        A a3;

        a1 = new A();
        a2 = new A();
        a1.v1 = 2;
        a1.v2 = 1;
        a2.v2 = 1;

        //confronti tra a1 ed a2
        System.out.println("a2.v1: " + a2.v1);
        System.out.println("Confronto tra a1.v1 e a2.v1: " + (a1.v1 == a2.v1));
        System.out.println("Confronto tra a1.v2 e a2.v2: " + (a1.v2 == a2.v2));
        System.out.println("Confronto tra attributi: " + (a1.v1 == a2.v1 && a1.v2 == a2.v2));
        System.out.println("Identità: " + (a1 == a2));

        a3 = a2;

        System.out.println();
        //confronti tra a1 ed a3
        System.out.println("Confronto tra a1.v1 e a3.v1: " + (a1.v1 == a3.v1));
        System.out.println("Confronto tra a1.v2 e a3.v2: " + (a1.v2 == a3.v2));
        System.out.println("Confronto tra attributi: " + (a1.v1 == a3.v1 && a1.v2 == a3.v2));
        System.out.println("Identità: " + (a1 == a3));
    }
}
