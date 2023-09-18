package br.com.fagundespinturas.fagundespinturas.cliente.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/cliente")
public interface ClienteApi {
	@RequestMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ClienteResponse postCliente(@RequestBody ClienteRequest clienteRequest);
}