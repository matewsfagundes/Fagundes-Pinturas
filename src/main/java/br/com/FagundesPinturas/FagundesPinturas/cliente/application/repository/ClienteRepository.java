package br.com.FagundesPinturas.FagundesPinturas.cliente.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.FagundesPinturas.FagundesPinturas.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();
	Cliente buscaClienteAtravesId(UUID idCliente);
}