package br.com.FagundesPinturas.FagundesPinturas.cliente.application.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.FagundesPinturas.FagundesPinturas.cliente.domain.Sexo;
import lombok.Value;
@Value
public class ClienteAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String email;
	@NotBlank
	private String whatsApp;
	@NotNull
	private Sexo sexo;
	@NotBlank
	private String cpfCnpj;
}
