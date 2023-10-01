package br.com.fagundespinturas.fagundespinturas.Servicos.api;

import java.util.UUID;

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
}
