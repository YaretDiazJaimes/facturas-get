package com.getechnologies.facturas;

import com.fasterxml.jackson.datatype.hibernate5.jakarta.Hibernate5JakartaModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FacturasApplication {
	@Bean
	protected Hibernate5JakartaModule module() {
		return new Hibernate5JakartaModule();
	}

	public static void main(String[] args) {
		SpringApplication.run(FacturasApplication.class, args);
	}

}
