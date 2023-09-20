package br.com.fagundespinturas.fagundespinturas.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.fagundespinturas.fagundespinturas.cliente.application.repository.ClienteRepository;
import br.com.fagundespinturas.fagundespinturas.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

	private final ClienteSpringDataJPArepository clienteSpringDataJPArepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		clienteSpringDataJPArepository.save(cliente);
		log.info("[f] ClienteInfraRepository - salva");
		return cliente;
	}
}