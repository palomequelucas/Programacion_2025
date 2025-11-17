package Trabajopractico2;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean prestado; // false = disponible, true = prestado

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prestado = false; // Por defecto inicia disponible
    }

    /**
     * Intenta prestar el libro.
     * @return true si se pudo prestar, false si ya estaba prestado.
     */
    public boolean prestar() {
        if (!prestado) {
            prestado = true;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Devuelve el libro (lo marca como disponible).
     */
    public void devolver() {
        this.prestado = false;
    }

    /**
     * Devuelve una cadena con la información del libro.
     */
    public String obtenerInformacion() {
        String estado = prestado ? "Prestado" : "Disponible";
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Estado: " + estado;
    }

    public String getTitulo() {
        return titulo;
    }
}
