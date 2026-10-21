package com.edu.ec.taller;

 
import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
 //ambitos y contextos 
//@ApplicationScoped //su ambito es durante toda la app , es decir se crea un objeto una sola instancia de a clase y se comparte entre todos los componentes que lo utilizan
//@RequestScoped// su ambito es en aplicaciones web durante el request / peticion http 
//Singleton// su ambito durante toda la app,  es decir se crea un objeto una sola instancia de a clase y se comparte entre todos los componentes que lo utilizan
//cada ves que se inyecte se creara un nuevo objeto
@Dependent 
@Named ("mail")  
public class MailService implements Notificacion{

    private  Integer cantidad =0;
 
    private String nombre;
   
    @Override
    public void enviar(String destino, String mensaje) {

        System.out.println("Enviando correo a: " + destino);
        System.out.println("mensaje: " + mensaje);
        System.out.println("Correo enviado con exito");
        System.out.println("Fin del envio de correo");
    
    }
    
    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
       public Integer getCantidad() {
        return cantidad;
    }



    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}