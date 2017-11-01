/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_16;

/**
 *
 * @author maltr
 */
public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int año;
    private int edad;

    public FrecuenciasCardiacas() {
    }

    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int año, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int añoActual) {
        int total;
        total = añoActual - this.año;
        this.edad = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (0 < dia && dia < 32){
            this.dia = dia;
        }
        else{
            System.out.println("Error, se ingreso un dia incorrecto");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (0 < mes && mes <13) {
            this.mes = mes;
        } else {
            System.out.println("Error, se ingreso un mes incorrecto");
        }
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void mostrarInfo(){
        int frecuenciaMax;
        double frecInf;
        double frecSup;
        
        frecuenciaMax = 220 - this.edad;
        frecInf = frecuenciaMax * 0.5;
        frecSup = frecuenciaMax * 0.85;
        
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Fecha de nacimiento: " + this.dia + "/" + this.mes + "/" + this.año);
        System.out.println("Edad: " + this.edad);
        System.out.printf("Frecuencia cardiaca maxima: %d%n", frecuenciaMax );
        System.out.printf("Su frecuencia esperada debe encontrarse entre %.2f y %.2f%n", frecInf, frecSup);
    }
    
}
