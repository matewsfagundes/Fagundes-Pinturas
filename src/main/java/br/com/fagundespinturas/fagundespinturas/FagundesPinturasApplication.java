package br.com.fagundespinturas.fagundespinturas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class FagundesPinturasApplication {
	@GetMapping
	public String getHomeTest() {
		return "Fagundes pinturas - API Home";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FagundesPinturasApplication.class, args);
	}
}