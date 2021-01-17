package com.projectJava.ereservation.vista.resources.vo;

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
public class ClienteVO {
	
	private String idCli;
	private String nombreCli;
	private String apellidoCli;
	private String identificacionCli;
	private String direccionCli;
	private String telefonoCli;
	private String emailCli;

}
