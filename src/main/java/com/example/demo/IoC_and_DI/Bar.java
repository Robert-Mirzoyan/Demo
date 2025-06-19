package com.example.demo.IoC_and_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bar {
    private final Foo foo;

    @Autowired
    public Bar(Foo foo) {
        this.foo = foo;
    }

    public void run() {
        foo.sayHello();
    }
}
