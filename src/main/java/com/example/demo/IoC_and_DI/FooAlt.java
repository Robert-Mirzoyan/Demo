package com.example.demo.IoC_and_DI;

import org.springframework.stereotype.Component;

@Component("fooAlt")
public class FooAlt implements Foo {
    @Override
    public void sayHello() {
        System.out.println("Hello from FooAlt");
    }
}

