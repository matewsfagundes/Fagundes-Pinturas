package br.com.fagundespinturas.fagundespinturas.cliente.application.api;

import lombok.Value;

@Value
public class ClienteAlteracaoRequest {
	private String nomeCompleto;
	private String email;
	private String celular;
}
