package br.com.FagundesPinturas.FagundesPinturas.cliente.application.api;

import java.util.List;
import java.util.UUID;

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
		return null;
	}
}