package com.hello.services;

import com.hello.core.HelloWorldService;

public class FrenchHelloWorldService implements HelloWorldService {
    public String helloWorld() {
        return "Bonjour le monde!";
    }
}
