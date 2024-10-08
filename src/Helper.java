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
    
    public static boolean isPositive(double num)
    {
        return (num > 0);
    }
    
    public static boolean isPositiveZeroIncluded(double num)
    {
        return (num >= 0);
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
    
}
