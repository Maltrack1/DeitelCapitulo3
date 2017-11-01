/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_12;

/**
 *
 * @author maltr
 */
public class Factura {
    private String numeroDePieza;
    private String descripcion;
    private int artVendidos;
    private double precio;

    public Factura() {
    }

    public Factura(String numeroDePieza, String descripcion, int artVendidos, double precio) {
        this.numeroDePieza = numeroDePieza;
        this.descripcion = descripcion;
        this.artVendidos = artVendidos;
        this.precio = precio;
    }

    public void setNumeroDePieza(String numeroDePieza) {
        this.numeroDePieza = numeroDePieza;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }

    public void setArtVendidos(int artVendidos) {
        this.artVendidos = artVendidos;
    }

    public String getNumeroDePieza() {
        return numeroDePieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getArtVendidos() {
        return artVendidos;
    }
    
    public void mostrarInformacion(){
        System.out.printf("\n\nFactura\n");
        System.out.println("Codigo de pieza: " + this.numeroDePieza);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Precio por unidad: " + this.precio);
        System.out.println("Articulos vendidos: " + this.artVendidos);
        double total;
        total = this.precio * this.artVendidos;
        System.out.printf("\nTotal: %.2f\n", total);
        
    }
    
}
