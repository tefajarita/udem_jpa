package co.com.ensayoMVC.jpa.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.ensayoMVC.DAO.BarberoDAO;
import co.com.ensayoMVC.model.BarberoDTO;

public class JPABarberoDAOTest {

	ClassPathXmlApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindBarberoById() {
		try {
			// Se obtiene el contexto de la aplicacion

			context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

			// Se obtiene el servicio que implementa los servicios de la base de
			// datos
			BarberoDAO barberoDAO = (BarberoDAO) context.getBean(BarberoDAO.class);

			// Se realiza el insert
			BarberoDTO barbero = barberoDAO.findBarberoById("1037625757");
			System.out.println("Nombre: " + barbero.getNombre());
			System.out.println("Direccion: " + barbero.getApellido());

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			context.close();
		}
	}

	@Test
	public void testListBarberosPorLugar() {
		try {
			// Se obtiene el contexto de la aplicacion

			context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

			// Se obtiene el servicio que implementa los servicios de la base de
			// datos
			BarberoDAO barberoDAO = (BarberoDAO) context.getBean(BarberoDAO.class);

			// Se realiza el insert
			List<BarberoDTO> barbero;
			barbero = barberoDAO.listBarberosPorLugar(2);
			for (BarberoDTO l : barbero) {

				System.out.println(l.getNombre() + " " + l.getDescripcion() + l.getFotoperfil() + " ");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			context.close();
		}
	}

	@Test
	public void testListBarbero() {
		try {
			// Se obtiene el contexto de la aplicacion

			context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");

			// Se obtiene el servicio que implementa los servicios de la base de
			// datos
			BarberoDAO barberoDAO = (BarberoDAO) context.getBean(BarberoDAO.class);

			// Se realiza el insert
			List<BarberoDTO> barbero;
			barbero = barberoDAO.listBarbero();
			for (BarberoDTO l : barbero) {

				System.out.println(l.getNombre() + " " + l.getDescripcion() + l.getFotoperfil() + " ");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			context.close();
		}
	}
}
