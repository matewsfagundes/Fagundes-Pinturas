package br.com.fagundespinturas.fagundespinturas.Servicos.api;

import java.time.LocalDateTime;

import lombok.Value;
@Value
public class ServicoPinturaRequest {
	private String tipoPintura;
    private double areaServico;
    private String esquemaCores;
    private LocalDateTime dataInicio;
    private LocalDateTime dataPrazo; 
}
