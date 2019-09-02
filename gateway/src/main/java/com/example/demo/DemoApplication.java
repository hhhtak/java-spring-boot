package com.example.demo;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder builder) {
		return builder
				.routes()
				.route(
						"custom_express_setpath_route",
						r -> r.path("/express/{segment}")
								.filters(f -> f.setPath("/{segment}"))
								.uri("http://localhost:3000"))
				.route(
						"custom_springboot_setpath_route",
						r -> r.path("/springboot/{segment}")
								.filters(f -> f.setPath("/{segment}"))
								.uri("http://localhost:9000"))
				.build();
	}

}
