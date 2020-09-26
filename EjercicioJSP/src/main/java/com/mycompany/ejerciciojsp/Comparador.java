/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciojsp;

/**
 *
 * @author camran1234
 */
public class Comparador {
 
    private ExcepcionNumero excepcion = new ExcepcionNumero();
    
    /**
     * Clase para comparar numeros y obtener la potencia 
     */
    public Comparador(){
        
    }
    
    public double getMajorNumber(String numberA, String numberB){
        if(excepcion.proveNumber(numberA) && excepcion.proveNumber(numberB)){
            double numeroC = Double.parseDouble(numberA);
            double numeroD = Double.parseDouble(numberB);
            
            //Corroboramos que numero es mayor o verificar si son iguales
            if(numeroC>numeroD){
                return numeroC;
            } else if(numeroD>numeroC){
                return numeroD;
            } else {
                return 0;
            }
        }
        else{
            return -1;
        }
    }
    
    public double getPowerNumbers(String numberA, String numberB){
        if(excepcion.proveNumber(numberA) && excepcion.proveNumber(numberB)){
            double numeroC = Double.parseDouble(numberA);
            double numeroD = Double.parseDouble(numberB);
            
            //Retornamos la potencia
            return (Math.pow(numeroC, numeroD));
        }
        else{
            return 0;
        }
    }
}
