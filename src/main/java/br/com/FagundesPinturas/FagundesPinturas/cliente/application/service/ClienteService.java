package br.com.FagundesPinturas.FagundesPinturas.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteAlteracaoRequest;
import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteDetalhadoResponse;
import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteListResponse;
import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteRequest;
import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscarTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
	void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
}