package br.com.FagundesPinturas.FagundesPinturas.cliente.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteAlteracaoRequest;
import br.com.FagundesPinturas.FagundesPinturas.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
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

	private LocalDateTime dataEHoraDoCadastro;
	private LocalDateTime dataHoraUltimaAlteracao;

	public Cliente(ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.email = clienteRequest.getEmail();
		this.whatsApp = clienteRequest.getWhatsApp();
		this.sexo = clienteRequest.getSexo();
		this.cpfCnpj = clienteRequest.getCpfCnpj();
		this.dataEHoraDoCadastro = LocalDateTime.now();
	}

	public void altera(ClienteAlteracaoRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.email = clienteRequest.getEmail();
		this.whatsApp = clienteRequest.getWhatsApp();
		this.sexo = clienteRequest.getSexo();
		this.cpfCnpj = clienteRequest.getCpfCnpj();
		this.dataHoraUltimaAlteracao = LocalDateTime.now();
		
	}
}