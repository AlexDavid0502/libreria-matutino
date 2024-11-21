package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cliente cliente = new Cliente(1,"1728998679","Juan","Taipe","Tumbaco","0967456878","jtaipe@correo.com");
		Cliente cliente2 = new Cliente(2,"1724087745","Alex","Cóndor","Yaruqui","0987546201","alex@correo.com");
		
		
		System.out.println(cliente.toString());
		System.out.println(cliente2.toString());

	}

}
