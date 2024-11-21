package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class FacturaDetallePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear cliente
		Cliente cliente = new Cliente(1,"1234567890","Juan","Pérez","Calle Falsa 123","555-1234","juan.perez@mail.com");

        // Crear factura
        Factura factura = new Factura(1, "FAC-0001", new Date(), 100.25, 15.25,115.50, cliente);

        // Crear libro
        Libro libro = new Libro(1,"Cien años de soledad","Editorial XYZ",400,"1ra edición","Español",new Date(),"Un libro famoso","Tapa dura","978-3-16-148410-0",5,"portada.jpg","Paperback",25.50, 
        new Categoria(1, "Literatura", "Género literario que incluye novelas, cuentos, poesía, etc."), 
        new Autor(1, "Gabriel", "García Márquez", "Colombia", "Calle Ficticia 123", "555-5555", "gabriel@correo.com"));

        // Crear detalle de factura
        FacturaDetalle facturaDetalle = new FacturaDetalle(1,3,25.50 * 3,factura,libro);

        // Imprimir resultados
        System.out.println("Factura creada: " + factura.toString());
        System.out.println("Detalle de factura: " + facturaDetalle.toString());
	}

}
