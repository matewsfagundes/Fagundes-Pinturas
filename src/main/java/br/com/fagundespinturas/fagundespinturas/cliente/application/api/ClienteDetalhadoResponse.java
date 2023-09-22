package br.com.fagundespinturas.fagundespinturas.cliente.application.api;

import java.util.UUID;

import br.com.fagundespinturas.fagundespinturas.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {

	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String cpf;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.cpf = cliente.getCpf();
	}
}