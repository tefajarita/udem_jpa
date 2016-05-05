package co.com.ensayoMVC.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
//Genero la sequencia 
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
@Table(name="cliente")
public class Cliente {

	public Cliente() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
	@Column(name="id")
	private int id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String telefono;
	@Column
	private String correo;
	

}
