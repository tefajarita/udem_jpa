package co.com.ensayoMVC.jpa.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="reservas")
public class Reserva {

	public Reserva() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String hora_inicio;
	@Column
	private String hora_final;
	@Column
	private Date fecha; 
	
	
	//claves foraneas
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cliente_id", referencedColumnName="id")
	private Cliente cliente;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="lugar_id", referencedColumnName="id")
	private Lugar lugar;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="barbero_id", referencedColumnName="id")
	private Barbero barbero;


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the hora_inicio
	 */
	public String getHora_inicio() {
		return hora_inicio;
	}


	/**
	 * @param hora_inicio the hora_inicio to set
	 */
	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}


	/**
	 * @return the hora_final
	 */
	public String getHora_final() {
		return hora_final;
	}


	/**
	 * @param hora_final the hora_final to set
	 */
	public void setHora_final(String hora_final) {
		this.hora_final = hora_final;
	}


	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}


	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}


	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	/**
	 * @return the lugar
	 */
	public Lugar getLugar() {
		return lugar;
	}


	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}


	/**
	 * @return the barbero
	 */
	public Barbero getBarbero() {
		return barbero;
	}


	/**
	 * @param barbero the barbero to set
	 */
	public void setBarbero(Barbero barbero) {
		this.barbero = barbero;
	}
	
	
	

}
