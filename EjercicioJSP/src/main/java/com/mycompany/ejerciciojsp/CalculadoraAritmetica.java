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
public class CalculadoraAritmetica {
    
    private ExcepcionNumero excepcion = new ExcepcionNumero();
    
    /**
     * Clase para realizar operaciones aritmeticas sencillas
     * Suma, Resta, Multiplicacion, Division
     */
    public CalculadoraAritmetica(){
        
    }
    
    
    /**
     * Devuelve la suma de dos numeros
     * @param numeroA
     * @param numeroB
     * @return 
     */        
    public double sumarNumeros(String numberA, String numberB){
        if(excepcion.proveNumber(numberA) && excepcion.proveNumber(numberB)){
            return (Double.parseDouble(numberA)+Double.parseDouble(numberB));
        }
        else{
            return 0;
        }
    }
    
    /**
     * Devuelve la resta de dos numeros
     * @param numeroA
     * @param numeroB
     * @return 
     */
    public double restarNumeros(String numberA, String numberB){
        if(excepcion.proveNumber(numberA) && excepcion.proveNumber(numberB)){
            return (Double.parseDouble(numberA)-Double.parseDouble(numberB));
        }
        else{
            return 0;
        }
    }
    
    /**
     * Devuelve la multiplicacion de dos numeros
     * @param numeroA
     * @param numeroB
     * @return 
     */
    public double multiplicarNumeros(String numberA, String numberB){
        if(excepcion.proveNumber(numberA) && excepcion.proveNumber(numberB)){
            return (Double.parseDouble(numberA)*Double.parseDouble(numberB));
        }
        else{
            return 0;
        }
    }
    
    /**
     * Devuelve la division de dos numeros
     * @param numeroA
     * @param numeroB
     * @return 
     */
    public double dividirNumerosNumeros(String numberA, String numberB) {
        if(excepcion.proveNumber(numberA) && excepcion.proveNumber(numberB)){
            double numberC = Double.parseDouble(numberA);
            double numberD = Double.parseDouble(numberB);
            if(numberD!=0){
                return (numberC/numberD);
            } else{
                return 0;
            }
        }
        else{
            return 0;
        }
    }
}
