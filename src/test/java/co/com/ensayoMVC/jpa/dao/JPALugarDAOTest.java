package co.com.ensayoMVC.jpa.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ensayoMVC.jpa.dao.LugarDAO;
import co.com.ensayoMVC.jpa.entities.Lugar;

public class JPALugarDAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindLugarById() {
		  // Se obtiene el contexto de la aplicacion
	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

	    // Se obtiene el servicio que implementa los servicios de la base de datos
	    LugarDAO lugarDAO = (LugarDAO) context.getBean(LugarDAO.class);

	    // Se realiza el insert
	    Lugar lugar = lugarDAO.findLugarById(1);
	    System.out.println("Nombre: " + lugar.getNombre());
	    System.out.println("Direccion: " + lugar.getDireccion());
	}

}
