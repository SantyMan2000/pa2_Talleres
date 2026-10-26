package com.edu.ec.deber;

import java.util.UUID;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;


@ApplicationScoped
@Named("vip")
public class DescuentoVIP implements CalculadoraDescuento {

    private final String id = UUID.randomUUID().toString();

    @Override
    public double calcular(double monto) {
        System.out.println("DescuentoVIP [" + id + "] calculando descuento del 15%");
        return monto * 0.15;
    }
}

