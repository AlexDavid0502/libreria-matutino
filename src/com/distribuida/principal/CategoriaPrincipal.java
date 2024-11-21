package com.distribuida.principal;

import com.distribuida.entities.Categoria;

public class CategoriaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear algunas instancias de Categoria
        Categoria categoria1 = new Categoria(1, "Ficción", "Libros de ficción literaria");
        Categoria categoria2 = new Categoria(2, "No Ficción", "Libros de no ficción sobre diversos temas");
        Categoria categoria3 = new Categoria(3, "Ciencia", "Libros científicos y académicos");
 
        // Imprimir las categorías utilizando el método toString
        System.out.println(categoria1.toString());
        System.out.println(categoria2.toString());
        System.out.println(categoria3.toString());

	}

}
