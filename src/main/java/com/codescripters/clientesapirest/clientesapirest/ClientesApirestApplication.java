package com.codescripters.clientesapirest.clientesapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientesApirestApplication {
	public  String PORT = System.getenv("PORT");

	public static void main(String[] args) {
		SpringApplication.run(ClientesApirestApplication.class, args);
	}

}
