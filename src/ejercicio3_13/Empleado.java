/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_13;

/**
 *
 * @author maltr
 */
public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salario;

    public Empleado() {
    }

    public Empleado(String primerNombre, String apellidoPaterno, double salario) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.salario = salario;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 0){
            System.out.println("Error el salario es negativo");
        }
        else{
            this.salario = salario;
        }
        
    }
    
    public void salarioAnual(){
        double total;
        total = this.salario * 12;
        System.out.printf("El salario anual del empleado " + this.primerNombre + " " + this.apellidoPaterno + " es de: %.2f\n", total);
    }
    
    public void aumento(double aumento){
        double porc;
        double total;
        porc = aumento / 100;
        total = this.salario * (1 + porc);
        System.out.printf("Realizando aumento de %.2f al salario de " + this.primerNombre + " " + this.apellidoPaterno + "\n", porc);
        this.salario = total;
    }
    
}
