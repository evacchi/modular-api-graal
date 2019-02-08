package org.acme.examples;

import org.acme.api.ServiceProvider;
import org.acme.bundle.Services;

public class Main {
    public static void main(String... args) {
        // api and impl are in separate packages (but the API is still nice)
        ServiceProvider svcs = Services.create();

        String arg = args.length == 0 ? "World" : args[0] ;
        System.out.println(svcs.hello().greet(arg));

        // the following causes a NoClassDefFoundError only when
        // the method is actually invoked!
        //     System.out.println(svcs.date().today());
        // it can be fixed by explicitly setting the optional dependency in pom.xml
    }
}