public class Libro {

    private String titulo;
    private String autor;
    private final int ISBN;
    private int numPaginas;

    /**
     * Es el constructor con parámetros
     * Crea un libro con un título y ISBN especificados
     * @param titulo Establece el titulo del libro.
     * @param ISBN Establece el codigo del libro.
     */

    public Libro(String titulo, int ISBN){
        this.titulo = titulo;
        this.ISBN = ISBN;
    }

    /**
     * Es el constructor con parámetros
     * Crea un libro con un título y ISBN especificados
     * @param titulo Establece el titulo del libro.
     * @param ISBN Establece el codigo del libro.
     * @param autor Establece el autor del libro.
     * @param numPaginas Establece el numero de paginas del libro.
     */

    public Libro(String titulo, int ISBN, String autor, int numPaginas){
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = "";
        this.numPaginas = 0;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    //Siempre se tirne que llamar toString
    /**
     * Devuelve la representación en formato de cadena (String) del objeto circulo
     * @return Una cadena que representa el objeto circulo en forma de texto
     */

    public String toString(){
        return "El libro titulo " + this.titulo + ", de " + this.autor + " con ISBN: " + this.ISBN + " tiene " + this.numPaginas + " páginas";
    }


    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Las tempestalidas" ,123456789);
        Libro libro2 = new Libro("Juego de tronos",123456789,"R.R.Martin",568);
        System.out.println("El libro uno es " + libro1 + " y el libro dos es " + libro2);
    }
}
