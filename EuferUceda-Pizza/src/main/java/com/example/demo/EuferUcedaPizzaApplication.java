package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class EuferUcedaPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuferUcedaPizzaApplication.class, args);
	}

	//Define todo los detalles que tendra la API
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("API de Pizzas")
				.description("La API servira para listar pizzas")
				.termsOfServiceUrl("http://lideratecacademy.com")
				.contact(new Contact("Eufer Uceda", "", "adrianucedajulca@gmail.com"))
				.license("Eufer Uceda")
				.licenseUrl("http://lideratecacademy.com")
				.version("1.0.0.")
				.build();
	}
	
	//Define la configuración para swagger
	@Bean
	public Docket petApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Pizzeria API")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
				.paths(PathSelectors.any())
				.build()
				.tags(new Tag("Pizza API","Mostrar todas las APIS"));
				
	}
}
