package br.com.fagundespinturas.fagundespinturas.Servicos.api.service;

import java.util.UUID;

import br.com.fagundespinturas.fagundespinturas.Servicos.api.ServicoPinturaRequest;
import br.com.fagundespinturas.fagundespinturas.Servicos.api.ServicoPinturaResponse;

public interface ServicoPinturaService {
	ServicoPinturaResponse criaServico(UUID idCliente, ServicoPinturaRequest servicoPinturaRequest);
}
