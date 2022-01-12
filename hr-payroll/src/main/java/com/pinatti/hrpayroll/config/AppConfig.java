package com.pinatti.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	// serve para registrar uma instância única (Singleton) de um objeto RestTemplate
	// e essa instância única fica disponível para injetar em outros componentes
	
	// Dessa forma foi implementado o padrão de projeto Singleton
}
