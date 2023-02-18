package br.com.FagundesPinturas.FagundesPinturas.cliente.application.api;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.FagundesPinturas.FagundesPinturas.cliente.domain.Cliente;
import lombok.Value;
@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String whatsApp;
	private String cpfCnpj;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return clientes.stream()
				.map(ClienteListResponse::new)
				.collect(Collectors.toList());
	}

	private ClienteListResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.whatsApp = cliente.getWhatsApp();
		this.cpfCnpj = cliente.getCpfCnpj();
	}
}