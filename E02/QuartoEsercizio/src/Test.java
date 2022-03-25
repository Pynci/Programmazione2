//Testo dell'esercizio: vedi esercizio 3 slide associazioni
public class Test {
    public static void main(String[] args) {
        Vagone testa = new Vagone();
        testa.classe = 1;

        Vagone vagone2 = new Vagone();
        vagone2.classe = 1;

        testa.next = vagone2;
        testa.next.next = new Vagone();
        testa.next.next.classe = 2;
        testa.next.next.next = new Vagone();
        testa.next.next.next.classe = 2;

        Vagone temp = testa;
        //NB: si poteva palesemente fare con un do-while
        System.out.println(temp.classe);
        while(temp.next != null){
            temp = temp.next;
            System.out.println(temp.classe);
        }

        Vagone nuovaTesta = new Vagone();
        nuovaTesta.classe = 2;
        nuovaTesta.next = testa;
    }
}
