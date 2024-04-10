package com.raquel.biblioteca;

public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private int numPaginas;

	public Libro(String isbn, String titulo, String autor, int numPaginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public static void compararNumPaginas2Libros(Libro libro1, Libro libro2) {
		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println("El libro con ISBN " + libro1.getIsbn() + " tiene más páginas");
		} else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
			System.out.println("El libro " + libro2.getIsbn() + " tiene más páginas");
		} else {
			System.out.println("Los 2 libros tienen las mismas páginas");
		}
	}

	@Override
	public String toString() {
		return "El libro con ISBN " + isbn + ", creado por el autor " + autor + ", tiene " + numPaginas + " páginas";
	}

}
