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
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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
        String url = "http://www.x-rates.com/table/?from=USD&amount=1";
        Dictionary<String,Double> dict= new Hashtable<>();
        try
        {
            Document doc = Jsoup.connect(url).get();
            Elements rows = doc.select("table.ratesTable > tbody > tr");
            for (Element row : rows)
            {
                Elements tds = row.select("td");
                String currency = tds.get(0).text();
                Double rate1 = Double.valueOf(tds.get(1).text());
                dict.put(currency, rate1);
            }
        }
        
        catch (IOException e)
        {
        }
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

    
        
    // Accumulated interest
    public static double remainingAccumulatedInterest(double remainingBalance, double monthlyPayment, double iRate)
    {
        double accumulatedInterest = 0;
        if (remainingBalance < monthlyPayment)
        {
            return 0;
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
    //months
    public static double months(double remainingBalance, double monthlyPayment, double iRate)
    {
        double months = 0;
        if (remainingBalance < monthlyPayment)
        {
            return 0;
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
    // original loan
    public static double originalAccumulatedInterest(double remainingBalance, double monthlyPayment, double iRate, double time)
    {
        double remainingAccumulatedInterest = 0;
        double noncurrentInterest = 0;
        int  counter = 0;
        if (remainingBalance < monthlyPayment)
        {
            return 0;
        }
        else
        {
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
        }
        
      return remainingAccumulatedInterest - noncurrentInterest;     
    }

    public static double calculateInterestRate(double P, double M, double n, double tolerance) 
    {
        if (P == 0)
        {
            return 0;
        }
        else
        {
            double i = 0.05; // Initial guess for iRate (5%)
            double increment = 0.0001; // Increment for derivative calculation

            while (true) 
            {
                double fValue = calculateFunction(P, M, n, i);
                double fDerivative = calculateDerivative(P, M, n, i, increment);

                // Update the interest rate using Newton-Raphson
                double newRate = i - fValue / fDerivative;

                // Check for convergence
                if (Math.abs(newRate - i) < tolerance) {
                    break; // Close enough
                }

                // Update for the next iteration
                i = newRate;
            }
            return i; // Return the monthly interest rate
        }
         
    }
    
    public static double calculateFunction(double P, double M, double n, double i) 
    {
        return (M - P * i * Math.pow(1 + i, n) / (Math.pow(1 + i, n) - 1));
    }

    public static double calculateDerivative(double P, double M, double n, double i, double increment) 
    {
        return (calculateFunction(P, M, n, i + increment) - calculateFunction(P, M, n, i)) / increment;
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

        if (userLength > 30)    //This makes text fields only accept up to 12 charactes. If you want to change this simply make a new void
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

        if (userLength >= 31) {
            evt.consume();
        }
    }
    
    public static void consumeNotNumbers (JTextField textField, KeyEvent evt) {// Big thanks to *insert name later* (I forgot) 
        char c = evt.getKeyChar();
        String userInput = textField.getText();
        int userLength = userInput.length();
        
        if (!(Character.isDigit(c) ))
            evt.consume();
        
        if (userLength >= 18) {
            evt.consume();
        }
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
    // Calc the after tax return
    public static double afterTaxReturn (double r, double tr) {
        double atr = r * (1 - tr);
        return atr;
    }
    // Calc value of taxable account
    public static double taxableValue (double pv, double atr, double N) {
        pv = pv * (Math.pow((1 + atr), N));
        return pv;
    }
    
    public static double landonMortgagePerMonth (double loanTermDouble, double homePriceDouble, double downPaymentDouble, // This might not work for others so I put my name on it
        double interestRate, double otherCostsDouble, double hoaFeeDouble, double propertyTaxDouble, double homeInsuranceDouble) {
        double loanTermNumberOfMonths = loanTermDouble * 12;
        double principal = homePriceDouble - downPaymentDouble;
        double monthlyPayment = (principal * interestRate) / (1 - Math.pow(1 + interestRate, - loanTermNumberOfMonths));
        double totalMonthyPayment = monthlyPayment + (otherCostsDouble / 12) + (hoaFeeDouble / 12) + (propertyTaxDouble / 12) + (homeInsuranceDouble / 12); // adding the extra things to the monthly payment

        return totalMonthyPayment;
    }
    // not to self the number of variables could probably be decreased
    public static double rentVsBuyCalculations (double homeBuildUp, double rentBuildUp, double monthsUntillRentMoreBuy, 
            double counterForYearlyIncrease, double homePropertyTaxDouble, double propertyTaxIncreaseDouble,
            double homeRentDouble, double rentalFeeIncreaseDouble, double loanTermDouble, double homePriceDouble,
            double downPaymentAmountDouble, double homeInterestRateDouble, double houseOtherCostsDouble, double hoaFeeDouble, 
            double homeInsuranceDouble, double renterInsuranceDouble) {
        double houseMortgageMonthly = 0; // Maybe not needed
        while (homeBuildUp > rentBuildUp && monthsUntillRentMoreBuy < 2401) { // 2401 is to give a cut off point after 200 years
            if (counterForYearlyIncrease >= 12){
                homePropertyTaxDouble = homePropertyTaxDouble * ((propertyTaxIncreaseDouble / 100) + 1);
                homeRentDouble = homeRentDouble * ((rentalFeeIncreaseDouble / 100) + 1);
            }
            double monthlyPayment = 0;
            double totalMonthyPayment = 0;
            double loanTermNumberOfMonths = loanTermDouble * 12;
            double principal = homePriceDouble - downPaymentAmountDouble;
            monthlyPayment = (principal * homeInterestRateDouble) / (1 - Math.pow(1 + homeInterestRateDouble, - loanTermNumberOfMonths));
            totalMonthyPayment = monthlyPayment + (houseOtherCostsDouble / 12) + (hoaFeeDouble / 12) + (homePropertyTaxDouble / 12) + (homeInsuranceDouble / 12); // adding the extra things to the monthly payment

            homeBuildUp = homeBuildUp + totalMonthyPayment; // not done yet
            rentBuildUp = rentBuildUp + homeRentDouble + renterInsuranceDouble; // not done yet

            counterForYearlyIncrease = counterForYearlyIncrease + 1;
            monthsUntillRentMoreBuy = monthsUntillRentMoreBuy + 1;

        }        
        return monthsUntillRentMoreBuy;
    }   
    
}
