package br.com.fagundespinturas.fagundespinturas.Servicos.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fagundespinturas.fagundespinturas.Servicos.domain.ServicoPintura;

public interface ServicoPinturaSpringDataJPARepository extends JpaRepository <ServicoPintura, UUID>{

}
