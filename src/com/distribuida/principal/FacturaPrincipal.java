package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente = new Cliente(1,"1728998679","Juan","Taipe","Tumbaco","0967456878","jtaipe@correo.com");
		Cliente cliente2 = new Cliente(2,"1724087745","Alex","Cóndor","Yaruqui","0987546201","alex@correo.com");
		
		Factura factura = new Factura();
		
		factura.setIdFactura(1);
		factura.setFecha(new Date());
		factura.setNumFactura("FAC-0001");
		factura.setTotalNeto(100.25);
		factura.setIva(15.25);
		factura.setTotal(116.25);
		
		Factura factura2 = new Factura();
        factura2.setIdFactura(2);
        factura2.setFecha(new Date());
        factura2.setNumFactura("FAC-0002");
        factura2.setTotalNeto(200.50);
        factura2.setIva(30.50);
        factura2.setTotal(231.00);
		
		
		// inyeccion de dependencias
		factura.setCliente(cliente);
		
		factura2.setCliente(cliente2);
		
		
		System.out.println(factura.toString());
		System.out.println(factura2.toString());
		
		

	}

}
