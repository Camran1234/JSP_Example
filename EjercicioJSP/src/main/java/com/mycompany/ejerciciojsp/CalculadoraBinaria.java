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
public class CalculadoraBinaria {
    
    private ExcepcionNumero excepcion = new ExcepcionNumero();
    
    /**
     * Devuelve una cadena string con el numero binario del numero indicado
     * @param number
     * @return 
     */
    public String parseToBinary(String number){
        if(excepcion.proveNumberInteger(number)){
            int numero = Integer.parseInt(number);
            return (Integer.toBinaryString(numero));
        } else{
            return "No es un numero entero, no se pudo transformar a binario";
        }
    }
    
}
