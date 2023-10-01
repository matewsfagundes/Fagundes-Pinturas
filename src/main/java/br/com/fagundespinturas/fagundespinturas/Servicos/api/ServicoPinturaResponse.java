package br.com.fagundespinturas.fagundespinturas.Servicos.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;
@Builder
@Value
public class ServicoPinturaResponse {
	
	private UUID idServicoPintura;
}
