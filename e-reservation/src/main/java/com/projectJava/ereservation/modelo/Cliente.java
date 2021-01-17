package com.projectJava.ereservation.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import java.util.Set;
import lombok.Data;

/**
 * Clase representa la tabla cliente
 * @author ivan.portillo
 *
 */
@Data
@Entity
@Table(name = "cliente")
@NamedQuery(name="Cliente.findByIdentificacion", query="Select c from Cliente c where c.identificacionCli = ?1")
public class Cliente {
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid2")
	private String idCli;
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;
	//relaciones
	@OneToMany(mappedBy="cliente")
	private Set<Reserva> reservas;
	

	public Cliente() {
		
	}

}
