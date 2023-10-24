package com.esprit.getaway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("RecouvGTI", r -> r.path("/RecouvGTI/**", "/dossier", "/getalldossier")
						.uri("http://localhost:8081/"))
				.route("usermanagement", r -> r.path("/usermanagement/**", "/usermanagement/user/**", "")
						.uri("http://localhost:8088/"))
				.build();

	}

}
