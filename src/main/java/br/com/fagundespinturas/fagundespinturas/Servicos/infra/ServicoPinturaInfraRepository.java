package br.com.fagundespinturas.fagundespinturas.Servicos.infra;

import org.springframework.stereotype.Repository;

import br.com.fagundespinturas.fagundespinturas.Servicos.api.repository.ServicoPinturaRepository;
import br.com.fagundespinturas.fagundespinturas.Servicos.domain.ServicoPintura;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
public class ServicoPinturaInfraRepository implements ServicoPinturaRepository {

	@Override
	public ServicoPintura salvaServico(ServicoPintura servicoPintura) {
		log.info("[inicia] ServicoPinturaInfraRepository - salvaServico");
		log.info("[finaliza] ServicoPinturaInfraRepository - salvaServico");
		return null;
	}
}
