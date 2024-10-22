/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author npcnp
 */
public class validate {
    
    public static boolean validIsPosNumber(String text) {
        if (text.isEmpty()) {
            return false;
        }
        try {
            Double value = Double.parseDouble(text);
            return value > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean validIsZero(String text) {

        Double value = Double.parseDouble(text);
        if  (value == 0){
            return true;
        }
        else {
            return false;
        }    
    }
    public static boolean isPositiveOrZero(double n) {
        return n >= 0;
    }
    
    public static boolean isPositive(double n) {
        return n > 0;
    }
    
}
