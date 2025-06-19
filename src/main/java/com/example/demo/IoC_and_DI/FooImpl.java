package com.example.demo.IoC_and_DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("fooImpl")
public class FooImpl implements Foo {
    public void sayHello() {
        System.out.println("Hello from FooImpl");
    }
}
