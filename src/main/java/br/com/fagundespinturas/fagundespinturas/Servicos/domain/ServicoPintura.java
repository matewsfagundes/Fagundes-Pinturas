package br.com.fagundespinturas.fagundespinturas.Servicos.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.fagundespinturas.fagundespinturas.Servicos.api.ServicoPinturaRequest;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Data
public class ServicoPintura {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idServicoPintura;
	@Column(columnDefinition = "uuid", name = "idCliente", nullable = false)
	private UUID idClienteContratante;
	private String tipoPintura;
    private double areaServico;
    private String esquemaCores;
    private LocalDateTime dataInicio;
    private LocalDateTime dataPrazo; 
    

	public ServicoPintura(UUID idCliente, ServicoPinturaRequest servicoPinturaRequest) {
		this.idClienteContratante = idCliente;
		this.tipoPintura = servicoPinturaRequest.getTipoPintura();
		this.areaServico = servicoPinturaRequest.getAreaServico();
		this.esquemaCores = servicoPinturaRequest.getEsquemaCores();
		this.dataInicio = LocalDateTime.now();
		this.dataPrazo = LocalDateTime.now();
	}


	public void altera(ServicoPinturaRequest servicoPinturaRequest) {
		this.tipoPintura = servicoPinturaRequest.getTipoPintura();
		this.areaServico = servicoPinturaRequest.getAreaServico();
		this.esquemaCores = servicoPinturaRequest.getEsquemaCores();
		this.dataInicio = LocalDateTime.now();
		this.dataPrazo = LocalDateTime.now();
	}
}
