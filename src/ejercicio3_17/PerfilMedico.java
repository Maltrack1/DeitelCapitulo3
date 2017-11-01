/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_17;

/**
 *
 * @author maltr
 */
public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int año;
    private double estatura;
    private double peso;
    private int edad;
    private double bmi;
    private int fecuenciaMax;
    private double frecuenciaInf;
    private double frecuenciaSup;

    public PerfilMedico() {
    }

    public PerfilMedico(String nombre, String apellido, String sexo, int dia, int mes, int año, double estatura, double peso, int edad, double bmi, int fecuenciaMax, double frecuenciaInf, double frecuenciaSup) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.estatura = estatura;
        this.peso = peso;
        this.edad = edad;
        this.bmi = bmi;
        this.fecuenciaMax = fecuenciaMax;
        this.frecuenciaInf = frecuenciaInf;
        this.frecuenciaSup = frecuenciaSup;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int añoActual) {
        int total;
        total = añoActual - this.año;
        this.edad = total;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi() {
        double total;
        double estaturaMe;
        estaturaMe = this.estatura/100;
        total = this.peso / (estaturaMe * estaturaMe);
        this.bmi = total;
    }

    public int getFecuenciaMax() {
        return fecuenciaMax;
    }

    public void setFecuenciaMax() {
        int total;
        total = 220 - this.edad;
        this.fecuenciaMax = total;
    }

    public double getFrecuenciaInf() {
        return frecuenciaInf;
    }

    public void setFrecuenciaInf() {
        double total;
        total = this.fecuenciaMax * 0.5;
        this.frecuenciaInf = total;
    }

    public double getFrecuenciaSup() {
        return frecuenciaSup;
    }

    public void setFrecuenciaSup() {
        double total;
        total = this.fecuenciaMax * 0.85;
        this.frecuenciaSup = total;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: "+ this.apellido);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Fecha de nacimiento: " + this.dia + "/" + this.mes + "/" + this.año);
        double total = this.estatura / 100;
        System.out.printf("Altura: %.2fm\n", total);
        System.out.println("Peso: " + this.peso + "kg");
        System.out.println("Frecuencia maxima: " + this.fecuenciaMax);
        System.out.println("Frecuencias esperadas");
        System.out.println("Frecuencia inferior: " + this.frecuenciaInf);
        System.out.println("Frecuencia superior: " + this.frecuenciaSup);
        System.out.println("Indice de masa corporal (BMI): " + this.bmi);
        System.out.println("\nValores de BMI");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: entre 18.5 y 24.9");
        System.out.println("Sobrepeso: entre 25 y 29.9");
        System.out.println("Obeso: 30 o más");
        
    }
    
}
