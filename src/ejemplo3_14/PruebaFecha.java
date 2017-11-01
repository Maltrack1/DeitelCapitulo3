/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3_14;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fec1 = new Fecha();
        Scanner entrada = new Scanner(System.in);
        
        int temp;
        
        System.out.println("Ingrese el dia: ");
        temp = entrada.nextInt();
        fec1.setDia(temp);
        
        System.out.println("Ingrese el mes: ");
        temp = entrada.nextInt();
        fec1.setMes(temp);
        
        System.out.println("Ingrese el año: ");
        temp = entrada.nextInt();
        fec1.setAño(temp);
        
        fec1.mostrarInfo();
    }
}
