package co.com.ensayoMVC.jpa.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import co.com.ensayoMVC.jpa.entities.Lugar;

public class JPALugarDAOTest {

	private ApplicationContext context;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		context = new ClassPathXmlApplicationContext("Spring-Datasource-JPA.xml");
		
		 LugarDAO lugarDAO = (LugarDAO) context.getBean("lugar");
		 int lugarId =1;
		 
		assertNotNull( lugarDAO.findLugarById(lugarId));
	}

}
