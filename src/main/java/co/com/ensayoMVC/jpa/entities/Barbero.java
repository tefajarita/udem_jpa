package co.com.ensayoMVC.jpa.entities;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author TEFAJARITA
 *
 */
@Entity
@Table(name="barberos")
public class Barbero {
	
	@Id
	@Column
	private String cedula;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String telefono;	
	@Column
	private String descripcion;
	@Column
	private String direccion;
	@Column(name="foto_perfil")
	private String fotoperfil;
	
	/**
	 * Clave foranea del lugar
	 */
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="lugar_id", referencedColumnName="id")
	private Lugar lugar;



	/**
	 * @return the cedula
	 */
	
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the fotoperfil
	 */
	public String getFotoperfil() {
		return fotoperfil;
	}

	/**
	 * @param fotoperfil the fotoperfil to set
	 */
	public void setFotoperfil(String fotoperfil) {
		this.fotoperfil = fotoperfil;
	}


}
