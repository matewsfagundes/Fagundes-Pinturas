package br.com.fagundespinturas.fagundespinturas.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.fagundespinturas.fagundespinturas.cliente.application.api.ClienteDetalhadoResponse;
import br.com.fagundespinturas.fagundespinturas.cliente.application.api.ClienteListResponse;
import br.com.fagundespinturas.fagundespinturas.cliente.application.api.ClienteRequest;
import br.com.fagundespinturas.fagundespinturas.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}