/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author matth
 */

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

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
    
}
