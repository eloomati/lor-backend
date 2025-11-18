package io.mhetko.lorbackend;

import org.springframework.boot.SpringApplication;

public class TestLorBackendApplication {

    public static void main(String[] args) {
        SpringApplication.from(LorBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
