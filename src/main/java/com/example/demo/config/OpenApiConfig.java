package com.example.demo.config;


import io.swagger.v3.oas.models.info.*;
import io.swagger.v3.oas.models.*;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.*;

@Configuration
public class OpenApiConfig {
        @Bean
        public OpenAPI customOpenAPI() {
            return new OpenAPI()
                    .info(new Info()
                            .title("Software Engineer API")
                            .version("1.0")
                            .description("CRUD API for managing Software Engineers with AI integration")
                    );
        }

        @Bean
        public GroupedOpenApi publicApi() {
            return GroupedOpenApi.builder()
                    .group("software-engineer-api")
                    .pathsToMatch("/api/v1/**")
                    .build();
        }
    }
