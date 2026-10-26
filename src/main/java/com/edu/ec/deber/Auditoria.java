package com.edu.ec.deber;

import java.util.UUID;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Auditoria {

    private final String id = UUID.randomUUID().toString();

    public void registrar(String operacion) {
        System.out.println("[AUDITORIA " + id + "] " + operacion);
    }
}
