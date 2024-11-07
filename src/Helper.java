/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author matth
 */

import java.awt.Component;
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
import javax.swing.JOptionPane;
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
    public static double monthlyPayment(double P, double n, double iRate) 
    {
        return (P * iRate * Math.pow(1 + iRate, n) / (Math.pow(1 + iRate, n) - 1));
    }
    // Input validation Calc 6
    public static double getInput(JTextField textField, String errorMessage) 
    {
        try 
        {
            return Double.parseDouble(textField.getText());
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(null, errorMessage, "ERROR", JOptionPane.ERROR_MESSAGE);
            textField.setText("");
            textField.requestFocusInWindow();
            return -1; // Return an invalid value
        }
    }
    
    
    
    
    // Accumulated interest
    public static double remainingAccumulatedInterest(double remainingBalance, double monthlyPayment, double iRate)
    {
        double accumulatedInterest = 0;
        
        
        if (monthlyPayment <= remainingBalance * iRate) 
        {
            System.out.println(monthlyPayment);
            System.out.println("Monthly payment is too low to pay off the balance."  + (remainingBalance * iRate));
            return -1;
        }
        else
        {
            while (remainingBalance > 0) 
            {
                double interest = remainingBalance * iRate;
                remainingBalance += interest; // Add interest to the balance
                remainingBalance -= monthlyPayment; // Subtract the monthly payment
                accumulatedInterest += interest;

            }
        }

        
        return accumulatedInterest;     
    }

    public static double months(double remainingBalance, double monthlyPayment, double iRate)
    {
        double months = 0;
        
        
        if (monthlyPayment <= remainingBalance * iRate) 
        {
            System.out.println(monthlyPayment);
            System.out.println("Monthly payment is too low to pay off the balance."  + (remainingBalance * iRate));
            return -1;
        }
        else
        {
            while (remainingBalance > 0) 
            {
                double interest = remainingBalance * iRate;
                remainingBalance += interest; // Add interest to the balance
                remainingBalance -= monthlyPayment; // Subtract the monthly payment
                months++;
                

            }
        }
 
        return months;     
    }
    public static double originalAccumulatedInterest(double remainingBalance, double monthlyPayment, double iRate, double time)
    {
        double remainingAccumulatedInterest = 0;
        double noncurrentInterest = 0;
        int  counter = 0;
        

        while (remainingBalance > 0) 
        {
            
            double interest = remainingBalance * iRate;
            remainingBalance += interest; // Add interest to the balance
            remainingBalance -= monthlyPayment; // Subtract the monthly payment
            remainingAccumulatedInterest += interest;
            counter++;
            if (counter <= time)
            {
                noncurrentInterest += interest;
            }
            
        }
      return remainingAccumulatedInterest - noncurrentInterest;     
    }

    
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
    
    // Calc fucuture value of current balance (roth IRA)
    public static double futureCurrent (double current, double r, double years) {
        double future = current * Math.pow(1 + r, years);
        return future;
    }
    // Calc the contributions over N years
    public static double futureContributionsCalculator (double C, double r, double N) {
        double FVC = C * ((Math.pow(1 + r, N) - 1) / r);
        return FVC;
    }


    public static double landonMortgagePerMonth (double loanTermDouble, double homePriceDouble, double downPaymentDouble,
            double interestRate, double otherCostsDouble, double hoaFeeDouble, double propertyTaxDouble, double homeInsuranceDouble) {
            double loanTermNumberOfMonths = loanTermDouble * 12;
            double principal = homePriceDouble - downPaymentDouble;
            double monthlyPayment = (principal * interestRate) / (1 - Math.pow(1 + interestRate, - loanTermNumberOfMonths));
            double totalMonthyPayment = monthlyPayment + (otherCostsDouble / 12) + (hoaFeeDouble / 12) + (propertyTaxDouble / 12) + (homeInsuranceDouble / 12); // adding the extra things to the monthly payment

        return totalMonthyPayment;
    }
}

