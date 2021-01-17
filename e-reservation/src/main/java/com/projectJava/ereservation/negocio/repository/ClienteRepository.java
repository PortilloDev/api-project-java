package com.projectJava.ereservation.negocio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectJava.ereservation.modelo.Cliente;

/**
 * Interface para definir las operaciones de bdd relacionadas con cliente
 * @author ivan.portillo
 * */

public interface ClienteRepository extends JpaRepository<Cliente, String>{
	
	/**
	 * Definición método para buscar los clientes por su apellido
	 * @param apellidoCli
	 * @return
	 * */
	public List<Cliente> findByApellidoCli(String apellidoCli);
	
	public Cliente findByIdentificacion(String identificacionCli);
	
	
}
