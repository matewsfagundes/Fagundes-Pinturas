package br.com.FagundesPinturas.FagundesPinturas.cliente.application.service;

import java.util.List;

import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteListResponse;
import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteRequest;
import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscarTodosClientes();
}