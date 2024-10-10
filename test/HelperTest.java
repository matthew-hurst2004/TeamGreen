/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.Dictionary;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matth
 */
public class HelperTest {
    
    public HelperTest() {
    }

    /**
     * Test of isValidNumber method, of class Helper.
     */
    @Test
    public void testIsValidNumber() {
        System.out.println("isValidNumber");
        String num = "";
        boolean expResult = false;
        boolean result = Helper.isValidNumber(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    
    /**
     * Test of monthlyPayment method, of class Helper.
     */
    @Test
    public void testMonthlyPayment() {
        System.out.println("monthlyPayment");
        double amount;
        double yearlyInterestRate;
        int numYears;
        double expResult;
        double result;
        amount = 0.0;
        yearlyInterestRate = 0.0;
        numYears = 0;
        expResult = -1;
        result = Helper.monthlyPayment(amount, yearlyInterestRate, numYears);
        assertEquals(expResult, result, 0);
        amount = 200000;
        yearlyInterestRate = 0;
        numYears = 15;
        expResult = 1111.11;
        result = Helper.monthlyPayment(amount, yearlyInterestRate, numYears);
        assertEquals(expResult, result, 0);
        amount = 200000;
        numYears = 15;
        yearlyInterestRate = 6;
        expResult = 1687.71;
        result = Helper.monthlyPayment(amount, yearlyInterestRate, numYears);
        assertEquals(expResult, result, 0);
        amount = 500000;
        numYears = 30;
        yearlyInterestRate = 8;
        expResult = 3668.82;
        result = Helper.monthlyPayment(amount, yearlyInterestRate, numYears);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of isPositive method, of class Helper.
     */
    @Test
    public void testIsPositive() {
        System.out.println("isPositive");
        double num = 0.0;
        boolean expResult = false;
        boolean result = Helper.isPositive(num);
        assertEquals(expResult, result);
        num = 3.4;
        expResult = true;
        result = Helper.isPositive(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPositiveZeroIncluded method, of class Helper.
     */
    @Test
    public void testIsPositiveZeroIncluded() {
        System.out.println("isPositiveZeroIncluded");
        double num = 0.0;
        boolean expResult = true;
        boolean result = Helper.isPositiveZeroIncluded(num);
        assertEquals(expResult, result);
        num = -5.4;
        expResult = false;
        result = Helper.isPositiveZeroIncluded(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of webScraper method, of class Helper.
     */
//    @Test
//    public void testWebScraper() {
//        System.out.println("webScraper");
//        Dictionary<String, Double> expResult = null;
//        Dictionary<String, Double> result = Helper.webScraper();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
