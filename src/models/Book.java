package models;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public int compareTo(Book o) {
        // Título descendente
        int compTitulo = o.titulo.compareTo(this.titulo);
        if (compTitulo != 0) return compTitulo;

        // Año ascendente
        int compAnio = Integer.compare(this.anio, o.anio);
        return compAnio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return anio == book.anio && titulo.equals(book.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, anio); // Solo título y año
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + anio + ")";
    }
}
