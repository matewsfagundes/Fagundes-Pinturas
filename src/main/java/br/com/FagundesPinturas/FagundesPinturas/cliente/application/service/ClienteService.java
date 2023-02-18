package br.com.FagundesPinturas.FagundesPinturas.cliente.application.service;

import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteRequest;
import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}