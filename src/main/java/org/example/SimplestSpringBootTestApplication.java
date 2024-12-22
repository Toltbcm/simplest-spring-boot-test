package org.example;

import org.example.model.EntityOne;
import org.example.service.EntityOneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "org.example")
public class SimplestSpringBootTestApplication {

    private EntityOneService entityOneService;

    public SimplestSpringBootTestApplication(EntityOneService entityOneService) {
        this.entityOneService = entityOneService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SimplestSpringBootTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            EntityOne entityOne = new EntityOne();
            entityOne.setFieldOne("Test data");
            entityOne.setFieldTwo(777);

            System.out.println(entityOneService.save(entityOne));
        };
    }
}
