public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.añadirLibro("El Quijote", "Cervantes", "97-8840806-1052",1560 , "Novela");
        biblioteca.añadirLibro("Los pilares de la Tierra", "Ken Follett", "97-5440806-1055", 1068, "Novela");
        biblioteca.añadirLibro("Libro de Poemas", "Federico Garcia Lorca", "97-5440806-1050", 164, "Poesia");
        biblioteca.mostrarLibros();
        biblioteca.getNovelas();
        biblioteca.getPoesia();
        biblioteca.mostrarLibroMasLargo();
        biblioteca.eliminarLibro("97-8840806-1052");
        biblioteca.mostrarLibros();
    }
}
