/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author maltr
 */
public class Cuenta {
    private String nombre; //variable de instacia
    private double saldo;
   
    //el constructor iniciaaliza la variable nombre con el parametro nombre
    public Cuenta(String nombre, double saldo){//el nombre del constructor es el de la clase
        this.nombre = nombre;
        
        if(saldo > 0){
            this.saldo = saldo;
        }
        
    }
    
    //metodo para establecer el nombre en el objeto (set)
    public void setNombre(String nombre) {
        this.nombre = nombre;//almacenar el nombre
    }
    
    //metodo para obtener el nombre del objeto (get)
    public String getNombre() {
        return nombre; //devueelve el valor de nombre a quien lo invoco
    }
    
    //metodo para estabecer (depositar) el saldo (set)
    public void setSaldo(double montoDeposito) {
        if(montoDeposito > 0.0){
            saldo = saldo + montoDeposito;
        }
    }
    
    //metodo para obtener el saldo del objeto (get)
    public double getSaldo() {
        return saldo;
    }

    public double retirar(double montoRetiro){
        if(montoRetiro > saldo){
            System.out.println("El monto a retirar excede el saldo de la cuenta");
        }
        else{
            System.out.printf("Retirando %.2f de la cuenta %n", montoRetiro);
            saldo = saldo - montoRetiro;
        }
        return saldo;
    }
    
    
}
