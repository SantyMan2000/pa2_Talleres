package com.edu.ec.taller;

 
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
 
@QuarkusMain
public class Main implements QuarkusApplication{
 
    @Inject
    private PedidoService pedidoService;

    @Inject 
    private CompraService compraService;
 
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }
 
    @Override
    public int run(String... args) {        
        System.out.println("Iniciando Aplicacion quarkus");
 
        Pedido pedido =  new Pedido("Juan Peres", "laptop",150, "juansdsd" );
        pedido.setTelefono("0999999999");
        this.pedidoService.realizar(pedido);
 
        Compra compra = new Compra("Samtiago Saltos","Smarphone",800,"marcsantyshorts@gmail.com");
        compra.setTelefono("0964080179");
        this.compraService.realizar(compra);
 
 
  
 
 
        return 0;
    }
 
}