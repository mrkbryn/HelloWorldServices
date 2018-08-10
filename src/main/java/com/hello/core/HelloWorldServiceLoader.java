package com.hello.core;

import java.util.ServiceLoader;

/**
 * Loads all implementations of HelloWorldService and
 */
public class HelloWorldServiceLoader {
    public static void main(String[] args) {
        ServiceLoader<HelloWorldService> loader = ServiceLoader.load(HelloWorldService.class);
        for (HelloWorldService service : loader) {
            System.out.println(service.helloWorld());
        }
    }
}
