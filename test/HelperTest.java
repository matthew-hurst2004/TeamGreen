/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.awt.event.KeyEvent;
import java.util.Dictionary;
import javax.swing.JTextField;
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
     * Test of formatDouble method, of class Helper.
     */
    @Test
    public void testFormatDouble() {
        System.out.println("formatDouble");
        double value = 0.0;
        String expResult = "0.00";
        String result = Helper.formatDouble(value);
        assertEquals(expResult, result);
        value = 5.4;
        expResult = "5.40";
        result = Helper.formatDouble(value);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateDownPaymentReturnString method, of class Helper.
     */
    @Test
    public void testCalculateDownPaymentReturnString() {
        System.out.println("calculateDownPaymentReturnString");
        double homePrice = 500000;
        double percentageDownPayment = 20;
        double closingCosts = 15000;
        String expResult = "115,000.00";
        String result = Helper.calculateDownPaymentReturnString(homePrice, percentageDownPayment, closingCosts);
        assertEquals(expResult, result);
        homePrice = 400000;
        percentageDownPayment = 20;
        closingCosts = 25000;
        expResult = "105,000.00";
        result = Helper.calculateDownPaymentReturnString(homePrice, percentageDownPayment, closingCosts);
        assertEquals(expResult, result);
    }

    /**
     * Test of webScraper method, of class Helper.
     */
    @Test
    public void testWebScraper() {
        System.out.println("webScraper");
        Dictionary<String, Double> expResult = null;
        Dictionary<String, Double> result = Helper.webScraper();
        assertEquals(expResult, result);
    }

    /**
     * Test of Validated method, of class Helper.
     */
    @Test
    public void testValidated() {
        System.out.println("Validated");
        String testVal = "";
        String testVal2 = "";
        String testVal3 = "";
        boolean expResult = false;
        boolean result = Helper.Validated(testVal, testVal2, testVal3);
        assertEquals(expResult, result);
    }

    /**
     * Test of isNumber method, of class Helper.
     */
    @Test
    public void testIsNumber() {
        System.out.println("isNumber");
        String testNum = "";
        boolean expResult = false;
        boolean result = Helper.isNumber(testNum);
        assertEquals(expResult, result);
    }

    /**
     * Test of isPos method, of class Helper.
     */
    @Test
    public void testIsPos() {
        System.out.println("isPos");
        String testNum = "";
        boolean expResult = false;
        boolean result = Helper.isPos(testNum);
        assertEquals(expResult, result);
    }

    /**
     * Test of isNegative method, of class Helper.
     */
    @Test
    public void testIsNegative() {
        System.out.println("isNegative");
        String testNum = "";
        boolean expResult = false;
        boolean result = Helper.isNegative(testNum);
        assertEquals(expResult, result);
    }

    /**
     * Test of isNegativeOrZero method, of class Helper.
     */
    @Test
    public void testIsNegativeOrZero() {
        System.out.println("isNegativeOrZero");
        String testNum = "";
        boolean expResult = false;
        boolean result = Helper.isNegativeOrZero(testNum);
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
