package br.com.fagundespinturas.fagundespinturas.cliente.application.service;

import br.com.fagundespinturas.fagundespinturas.cliente.application.api.ClienteRequest;
import br.com.fagundespinturas.fagundespinturas.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
}