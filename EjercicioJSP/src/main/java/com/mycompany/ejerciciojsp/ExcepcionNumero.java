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
public class ExcepcionNumero {
  /**
     * Retorna verdadero si el numero puede convertirse en double
     * @param number
     * @return 
     */
    boolean proveNumber(String number){
        try {
            double numberDouble = Double.parseDouble(number);
            return true;
        } catch (Exception e) {
            return false;
        }  
    }
    
    /**
     * Retorna verdadero si el numero puede convertirse en Integer
     * @param number
     * @return 
     */
    boolean proveNumberInteger(String number){
        try {
            int numberDouble = Integer.parseInt(number);
            return true;
        } catch (Exception e) {
            return false;
        }  
    }
    
      
}
