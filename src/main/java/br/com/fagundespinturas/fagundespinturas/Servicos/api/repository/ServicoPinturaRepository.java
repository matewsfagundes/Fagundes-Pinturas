package br.com.fagundespinturas.fagundespinturas.Servicos.api.repository;

import java.util.List;
import java.util.UUID;

import br.com.fagundespinturas.fagundespinturas.Servicos.domain.ServicoPintura;

public interface ServicoPinturaRepository {

	ServicoPintura salvaServico(ServicoPintura servicoPintura);
	List<ServicoPintura> listaServicoPinturas(UUID idCliente);
	ServicoPintura buscarServicoComId(UUID idServicoPintura);
 
}
