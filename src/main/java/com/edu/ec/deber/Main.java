package com.edu.ec.deber;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    VentaService ventaService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {
        System.out.println("Iniciando Aplicacion quarkus");

        this.ventaService.realizar(1, "REGULAR", 100.00);
        this.ventaService.realizar(2, "VIP", 200.00);
        this.ventaService.realizar(3, "REGULAR", 300.00);
        this.ventaService.realizar(4, "VIP", 500.00);

        return 0;
    }
}
