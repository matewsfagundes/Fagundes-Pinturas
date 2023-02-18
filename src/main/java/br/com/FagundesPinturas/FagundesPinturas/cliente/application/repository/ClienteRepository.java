package br.com.FagundesPinturas.FagundesPinturas.cliente.application.repository;

import java.util.List;

import br.com.FagundesPinturas.FagundesPinturas.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
}