public class TestArray {
    public static void main(String[] args) {
        //array di tipo primitivo
        int arrayInt[];
        arrayInt = new int[3];  //gli elementi vengono inizializzati a 0 in quanto interi
        arrayInt[2] = 2;

        //array di tipo complesso
        Punto arrayPunto[];
        arrayPunto = new Punto[3];  //gli elementi vengono inizializzati a null in quanto tipi complessi (riferimenti a oggetti)
        arrayPunto[2] = new Punto();


        //Specifica: voglio inserire un punto nella prima posizione libera dell'array
        Punto p2 = new Punto();
        boolean trovata = false;
        for(int i = 0; i < arrayPunto.length && !trovata; i++){
            if(arrayPunto[i] == null){
                arrayPunto[i] = p2;
                trovata = true;
            }
        }

        for(int i = 0; i < arrayPunto.length; i++){
            System.out.println(arrayPunto[i]);
        }

    }
}
