Spackage com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

public class CategoriaDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
		
		//Insert 
		//Categoria categoria = new Categoria(0,"Tecnología", "Productos relacionados con tecnología y gadgets.");
		//categoriaDAO.add(categoria);
		
		//update
		//Categoria categoria2 = new Categoria(51,"Literatura", "Libros, novelas y publicaciones literarias.");
		//categoriaDAO.up(categoria2);
		
		//findOne
		try {
			Categoria categoria3 = categoriaDAO.findOne(51);
			System.out.println(categoria3.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		
		
		// delete
		categoriaDAO.del(50);
		
		
		//findAll
		List<Categoria> categorias = categoriaDAO.findAll();
		
		for (Categoria item : categorias) {
			System.out.println(item.toString());
		}
		
		context.close();

	}

}