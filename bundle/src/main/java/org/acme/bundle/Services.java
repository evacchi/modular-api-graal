package org.acme.bundle;

import org.acme.api.DateService;
import org.acme.api.HelloService;
import org.acme.api.ServiceProvider;

public class Services implements ServiceProvider {

    public static ServiceProvider create() {
        return new Services();
    }

    private Services() {}


    @Override
    public HelloService hello() {
        return new org.acme.core.DefaultHelloService();
    }

    @Override // this is an optional dependency
    public DateService date() {
        return new org.acme.extras.DefaultDateService();
    }
}
