/**
 * 
 */
package com.projectJava.ereservation.vista.services;



import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projectJava.ereservation.modelo.Cliente;
import com.projectJava.ereservation.negocio.repository.ClienteRepository;

/**
 * Clases para definir los servicios de clientes
 * @author ivan.portillo
 *
 */

@Service
/**
 * Esta instrucción sirve para indicar que el metodo que no tenga la anotación Transactional, solo sea de lectura
 * */
@Transactional(readOnly = true) 
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	/**
	 * Método para realizar la operación de guardar un cliente
	 * @param cliente
	 * @return
	 * */
	@Transactional
	public Cliente create(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Método para realizar la operación de actualizar un cliente
	 * @param cliente
	 * @return
	 * */
	@Transactional
	public Cliente update(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	/**
	 * Método para realizar la operación de eliminar un cliente
	 * @param cliente
	 * @return
	 * */
	@Transactional
	public void delete(Cliente cliente) {
		this.clienteRepository.delete(cliente);
	}
	
	
	/**
	 * Método para consultar a un cliente por su identificación
	 * @param identificacionCli
	 * @return
	 * */
	public Cliente findByIdentificacion(String identificacionCli) {
		return this.clienteRepository.findByIdentificacion(identificacionCli);
	}
	
	/**
	 * Método devuelve lista de clientes
	 * @return
	 * */
	public List<Cliente> findAll(){
		return this.clienteRepository.findAll();
	}
}
