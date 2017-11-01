/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_17;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class PruebaPerfilMedico {
    public static void main(String[] args) {
        PerfilMedico per1 = new PerfilMedico();
        
        Scanner entrada = new Scanner(System.in);
        
        int temp;
        String temp1;
        double temp2;
        
        System.out.println("Generador de perfiles medicos\n\n");
        System.out.println("Ingrese el nombre del paciente: ");
        temp1 = entrada.nextLine();
        per1.setNombre(temp1);
        
        System.out.println("Ingrese el apellido paterno del paciente: ");
        temp1 = entrada.nextLine();
        per1.setApellido(temp1);
        
        System.out.println("Ingrese el sexo del paciente: ");
        temp1 = entrada.nextLine();
        per1.setSexo(temp1);
        
        System.out.println("Ingresaremos su fecha de nacimiento");
        System.out.println("Ingrese el dia: ");
        temp = entrada.nextInt();
        per1.setDia(temp);
        
        System.out.println("Ingrese el mes: ");
        temp = entrada.nextInt();
        per1.setMes(temp);
        
        System.out.println("Ingrese el año: ");
        temp = entrada.nextInt();
        per1.setAño(temp);
        
        System.out.println("Ingrese su estatura en centimetros: ");
        temp2 = entrada.nextDouble();
        per1.setEstatura(temp2);
        
        System.out.println("Ingrese su peso en kilos: ");
        temp2 = entrada.nextDouble();
        per1.setPeso(temp2);
        
        System.out.println("Ingrese el año actual: ");
        temp = entrada.nextInt();
        per1.setEdad(temp);
        
        per1.setBmi();
        per1.setFecuenciaMax();
        per1.setFrecuenciaInf();
        per1.setFrecuenciaSup();
        
        per1.mostrarInfo();
    }
}
