public class TestVagone {
    public static void main(String[] args) {
        //liste (associazioni a cappio)

        Vagone v1 = new Vagone();
        v1.classe = 2;

        Vagone v2 = new Vagone();
        v2.classe = 2;

        Vagone v3 = new Vagone();
        v3.classe = 1;

        //Creo i riferimenti "agganciando i vagoni"
        v1.next = v2;
        v2.next = v3;

        //Se volessi avere un solo reference, senza avvalermi di v2 e v3? (creando la locomotiva e il treno che la segue)
        Vagone locomotiva = new Vagone();
        locomotiva.classe = 2;
        locomotiva.next = new Vagone();
        locomotiva.next.classe = 2;
        locomotiva.next.next = new Vagone();
        locomotiva.next.next.classe = 1;

        //Implementazione inserimento di un elemento
        Vagone tmp = locomotiva.next.next;
        locomotiva.next.next = new Vagone();
        locomotiva.next.next.next = tmp;


        //Implementazione dello scorrimento di una lista
        tmp = locomotiva;
        while(tmp != null){
            System.out.println(tmp.classe);
            tmp = tmp.next;
        }
    }
}
