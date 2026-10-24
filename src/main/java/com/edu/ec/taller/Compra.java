package com.edu.ec.taller;

public class Compra {

      private String Cliente;
    private String Producto;
    private double Total;
    private String Correo;
    private String Telefono;
 
   
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
    public String getCliente() {
        return Cliente;
    }
    public void setCliente(String cliente) {
        Cliente = cliente;
    }
    public String getProducto() {
        return Producto;
    }
    public void setProducto(String producto) {
        Producto = producto;
    }
    public double getTotal() {
        return Total;
    }
    public void setTotal(double total) {
        Total = total;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
 
 
    public Compra(String cliente, String producto, int total, String correo) {
        Cliente = cliente;
        Producto = producto;
        Total = total;
        Correo = correo;
    }
 
   
}


