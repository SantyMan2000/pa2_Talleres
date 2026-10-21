package com.edu.ec.taller;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

 
@Singleton
@Named ("sms")
public class SmsServices implements Notificacion{
 
    private Integer cantidad = 0;
 
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando SMS a: " + destino);
        System.out.println("mensaje: " + mensaje);
 
        System.out.println("SMS enviado con exito");
        System.out.println("Fin del envio de SMS");
    }
 
    @Override
    public Integer getCantidad() {
        return this.cantidad;
    }
 
    @Override
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }

    @Override
    public void setNombre(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }
 
}
