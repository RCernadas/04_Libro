package com.raquel.biblioteca;

public class Main {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("323243FDF", "Guerra y Paz", "Tolstoi", 427);
		Libro libro2 = new Libro("074388VNA", "Crítica de la razón pura", "Kant", 873);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		Libro.compararNumPaginas2Libros(libro1, libro2);
	}
}
