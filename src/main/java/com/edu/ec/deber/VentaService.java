package com.edu.ec.deber;

import java.util.Locale;
import java.util.UUID;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class VentaService {

    private final String id = UUID.randomUUID().toString();

    private CalculadoraDescuento descuentoRegular;
    private CalculadoraDescuento descuentoVip;

    // Inyeccion por atributo
    @Inject
    Auditoria auditoria;

    // Inyeccion por constructor
    @Inject
    public VentaService(@Named("regular") CalculadoraDescuento descuentoRegular,
                        @Named("vip") CalculadoraDescuento descuentoVip) {
        this.descuentoRegular = descuentoRegular;
        this.descuentoVip = descuentoVip;
    }

    public void realizar(int numero, String tipo, double monto) {

        CalculadoraDescuento calculadora = "VIP".equals(tipo) ? descuentoVip : descuentoRegular;

        System.out.println("VentaService [" + id + "] procesando venta " + numero);
        auditoria.registrar("Inicio de venta " + numero + " tipo " + tipo);

        double descuento = calculadora.calcular(monto);
        double total = monto - descuento;
        double porcentaje = descuento / monto * 100;

        System.out.println(String.format(Locale.US,
                "Venta %d | %s | Monto: $%.2f | Descuento: %.0f%% ($%.2f) | Total: $%.2f",
                numero, tipo, monto, porcentaje, descuento, total));

        auditoria.registrar("Fin de venta " + numero);
        System.out.println("----------------------------------------");
    }
}

