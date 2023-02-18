package br.com.FagundesPinturas.FagundesPinturas.cliente.application.repository;

import br.com.FagundesPinturas.FagundesPinturas.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}