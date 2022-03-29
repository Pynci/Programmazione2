public class Test {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.pagine = new Pagina[5];

        //inizializzo le pagine
        for(int i = 0; i < libro.pagine.length; i++){
            libro.pagine[i] = new Pagina();
        }
        libro.pagine[0].testo = "Testo della prima pagina";
        libro.pagine[1].testo = "Testo della seconda pagina";
        libro.pagine[2].testo = "Testo della terza pagina";
        libro.pagine[3].testo = "Testo della quarta pagina";
        libro.pagine[4].testo = "Testo della quinta pagina";

        //stampo il libro
        System.out.println("Prima stampa del libro");
        for(int i = 0; i < libro.pagine.length; i++){
            System.out.println("Pagina " + (i+1) + ": " + libro.pagine[i].testo);
        }
        System.out.println();

        //strappo la seconda pagina
        libro.pagine[1] = new Pagina();

        //ristampo il libro
        System.out.println("Ristampa del libro");
        for(int i = 0; i < libro.pagine.length; i++){
            System.out.println("Pagina " + (i+1) + ": " + libro.pagine[i].testo);
        }
        System.out.println();

    }
}
