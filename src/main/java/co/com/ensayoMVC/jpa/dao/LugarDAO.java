package co.com.ensayoMVC.jpa.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.ensayoMVC.jpa.entities.Lugar;

@Repository
public interface LugarDAO {

	@PersistenceContext EntityManager em= null;
	
	public Lugar findLugarById(int lugarId);
	
	
}
