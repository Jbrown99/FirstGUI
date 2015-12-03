/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperatureConverter;

/**
 *
 * @author jbrown99
 */
public class TemperatureConverterService {
    
    
    
    
    public String convertFahrenheitToCelsius(String degreesFahrenheit){
        
        double degrees = Double.parseDouble(degreesFahrenheit);
        
        double conversion =((degrees - 32)/1.8);
        
        String finalTemp =  Double.toString(conversion);
        
        return finalTemp;
        
    }
}
