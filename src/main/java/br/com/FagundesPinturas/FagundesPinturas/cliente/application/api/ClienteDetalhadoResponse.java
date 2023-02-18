package br.com.FagundesPinturas.FagundesPinturas.cliente.application.api;

import java.util.UUID;

import br.com.FagundesPinturas.FagundesPinturas.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String whatsApp;
	private String cpfCnpj;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.whatsApp = cliente.getWhatsApp();
		this.cpfCnpj = cliente.getCpfCnpj();
	}
}
