package com.distribuida.principaldao;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class LibroDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		LibroDAO libroDAO = context.getBean("libroDAOImpl",LibroDAO.class);
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl",CategoriaDAO.class);
		AutorDAO autorDAO = context.getBean("autorDAOImpl",AutorDAO.class);
		
		//add
	
		Categoria categoria = categoriaDAO.findOne(1);
		Autor autor = autorDAO.findOne(5);
		Libro libro = new Libro(); 
		libro.setIdLibro(0);
		libro.setTitulo("Caperucita");
		libro.setEditorial("Lojas");
		libro.setNumPaginas(45);
		libro.setEdicion("ilimitada");
		libro.setIdioma("Español");
		libro.setFechaPublicacion(new Date());
		libro.setDescripcion("Cuentos infantiles apropiados");
		libro.setTipoPasta("Doble");
		libro.setiSBN("nose");
		libro.setNumEjemplares(545);
		libro.setPortada("Grande");
		libro.setPresentacion("Digital, fisica");
		libro.setPrecio(14.35);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		
		
		//libroDAO.add(libro);  
		
		//up 
		
		Categoria categoria1 = categoriaDAO.findOne(1);
		Autor autor1 = autorDAO.findOne(5);
		Libro libro1 = new Libro(); 
		libro1.setIdLibro(79);
		libro1.setTitulo("Caperucita Roja Extendida");
		libro1.setEditorial("Librería Loja S.A.");
		libro1.setNumPaginas(445);
		libro1.setEdicion("Primera Edición");
		libro1.setIdioma("Español");
		libro1.setFechaPublicacion(new Date());
		libro1.setDescripcion("Una recopilación ampliada de cuentos infantiles con enfoque educativo.");
		libro1.setTipoPasta("Doble");
		libro1.setiSBN("nose");
		libro1.setNumEjemplares(545);
		libro1.setPortada("Grande");
		libro1.setPresentacion("Digital, fisica");
		libro1.setPrecio(14.35);
		libro1.setCategoria(categoria1);
		libro1.setAutor(autor1);
		
		
		//libroDAO.add(libro1);  
		
		//del 
		
		//libroDAO.delete(79);
		
		//findOne 
		
		try {
			System.out.println(libroDAO.findOne(211).toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
		
		//findAll
	
		libroDAO.findAll().forEach(item ->{
			System.out.println(item.toString());
		});

		context.close();

	}

}
