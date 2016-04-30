package co.com.ensayoMVC.jpa.dao;



import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ensayoMVC.DAO.LugarDAO;
import co.com.ensayoMVC.model.LugarDTO;

public class JPALugarDAOTest {
	ClassPathXmlApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindLugarById() {
		
		try {
	    	 // Se obtiene el contexto de la aplicacion
		   
			context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

		    // Se obtiene el servicio que implementa los servicios de la base de datos
		    LugarDAO lugarDAO = (LugarDAO) context.getBean(LugarDAO.class);

		    // Se realiza el insert
		    LugarDTO lugar = lugarDAO.findLugarById(1);
		    System.out.println("Nombre: " + lugar.getNombre());
		    System.out.println("Direccion: " + lugar.getDireccion());
			
		}catch(Exception e){
			System.out.println("Error a ejecutar consulta");
		} finally {
			context.close();
		}
	}

}
