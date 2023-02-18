package br.com.FagundesPinturas.FagundesPinturas.cliente.application.api;

import java.util.UUID;

import lombok.Value;
@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String whatsApp;
	private String cpfCnpj;
}