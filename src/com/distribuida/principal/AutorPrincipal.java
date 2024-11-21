package com.distribuida.principal;

import com.distribuida.entities.Autor;

public class AutorPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor autor = new Autor(1, "Gabriel", "García Márquez", "Colombia", "Calle Ficticia 123", "3001234567", "gabriel@mail.com");
        
        Autor autor2 = new Autor(2, "Paulo", "Coelho", "Brasil", "Calle aqui a lado", "2069786521", "paulo@gmail.com");
        // Imprimir la información del autor usando el método toString
        System.out.println(autor.toString());
        
        System.out.println(autor2.toString());

	}

}
