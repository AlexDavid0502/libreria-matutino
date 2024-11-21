package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class LibroPrincipal {

	public static void main(String[] args) {
		
		// Crear una instancia de Autor
		
		Autor autor = new Autor(1, "Gabriel", "García Márquez", "Colombia", "Calle Ficticia 123", "3001234567", "gabriel@mail.com");
		
		// Crear una instancia de Categoria
		
		Categoria categoria1 = new Categoria(1, "Ficción", "Libros de ficción literaria");
		
        // Crear una instancia de Libro
        
        Libro libro = new Libro(1,"Cien años de soledad","Editorial XYZ",400,"1ra edición","Español",new Date(),"Un libro muy famoso de Gabriel García Márquez","Tapa dura","978-3-16-148410-0",5,"portada.jpg","Paperback",25.50,categoria1,autor);
        
        // Imprimir la información del libro usando el método toString}
        
        System.out.println(libro.toString());

	}

}
