package org.acme.extras;

import java.time.LocalDate;

import org.acme.api.*;

public class DefaultDateService implements DateService{

    @Override
    public LocalDate today() {
        return LocalDate.now();
    }
}