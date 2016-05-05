package co.com.ensayoMVC.jpa.dao;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ensayoMVC.DAO.BarberoDAO;
import co.com.ensayoMVC.DAO.ServicioDAO;
import co.com.ensayoMVC.model.ServicioDTO;

public class JPAServiciosTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testListServicios() {
		ClassPathXmlApplicationContext context=null;
		try {
			// Se obtiene el contexto de la aplicacion

			context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

			// Se obtiene el servicio que implementa los servicios de la base de
			// datos
			ServicioDAO servicioDAO = (ServicioDAO) context.getBean(ServicioDAO.class);

			// Se realiza el insert
			List<ServicioDTO> servicios;
			servicios = servicioDAO.listServicios();
			for (ServicioDTO l : servicios) {

				System.out.println(l.getNombre() + " " + l.getDescripcion() + l.getFoto_servicio() + " ");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			context.close();
		}
	}

}
