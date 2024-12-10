package com.distribuida.principaldao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class FacturaDetalleDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDetalleDAO facturaDetalleDAO = context.getBean("facturaDetalleDAOImpl",FacturaDetalleDAO.class);
		FacturaDAO facturaDAO = context.getBean("facturaDAOImpl",FacturaDAO.class); 
		LibroDAO libroDAO = context.getBean("libroDAOImpl",LibroDAO.class); 
		
		//add
		
		Libro libro = libroDAO.findOne(1);
		Factura factura = facturaDAO.findOne(5);
		FacturaDetalle facturadetalle = new FacturaDetalle(); 
		facturadetalle.setIdFacturaDetalle(0); 
		facturadetalle.setCantidad(156);
		facturadetalle.setSubtotal(132.14);
		facturadetalle.setFactura(factura);
		facturadetalle.setLibro(libro);
		
		//facturaDetalleDAO.add(facturadetalle);
		
		//up
				
		Libro libro1 = libroDAO.findOne(1);
		Factura factura1 = facturaDAO.findOne(5);
		FacturaDetalle facturadetalle1 = new FacturaDetalle(); 
		facturadetalle1.setIdFacturaDetalle(23); 
		facturadetalle1.setCantidad(258);
		facturadetalle1.setSubtotal(342.14);
		facturadetalle1.setFactura(factura1);
		facturadetalle1.setLibro(libro1);
				
		//facturaDetalleDAO.add(facturadetalle1);
				
		//del 
				
		//libroDAO.delete(23);
				
		//findOne 
			
		try {
			System.out.println(facturaDetalleDAO.findOne(211).toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
		//findAll
			
		facturaDetalleDAO.findAll().forEach(item ->{		
			System.out.println(item.toString());
		});

		context.close();

	}

}
