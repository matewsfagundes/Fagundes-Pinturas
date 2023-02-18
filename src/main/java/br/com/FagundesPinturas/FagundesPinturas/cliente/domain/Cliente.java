package br.com.FagundesPinturas.FagundesPinturas.cliente.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
	@Email
	private String email;
	@NotBlank
	private String whatsApp;
	@NotNull
	private Sexo sexo;
	@NotBlank
	private String cpfCnpj;

	private LocalDateTime dataEHoraDoCadastro;
	private LocalDateTime dataHoraUltimaAlteracao;

}