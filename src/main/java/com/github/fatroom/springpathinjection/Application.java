package com.github.fatroom.springpathinjection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private final PathConfig config;

    public Application(PathConfig config) {
        this.config = config;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Injected path: " + config.getPath());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
