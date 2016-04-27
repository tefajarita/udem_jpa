package co.com.ensayoMVC.jpa.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
		//BeanFactory factoryObj = new ClassPathXmlApplicationContext("file:Spring-Datasource-JPA.xml");
		 LugarDAO lugarDAO = (LugarDAO) context.getBean(LugarDAO.class);		 
		 
		assertNotNull( lugarDAO.findLugarById(1));
		 ((AbstractApplicationContext) context).close();
	}

}
