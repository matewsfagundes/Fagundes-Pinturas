package br.com.fagundespinturas.fagundespinturas.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fagundespinturas.fagundespinturas.cliente.domain.Cliente;

public interface ClienteSpringDataJPArepository extends JpaRepository <Cliente, UUID> {
}