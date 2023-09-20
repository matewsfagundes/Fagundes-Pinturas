package br.com.fagundespinturas.fagundespinturas.cliente.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fagundespinturas.fagundespinturas.cliente.application.api.ClienteListResponse;
import br.com.fagundespinturas.fagundespinturas.cliente.application.api.ClienteRequest;
import br.com.fagundespinturas.fagundespinturas.cliente.application.api.ClienteResponse;
import br.com.fagundespinturas.fagundespinturas.cliente.application.repository.ClienteRepository;
import br.com.fagundespinturas.fagundespinturas.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder().idCliente(cliente.getIdCliente()).build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}
}