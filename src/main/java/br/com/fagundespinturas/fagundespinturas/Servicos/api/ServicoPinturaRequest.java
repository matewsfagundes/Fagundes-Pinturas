package br.com.fagundespinturas.fagundespinturas.Servicos.api;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;
@Value
public class ServicoPinturaRequest {
	
	private UUID idCliente;
	private String tipoPintura;
    private double areaServico;
    private String esquemaCores;
    private LocalDateTime dataInicio;
    private LocalDateTime dataPrazo; 
}
