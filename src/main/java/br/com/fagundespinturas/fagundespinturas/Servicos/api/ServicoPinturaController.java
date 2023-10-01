package br.com.fagundespinturas.fagundespinturas.Servicos.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
@Log4j2
@RestController
public class ServicoPinturaController implements ServicoPinturaApi {

	@Override
	public ServicoPinturaResponse postServico(@Valid ServicoPinturaRequest servicoPinturaRequest) {
		log.info("[inicia] ServicoPinturaController - postServico");
		log.info("[finaliza] ServicoPinturaController - postServico");
		return null;
	}
}
