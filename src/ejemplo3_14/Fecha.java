/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3_14;

/**
 *
 * @author maltr
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if( 0 < dia && dia < 32){
            this.dia = dia;
        }
        else{
            System.out.println("Error, se ingreso un dia no valido");
        }
        
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if ( 0 < mes && mes < 13) {
            this.mes = mes;
        } 
        else {
            System.out.println("Error, se ingreso un mes no valido");
        } 
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public void mostrarInfo(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.año);
    }
    
}
