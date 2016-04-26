/**
 * 
 */
package co.com.ensayoMVC.jpa.dao;

import co.com.ensayoMVC.jpa.entities.Lugar;




/**
 * @author TEFAJARITA
 *
 */
public class JPALugarDAO implements LugarDAO {

	public Lugar findLugarById(int lugarId) {
		Lugar lugar =(Lugar) em.createQuery("SELECT lugar FROM Lugar WHERE id = "+lugarId).getSingleResult();
		return lugar;
	}

	
	
}
