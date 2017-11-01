/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_16;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        FrecuenciasCardiacas pac1 = new FrecuenciasCardiacas();
    
        Scanner entrada = new Scanner(System.in);
    
        String temp;
        int temp1;
        
        System.out.println("Ingresa el nombre: ");
        temp = entrada.nextLine();
        pac1.setNombre(temp);
        
        System.out.println("Ingresa el apellido: ");
        temp = entrada.nextLine();
        pac1.setApellido(temp);
        
        System.out.println("Ingresaremos la fecha de nacimiento");
        
        System.out.println("Ingresa el dia: ");
        temp1 = entrada.nextInt();
        pac1.setDia(temp1);
        
        System.out.println("Ingresa el mes: ");
        temp1 = entrada.nextInt();
        pac1.setMes(temp1);
        
        System.out.println("Ingresa el año: ");
        temp1 = entrada.nextInt();
        pac1.setAño(temp1);
        
        System.out.println("Ingresa el año actual: ");
        temp1 = entrada.nextInt();
        pac1.setEdad(temp1);
        
        pac1.mostrarInfo();
    }
}
