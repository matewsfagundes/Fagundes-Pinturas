package br.com.fagundespinturas.fagundespinturas.cliente.application.api;

import java.time.LocalDate;

import br.com.fagundespinturas.fagundespinturas.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteRequest {
	private String nomeCompleto;
	private String email;
	private String celular;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private String cpf;
}