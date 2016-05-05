package co.com.ensayoMVC.jpa.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import co.com.ensayoMVC.DAO.ReservaDAO;
import co.com.ensayoMVC.model.ReservaDTO;

public class JPAReservaDAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindReservaById() {
		ClassPathXmlApplicationContext context=null;
		try {
			// Se obtiene el contexto de la aplicacion

			context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

			// Se obtiene el servicio que implementa los servicios de la base de
			// datos
			ReservaDAO reservaDAO = (ReservaDAO) context.getBean(ReservaDAO.class);

			// Se realiza el insert
			ReservaDTO reserva = reservaDAO.findReservaById(1);
			System.out.println("Hora inicio: " + reserva.getHora_inicio());
			System.out.println("Hora final " + reserva.getHora_final());

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			context.close();
		}
	}

}
