package com.aura_snack.gateway.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {



    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("orders-service", r -> r.path("/orders/**")
                        .filters(f -> f.rewritePath("/orders/(?<segment>.*)", "/${segment}"))
                        .uri("http://localhost:8081")
                )
                .route("products-service", r -> r.path("/products/**")
                        .filters(f -> f.rewritePath("/products/(?<segment>.*)", "/${segment}"))
                        .uri("http://localhost:8082")
                )
                .build();
    }
}