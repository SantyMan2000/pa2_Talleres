package com.edu.ec.deber;

import java.util.UUID;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("regular")
public class DescuentoRegular implements CalculadoraDescuento {

    private final String id = UUID.randomUUID().toString();

    @Override
    public double calcular(double monto) {
        System.out.println("DescuentoRegular [" + id + "] calculando descuento del 5%");
        return monto * 0.05;
    }
}

