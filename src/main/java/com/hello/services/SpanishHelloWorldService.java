package com.hello.services;

import com.hello.core.HelloWorldService;

/**
 * Spanish implementation of a HelloWorldService
 */
public class SpanishHelloWorldService implements HelloWorldService {
    public String helloWorld() {
        return "¡Hola Mundo!";
    }
}
