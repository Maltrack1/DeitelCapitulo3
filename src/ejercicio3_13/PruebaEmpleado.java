/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_13;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado();
        
        Scanner entrada = new Scanner(System.in);
        
        String temp;
        double temp1;
        
        System.out.println("Ingrese el nombre del empleado: ");
        temp = entrada.nextLine();
        emp1.setPrimerNombre(temp);
        
        System.out.println("Ingrese el apellido paterno del empleado: ");
        temp = entrada.nextLine();
        emp1.setApellidoPaterno(temp);
        
        System.out.println("Ingrese el salario mensual del empleado: ");
        temp1 = entrada.nextDouble();
        emp1.setSalario(temp1);
        
        emp1.salarioAnual();
        
        System.out.println("Ingrese el aumento a realizar en porcentaje: ");
        temp1 = entrada.nextDouble();
        emp1.aumento(temp1);
        
        emp1.salarioAnual();
    }
}
