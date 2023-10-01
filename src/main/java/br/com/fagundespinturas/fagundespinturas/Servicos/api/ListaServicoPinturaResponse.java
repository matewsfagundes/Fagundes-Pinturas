package br.com.fagundespinturas.fagundespinturas.Servicos.api;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.fagundespinturas.fagundespinturas.Servicos.domain.ServicoPintura;
import lombok.Value;

@Value
public class ListaServicoPinturaResponse {
	
	private UUID idServicoPintura;
	private String tipoPintura;
    private double areaServico;
    private String esquemaCores;
    private LocalDateTime dataInicio;
    private LocalDateTime dataPrazo;
    
	public static List<ListaServicoPinturaResponse> converte(List<ServicoPintura> servicosPinturas) {
		return servicosPinturas.stream()
				.map(ListaServicoPinturaResponse::new)
				.collect(Collectors.toList());
	}

	private ListaServicoPinturaResponse(ServicoPintura servicoPintura) {
		this.idServicoPintura = servicoPintura.getIdServicoPintura();
		this.tipoPintura = servicoPintura.getTipoPintura();
		this.areaServico = servicoPintura.getAreaServico();
		this.esquemaCores = servicoPintura.getEsquemaCores();
		this.dataInicio = servicoPintura.getDataInicio();
		this.dataPrazo = servicoPintura.getDataPrazo();
	} 
}
