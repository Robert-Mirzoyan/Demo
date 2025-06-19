package com.example.demo.IoC_and_DI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApp implements CommandLineRunner {

    private final Bar bar;

    public DemoApp(Bar bar) {
        this.bar = bar;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }

    @Override
    public void run(String... args) {
        bar.run();
    }
}
