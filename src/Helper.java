/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author matth
 */
public class Helper {
    
    public static boolean validatePositiveArray(int[] array, int n)
    {
        for (int i = 0; i < n; i++)
        {
            if (array[i] <= 0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean isInRange(int n, int low, int high)
    {
        return ((n >= low) && (n <= high));
    }
    
    public static boolean isPalindrome(String text)
    {
        int length = text.length();
        for (int i = 0; i <= (length / 2); i++)
        {
            if (text.charAt(i) != text.charAt(length-1-i))
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isValidNumber(String num)
    {
        try
        {
            double newNum = Double.parseDouble(num);
            
            if (newNum < 0)
            {
                return false;
            }
            
            if (num.indexOf('d') >= 0)
            {
                return false;
            }
            
            if (num.indexOf('f') >= 0)
            {
                return false;
            }
            
            return true;
        }
        
        catch (NumberFormatException e)
        {
            return false;
        }
    }
    
    public static boolean validateUserInput()
    {
        return false;
    }
    
    public static double convertAnnualToMonthly(double yearlyInterestRate)
    {
        double temp = yearlyInterestRate + 1;
        temp = Math.pow(temp, (1/12));
        return temp - 1;
    }
    
    public static double monthlyPayment(double amount, double yearlyInterestRate, int numYears)
    {
        if (numYears == 0)
        {
            return 0.0;
        }
        
        double monthlyInterestRate = yearlyInterestRate / 1200;
        
        double unformattedAnswer = amount * monthlyInterestRate / 
            (1 - Math.pow(1 + monthlyInterestRate, -(numYears * 12)));
        
        return Math.round(unformattedAnswer * 100.0) / 100.0;
    }
    
}
