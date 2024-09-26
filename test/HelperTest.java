/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

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
     * Test of validatePositiveArray method, of class Helper.
     */
    @Test
    public void testValidatePositiveArray() {
        System.out.println("validatePositiveArray");
        int[] array = {3, 6, 5};
        int n = 3;
        boolean expResult = true;
        boolean result = Helper.validatePositiveArray(array, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of isInRange method, of class Helper.
     */
    @Test
    public void testIsInRange() {
        System.out.println("isInRange");
        int n = 5;
        int low = 3;
        int high = 7;
        boolean expResult = true;
        boolean result = Helper.isInRange(n, low, high);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of isPalindrome method, of class Helper.
     */
    @Test
    public void testIsPalindrome() {
        System.out.println("isPalindrome");
        String text = "abbc";
        boolean expResult = false;
        boolean result = Helper.isPalindrome(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
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
        double amount = 0.0;
        double yearlyInterestRate = 0.0;
        int numYears = 0;
        double expResult = 0.0;
        double result = Helper.monthlyPayment(amount, yearlyInterestRate, numYears);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        amount = 200000;
        yearlyInterestRate = 6;
        numYears = 15;
        expResult = 1687.71;
        result = Helper.monthlyPayment(amount, yearlyInterestRate, numYears);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of validateUserInput method, of class Helper.
     */
    @Test
    public void testValidateUserInput() {
        System.out.println("validateUserInput");
        boolean expResult = false;
        boolean result = Helper.validateUserInput();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertAnnualToMonthly method, of class Helper.
     */
    @Test
    public void testConvertAnnualToMonthly() {
        System.out.println("convertAnnualToMonthly");
        double yearlyInterestRate = 0.0;
        double expResult = 0.0;
        double result = Helper.convertAnnualToMonthly(yearlyInterestRate);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
