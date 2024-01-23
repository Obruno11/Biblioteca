public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int numPaginas;
    private String generosLiterario;

    public Libro() {
        this.titulo = null;
        this.autor = null;
        this.isbn = null;
        this.numPaginas = 0;
        this.generosLiterario = null;
    }

    public Libro(String titulo, String autor, String isbn, int numPaginas, String generosLiterario) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.generosLiterario = generosLiterario;
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

    public void setAutor(String autore) {
        this.autor = autore;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenerosLiterario() {
        return generosLiterario;
    }

    public void setGenerosLiterario(String generosLiterario) {
        this.generosLiterario = generosLiterario;
    }

    public void imprimirLibro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Numero de paginas: " + numPaginas);
        System.out.println("Genero literario: " + generosLiterario);
        System.out.println(" ");
    }
}
