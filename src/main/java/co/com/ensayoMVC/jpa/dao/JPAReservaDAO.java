package co.com.ensayoMVC.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import co.com.ensayoMVC.DAO.ReservaDAO;
import co.com.ensayoMVC.model.ReservaDTO;

@Repository
public class JPAReservaDAO  implements ReservaDAO{

	public JPAReservaDAO() {
		super();
	}
	
	@PersistenceContext(name="lugar")
	private EntityManager em;
	 private DataSource dataSource;
		public DataSource getDataSource() {
			return dataSource;
		}
		public void setDataSource(DataSource dataSource) {
			this.dataSource = dataSource;
		}
		
		public EntityManager getEntityManager() {
			return em;
		}
		
		
		/**
		 * @param em the em to set
		 */
		
		public void setEntityManager(EntityManager em) {
			this.em = em;
		}
		public ReservaDTO findReservaById(int idReserva) {
			Query q =(Query) getEntityManager().createQuery("SELECT new co.com.ensayoMVC.model.ReservaDTO(r.hora_inicio,r.hora_final,r.fecha) FROM Reserva r WHERE r.id =:idReserva");
			q.setParameter("idReserva", idReserva);
			ReservaDTO result = (ReservaDTO) q.getSingleResult();	
			return result;
		}
		public void insertReserva() {
			// TODO Auto-generated method stub
			
		}

}
