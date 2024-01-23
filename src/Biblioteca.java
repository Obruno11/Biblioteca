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
    private Libro[] Biblioteca = new Libro[100];

    public Biblioteca() {
        for (int i=0; i<Biblioteca.length;i++){
            Libro libro= new Libro();
            Biblioteca[i]= libro;
        }
    }

    // Devuelve true si añade el libro en la biblioteca o false en caso contrario
    public boolean añadirLibro(String titulo, String autor, String isbn, int numPaginas, String generoLiterario) {
        for (int i = 0; i < 100; i++) {
            Libro libro=Biblioteca[i];
            if (libro.getTitulo() == null) {
                Libro guardarLibro = new Libro(titulo, autor, isbn, numPaginas, generoLiterario);
                Biblioteca[i]=guardarLibro;
                return true;
            }
        }
        return false;
    }

    // Elimina el libro con el isbn indicado
    public void eliminarLibro(String isbn) {
        for (int i = 0; i < 100; i++) {
            Libro libro=Biblioteca[i];
            if (libro.getIsbn() != null && libro.getIsbn().equals(isbn)) {
                libro.setTitulo(null);
                libro.setAutor(null); 
                libro.setIsbn(null);
                libro.setNumPaginas(0);
                libro.setGenerosLiterario(null);
            }

        }
    }

    // Muestra todos los libros de la biblioteca
    public void mostrarLibros() {
        System.out.println("Los libros de la biblioteca son:");
        for (int i = 0; i < 100; i++) {
            Libro libro=Biblioteca[i];
            if (libro.getTitulo() != null) {
                libro.imprimirLibro();
            }
        }
        System.out.println();

    }

    // Muestra los libros con el genero literario Novela
    public void getPorGenero(String genero) {
        System.out.println("Los libros de novela de la biblioteca son:");

        for (int i = 0; i < 100; i++) {
            Libro libro=Biblioteca[i];
            if (libro.getGenerosLiterario() != null && libro.getGenerosLiterario().equals(genero)) {
                libro.imprimirLibro();
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
            Libro libro=Biblioteca[i];
            if (libro.getAutor() != null && libro.getAutor().equals(autor)) {
                librosAutor[contador] = libro.getTitulo();
                contador++;
            }
        }
        return librosAutor;
    }

    // Nos devuelve el titulo del libro con mas paginas
    public void mostrarLibroMasLargo() {
        int max = 0;
        String titulo = "";
        for (int i = 0; i < 100; i++) {
            Libro libro=Biblioteca[i];
            if (libro.getNumPaginas() > max) {
                max = libro.getNumPaginas();
                titulo = libro.getTitulo();
            }
        }
        System.out.println("El libro mas largo es: " + titulo);
    }

}
