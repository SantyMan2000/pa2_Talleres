package com.edu.ec.taller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
 
 
//@ApplicationScoped //delego el control al contenedor
//@RequestScoped
//@Singleton  
@Dependent 
public class PedidoService {
    
    
    @Inject 
    @Named ("mail")
    private Notificacion NotificacionCorreo;
    @Inject
    @Named ("sms")
    private Notificacion NotificacionSms;

    public void realizar(Pedido pedido ){

       


        System.out.println("Pedido realizado paa el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total : " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());


         String cuerpo ="Estimado" +pedido.getCliente() + ", su peido de " +
        pedido.getProducto() + " por un total de $ " + pedido.getTotal()+
        "ha sido realizada";

        //Notificacion de peiddo por correo

        this.NotificacionCorreo.enviar(pedido.getCorreo(), "Pedido realizado con exito");
        this.NotificacionCorreo.setCantidad(this.NotificacionCorreo.getCantidad()+ 1);

        //Notificacion de peiddo por SMS

        this.NotificacionSms.enviar(pedido.getTelefono() ,cuerpo);

 
        System.out.println("Pedido realizado con exito");
 
 
    }
 
}