package com.edu.ec.taller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
@ApplicationScoped 
public class CompraService {

    
        @Inject 
        @Named("mail")
        private Notificacion   notificacionCorreo;
        public void realizar(Compra compra){

         System.out.println("realizando compra");   
        System.out.println("realizando compra por el cliente " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total : " + compra.getTotal());
        System.out.println("Correo: " + compra.getCorreo());
        System.out.println("compra realizanda con extio");

        String cuerpo ="Estimado" + compra.getCliente() + ", su compra de " +
        compra.getProducto() + " por un total de $ " + compra.getTotal()+
        "ha sido realizada";

        //Notificacion de peiddo por correo

        this.notificacionCorreo.enviar(compra.getCorreo(), "Pedido realizado con exito");
        this.notificacionCorreo.setCantidad(this.notificacionCorreo.getCantidad()+ 1);
        System.out.println("Canitdad de correos enviados compra:" + this.notificacionCorreo.getCantidad());
}
        }
       


