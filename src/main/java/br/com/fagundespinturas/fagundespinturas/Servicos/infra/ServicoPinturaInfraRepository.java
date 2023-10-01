package br.com.fagundespinturas.fagundespinturas.Servicos.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.fagundespinturas.fagundespinturas.Servicos.api.repository.ServicoPinturaRepository;
import br.com.fagundespinturas.fagundespinturas.Servicos.domain.ServicoPintura;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class ServicoPinturaInfraRepository implements ServicoPinturaRepository {

	private final ServicoPinturaSpringDataJPARepository servicoPinturaSpringDataJPARepository;

	@Override
	public ServicoPintura salvaServico(ServicoPintura servicoPintura) {
		log.info("[inicia] ServicoPinturaInfraRepository - salvaServico");
		servicoPinturaSpringDataJPARepository.save(servicoPintura);
		log.info("[finaliza] ServicoPinturaInfraRepository - salvaServico");
		return servicoPintura;
	}

	@Override
	public List<ServicoPintura> listaServicoPinturas(UUID idCliente) {
		log.info("[inicia] ServicoPinturaInfraRepository - listaServicoPinturas");
		List<ServicoPintura> todosServicos = servicoPinturaSpringDataJPARepository.findAll();
		log.info("[finaliza] ServicoPinturaInfraRepository - listaServicoPinturas");
		return todosServicos;
	}
}
