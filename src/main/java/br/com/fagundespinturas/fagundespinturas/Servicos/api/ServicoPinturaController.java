package br.com.fagundespinturas.fagundespinturas.Servicos.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.fagundespinturas.fagundespinturas.Servicos.api.service.ServicoPinturaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Log4j2
@RestController
@RequiredArgsConstructor
public class ServicoPinturaController implements ServicoPinturaApi {

	private final ServicoPinturaService servicoPinturaService; 

	@Override
	public ServicoPinturaResponse postServico(UUID idCliente, ServicoPinturaRequest servicoPinturaRequest) {
		log.info("[inicia] ServicoPinturaController - postServico");
		log.info("[idCliente] {}", idCliente);
		ServicoPinturaResponse servico = servicoPinturaService.criaServico(idCliente, servicoPinturaRequest);
		log.info("[finaliza] ServicoPinturaController - postServico");
		return servico;
	}

	@Override
	public List<ListaServicoPinturaResponse> listaServicoPinturas(UUID idCliente) {
		log.info("[inicia] ServicoPinturaController - listaServicoPinturas");
		log.info("[idCliente] {}", idCliente);
		List<ListaServicoPinturaResponse> servicosPintura = servicoPinturaService
				.listaServicoPinturas(idCliente);
		log.info("[finaliza] ServicoPinturaController - listaServicoPinturas");
		return servicosPintura;
	}

	@Override
	public void alteraServicoPintura(UUID idServicoPintura, @Valid ServicoPinturaRequest servicoPinturaRequest) {
		log.info("[inicia] ServicoPinturaController - alteraServicoPintura");
		log.info("[idCliente] {}", idServicoPintura);
		servicoPinturaService.alteraServicoPintura(idServicoPintura, servicoPinturaRequest);
		log.info("[finaliza] ServicoPinturaController - alteraServicoPintura");
		
	}
}
