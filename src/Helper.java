/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author matth
 */

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DecimalFormat;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

public class Helper {
    
    public static boolean isPositive(double num)
    {
        return (num > 0);
    }
    
    public static boolean isPositiveZeroIncluded(double num)
    {
        return (num >= 0);
    }
    
    public static String formatDouble(double value)
    {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(value);
    }
    
    public static String calculateDownPaymentReturnString(double homePrice, double percentageDownPayment, double closingCosts)
    {
        return formatDouble((homePrice * (percentageDownPayment / 100)) + closingCosts);
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
    
    public static boolean isValidPercentageUnderEq100(String num)
    {
        try
        {
            return ((Helper.isValidNumber(num)) && (Double.parseDouble(num) <= 100));
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
    
    public static double computeAutoLoan(double principal, double interestMonthly, double loanTermMonths)
    {
        double numerator = principal * (interestMonthly * Math.pow((1 + interestMonthly), loanTermMonths));
        double denominator = (Math.pow((1+interestMonthly), loanTermMonths)) - 1;
        return numerator / denominator;
    }
    
    public static double monthlyPayment(double amount, double yearlyInterestRate, int numYears)
    {
        // A return value of -1 indicates an error.
        if (!isPositive(numYears) || !isPositiveZeroIncluded(yearlyInterestRate) || !isPositive(amount))
        {
            return -1;
        }
        
        if (yearlyInterestRate == 0)
        {
            return Math.round((amount / (numYears * 12)) * 100.0) / 100.0;
        }
        
        double monthlyInterestRate = yearlyInterestRate / 1200;
        
        double unformattedAnswer = amount * monthlyInterestRate / 
            (1 - Math.pow(1 + monthlyInterestRate, -(numYears * 12)));
        
        return Math.round(unformattedAnswer * 100.0) / 100.0;
    }
    
    public static Dictionary<String,Double> webScraper()
    {
        String successMsg = "Success";
        String url = "http://www.x-rates.com/table/?from=USD&amount=1";
        Dictionary<String,Double> dict= new Hashtable<>();
        try
        {
            Document doc = Jsoup.connect(url).get();
            Elements rows = doc.select("table.ratesTable > tbody > tr");
            System.out.printf(rows.text());
            for (Element row : rows)
            {
                Elements tds = row.select("td");
                String currency = tds.get(0).text();
                Double rate1 = Double.valueOf(tds.get(1).text());
                Double rate2 = Double.valueOf(tds.get(2).text());
                System.out.printf("Currency: %s, rate1: %s, rate2: %s%n", currency, rate1, rate2);
                dict.put(currency, rate1);
            }
            System.out.println(dict.get("Chilean Peso"));
        }
        
        catch (IOException e)
        {
            successMsg = "fail";
        }
        System.out.printf(successMsg);
        return dict;
    }
    //Tristan's Validated 
    public static boolean Validated(String testVal, String testVal2, String testVal3)
    {
        //list
        List<String> input = new ArrayList<>();
        input.add(testVal);
        input.add(testVal2);
        input.add(testVal3);
        boolean isValidated = true;
        //loop      
        for (int i = 0; i < 3; i++)
        {
            if (isNumber(input.get(i)))
            {
                isValidated = isPos(input.get(i));
            }
            else
            {
                isValidated = false;
            }
            
        }
            return isValidated;
    }
    //isNumber
    public static boolean isNumber(String testNum)
    {
        try
        {   
            double val = Double.parseDouble(testNum);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        
    }
    //isPos
    public static boolean isPos(String testNum)
    {
        if ("".equals(testNum))
        {
            return false;
        }
        
        double val = Double.parseDouble(testNum);
        return val > 0;
    }
    
    //Calc 6 monthly payment
    public static double MonthlyPayment(double P, double n, double iRate) 
    {
        return (P * iRate * Math.pow(1 + iRate, n) / (Math.pow(1 + iRate, n) - 1));
    }//
    
    public static void consumeNotNumbersAllowDecimal (JTextField textField, KeyEvent evt) {// Big thanks to Miguel (I think)
        char c = evt.getKeyChar();
        String userInput = textField.getText();
        int userLength = userInput.length();        
        if (!(Character.isDigit(c) || c == '.' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE))     //Only accepts one . 
            evt.consume();
        else if (c == '.' && textField.getText().contains("."))   {    
            evt.consume();
        }

        if (userLength > 12)    //This makes text fields only accept up to 12 charactes. If you want to change this simply make a new void
            evt.consume();
    }
    public static void consumeNotNumbersAllowDecimalAndNeg (JTextField textField, KeyEvent evt) {// It has an issue where if numbers are already in the text field a negative cannot be added
    char c = evt.getKeyChar();
    String userInput = textField.getText();
    int userLength = userInput.length();
    if (!(Character.isDigit(c) || c == '.' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE || c == '-')) {
        evt.consume();
    } else if (c == '.' && textField.getText().contains(".")) {
        evt.consume();
    } else if (c == '-' && textField.getText().length() > 0) {
        evt.consume();
    }
    
    if (userLength >= 12) {
        evt.consume();
    }
}
    
    public static void consumeNotNumbers (JTextField textField, KeyEvent evt) {// Big thanks to *insert name later* (I forgot) 
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) ))
            evt.consume();
    }
}

