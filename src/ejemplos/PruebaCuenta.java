/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class PruebaCuenta {
    public static void main(String[] args) {
        //Crea un objeto 
        Scanner entrada = new Scanner(System.in);
        
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);
        
        System.out.println("El saldo de " + cuenta1.getNombre() + " es: " + cuenta1.getSaldo());
        System.out.println("El saldo de " + cuenta2.getNombre() + " es: " + cuenta2.getSaldo());
        
        System.out.println("Escriba el monto a depositar para la cuenta de " + cuenta1.getNombre() + ": ");
        double montoDeposito = entrada.nextDouble();
        System.out.printf("Sumando %.2f al saldo de " + cuenta1.getNombre() + "%n", montoDeposito);
        cuenta1.setSaldo(montoDeposito);
        
        System.out.println("El saldo de " + cuenta1.getNombre() + " es: " + cuenta1.getSaldo());
        System.out.println("El saldo de " + cuenta2.getNombre() + " es: " + cuenta2.getSaldo());
        
        System.out.println("Escriba el monto a depositar para la cuenta de " + cuenta2.getNombre() + ": ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("Sumando %.2f al saldo de " + cuenta2.getNombre() + "%n", montoDeposito);
        cuenta2.setSaldo(montoDeposito);
        
        System.out.println("El saldo de " + cuenta1.getNombre() + " es: " + cuenta1.getSaldo());
        System.out.println("El saldo de " + cuenta2.getNombre() + " es: " + cuenta2.getSaldo());
        
        System.out.println("Escriba el monto a retirar para la cuenta de " + cuenta1.getNombre() + ": ");
        double montoRetiro = entrada.nextDouble();
        cuenta1.retirar(montoRetiro);
        
        System.out.println("El saldo de " + cuenta1.getNombre() + " es: " + cuenta1.getSaldo());
        System.out.println("El saldo de " + cuenta2.getNombre() + " es: " + cuenta2.getSaldo());
        
        System.out.println("Escriba el monto a retirar para la cuenta de " + cuenta2.getNombre() + ": ");
        montoRetiro = entrada.nextDouble();
        cuenta2.retirar(montoRetiro);
        
        System.out.println("El saldo de " + cuenta1.getNombre() + " es: " + cuenta1.getSaldo());
        System.out.println("El saldo de " + cuenta2.getNombre() + " es: " + cuenta2.getSaldo());
    }
}
