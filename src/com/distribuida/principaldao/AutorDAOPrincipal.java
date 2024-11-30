package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class AutorDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		
		//Insert 
		//Autor autor = new Autor(0,"Gabriel", "García Márquez", "Colombia", "Calle Real #123", "1234567890", "gabriel.garcia@correo.com");
		//autorDAO.add(autor);
		
		//update
		//Autor autor2 = new Autor(1,"Isabel", "Allende", "Chile", "Av. Providencia #456", "9876543210", "isabel.allende@correo.com");
		//autorDAO.up(autor2);
		
		//findOne
		try {
			Autor autor3 = autorDAO.findOne(1);
			System.out.println(autor3.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		
		
		// delete
		autorDAO.del(1);
		
		
		//findAll
		List<Autor> autores = autorDAO.findAll();
		
		for (Autor item : autores) {
			System.out.println(item.toString());
		}
		
		context.close();

	}

}