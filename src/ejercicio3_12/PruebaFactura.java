/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_12;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class PruebaFactura {
    public static void main(String[] args) {
        Factura fac1 = new Factura();
        Factura fac2 = new Factura();
        Scanner entrada = new Scanner(System.in);
        String temp;
        double precio;
        int cantidad;
        
        System.out.println("Ingresa el codigo del producto uno: ");
        temp = entrada.nextLine();
        fac1.setNumeroDePieza(temp);
        
        System.out.println("Ingresa la descripcion del producto: ");
        temp = entrada.nextLine();
        fac1.setDescripcion(temp);
        
        System.out.println("Ingresa el costo por unidad: ");
        precio = entrada.nextDouble();
        fac1.setPrecio(precio);
        
        System.out.println("Ingresa la cantidad de piezas vendidas: ");
        cantidad = entrada.nextInt();
        fac1.setArtVendidos(cantidad);
        
        fac1.mostrarInformacion();
        
        
        
    }
}
