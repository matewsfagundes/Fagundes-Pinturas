package br.com.fagundespinturas.fagundespinturas.Servicos.api.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.fagundespinturas.fagundespinturas.Servicos.api.ListaServicoPinturaResponse;
import br.com.fagundespinturas.fagundespinturas.Servicos.api.ServicoPinturaRequest;
import br.com.fagundespinturas.fagundespinturas.Servicos.api.ServicoPinturaResponse;
import br.com.fagundespinturas.fagundespinturas.Servicos.api.repository.ServicoPinturaRepository;
import br.com.fagundespinturas.fagundespinturas.Servicos.domain.ServicoPintura;
import br.com.fagundespinturas.fagundespinturas.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Service
@RequiredArgsConstructor
public class ServicoPinturaApplicationService implements ServicoPinturaService {
	private final ClienteService clienteService;
	private final ServicoPinturaRepository servicoPinturaRepository; 

	@Override
	public ServicoPinturaResponse criaServico(UUID idCliente, ServicoPinturaRequest servicoPinturaRequest) {
		log.info("[inicia] ServicoPinturaApplicationService - criaServico");
		clienteService.buscaClienteAtravesId(idCliente);
		ServicoPintura servicoPintura = servicoPinturaRepository.salvaServico(new ServicoPintura(idCliente, servicoPinturaRequest));
		log.info("[finalzia] ServicoPinturaApplicationService - criaServico");
		return new ServicoPinturaResponse(servicoPintura.getIdServicoPintura());
	}

	@Override
	public List<ListaServicoPinturaResponse> listaServicoPinturas(UUID idCliente) {
		log.info("[inicia] ServicoPinturaApplicationService - listaServicoPinturas");
		log.info("[finalzia] ServicoPinturaApplicationService - listaServicoPinturas");
		return null;
	}
}
