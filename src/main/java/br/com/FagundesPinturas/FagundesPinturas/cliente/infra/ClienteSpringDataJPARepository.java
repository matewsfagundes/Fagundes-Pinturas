package br.com.FagundesPinturas.FagundesPinturas.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.FagundesPinturas.FagundesPinturas.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {
}