package com.example.QhalaHackathon;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="MediQuirks APIs"))
public class QhalaHackathonApplication {

	public static void main(String[] args) {
		SpringApplication.run(QhalaHackathonApplication.class, args);

	}

}
