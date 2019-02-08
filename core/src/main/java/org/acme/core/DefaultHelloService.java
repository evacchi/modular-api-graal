package org.acme.core;

import org.acme.api.*;

public class DefaultHelloService implements HelloService {
    public String greet(String name) {
        return "Hello, " + name;
    }
}