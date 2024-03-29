package com.joao.arquitecturahexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ArquitecturaHexagonalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArquitecturaHexagonalApplication.class, args);
	}

}
