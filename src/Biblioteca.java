/*
 Biblioteca: Guarda los libros en 4 arrays.
 Como maximo tendrá 100 libros.
 Cada posición de los arrays corresponde a los datos de un libro.
 Por ejemplo:
 la posición 0 del array de títulos contiene: "El Quijote"
 la posición 0 del array de autores contiene: "Cervantes"
 la posición 0 del array de isbns contiene: "978-84-15474-01-1"
 la posición 0 del array de numPaginas contiene: 863
 la posición 0 del array de generosLiterarios contiene: "Novela"

 
    Encapsula los arrays de la clase Biblioteca en una clase y 
    refactoriza los metodos de la clase Biblioteca.

*/

public class Biblioteca {
    private String[] titulos;
    private String[] autores;
    private String[] isbns;
    private int[] numPaginas;
    private String[] generosLiterarios;

    public Biblioteca() {
        titulos = new String[100];
        autores = new String[100];
        isbns = new String[100];
        numPaginas = new int[100];
        generosLiterarios = new String[100];
    }

    // Devuelve true si añade el libro en la biblioteca o false en caso contrario
    public boolean añadirLibro(String titulo, String autor, String isbn, int numPaginas, String generoLiterario) {

        for (int i = 0; i < 100; i++) {
            if (titulos[i] == null) {
                titulos[i] = titulo;
                autores[i] = autor;
                isbns[i] = isbn;
                this.numPaginas[i] = numPaginas;
                generosLiterarios[i] = generoLiterario;
                return true;
            }
        }
        return false;
    }

    // Elimina el libro con el isbn indicado
    public void eliminarLibro(String isbn) {
        for (int i = 0; i < 100; i++) {
           
                if (isbns[i] != null&&isbns[i].equals(isbn)) {
                    titulos[i] = null;
                    autores[i] = null;
                    isbns[i] = null;
                    numPaginas[i] = 0;
                }
            
        }
    }

    // Muestra todos los libros de la biblioteca
    public void mostrarLibros() {
        System.out.println("Los libros de la biblioteca son:");
        for (int i = 0; i < 100; i++) {
            if (titulos[i] != null) {
                System.out.print("Titulo: " + titulos[i]);
                System.out.print("Autor: " + autores[i]);
                System.out.print("ISBN: " + isbns[i]);
                System.out.print("Numero de paginas: " + numPaginas[i]);
                System.out.print("Genero literario: " + generosLiterarios[i]);
                System.out.println(" ");
            }
        }
        System.out.println();

    }

    // Muestra los libros con el genero literario Novela
    public void getNovelas() {
        System.out.println("Los libros de novela de la biblioteca son:");

        for (int i = 0; i < 100; i++) {

            if (generosLiterarios[i] != null && generosLiterarios[i].equals("Novela")) {

                System.out.print("Titulo: " + titulos[i]);
                System.out.print("Autor: " + autores[i]);
                System.out.print("ISBN: " + isbns[i]);
                System.out.print("Numero de paginas: " + numPaginas[i]);
                System.out.println(" ");
            }

        }
        System.out.println();

    }

    // Muestra los libros con el genero literario Poesia
    public void getPoesia() {
        System.out.println("Los libros de poesia de la biblioteca son:");
        for (int i = 0; i < 100; i++) {

            if (generosLiterarios[i] != null && generosLiterarios[i].equals("Poesia")) {
                System.out.print("Titulo: " + titulos[i]);
                System.out.print("Autor: " + autores[i]);
                System.out.print("ISBN: " + isbns[i]);
                System.out.print("Numero de paginas: " + numPaginas[i]);
                System.out.println(" ");
            }
        }

        System.out.println();

    }

    // Nos devuelve un array con los titulos de los libros de un autor
    public String[] librosDeAutor(String autor) {
        System.out.println("Los libros del autor:" + autor + " son:");
        String[] librosAutor = new String[100];
        int contador = 0;
        for (int i = 0; i < 100; i++) {

            if (autores[i] != null && autores[i].equals(autor)) {
                librosAutor[contador] = titulos[i];
                contador++;
            }

        }
        return librosAutor;
    }

    // Nos devuelve el titulo del libro con mas paginas
    public void mostrarLibroMasLargo() {
        int max = 0;
        String titulo="";
        for (int i = 0; i < 100; i++) {
            if (numPaginas[i] > max) {
                max = numPaginas[i];
                titulo = titulos[i];
            }
        }
       System.out.println("El libro mas largo es: "+ titulo);
    }

}
