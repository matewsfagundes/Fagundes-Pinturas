package br.com.fagundespinturas.fagundespinturas.Servicos.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/servico-pintura")
public interface ServicoPinturaApi {
	
	@PostMapping(value = "/{idCliente}")
	@ResponseStatus(code = HttpStatus.CREATED)
	ServicoPinturaResponse postServico(@PathVariable UUID idCliente,
			@Valid @RequestBody ServicoPinturaRequest servicoPinturaRequest);
	
	@GetMapping(value = "/{idCliente}")
	@ResponseStatus(code = HttpStatus.OK)
	List<ListaServicoPinturaResponse> listaServicoPinturas(@PathVariable UUID idCliente);
	
	@PatchMapping(value = "/{idServicoPintura}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void alteraServicoPintura(@PathVariable UUID idServicoPintura,
			@Valid @RequestBody ServicoPinturaRequest servicoPinturaRequest);
}
