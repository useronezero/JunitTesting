package simplecalculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kisho
 */
public class SimpleCalculatorJUnitTest {
    
    SimpleCalculator calculate;
    public SimpleCalculatorJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     calculate = new SimpleCalculator();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testingAdditionWithTwoPositiveNumbers() {
        assertEquals(5.3, calculate.add(5.0, 0.3), 0.001);
    }
    @Test
    public void testingAdditionWithOneNegativeNumberAndOnePositiveNumber() {
        assertEquals(-2.3, calculate.add(-7.3,5), 0.001);
     }
    @Test
    public void testingAdditionWithOnePositiveNumberAndOneNegativeNumber() {
        assertEquals(2.3, calculate.add(7.3,-5.0), 0.001);
    }
    @Test
    public void testingAdditionWithTwoNegativeNumbers() {
        assertEquals(-12.3, calculate.add(-5,-7.3), 0.001);
    }
    @Test
    public void testingAdditionWithZeroAndNumber() {
        assertEquals(-7.3, calculate.add(0, -7.3), 0.001);
    }
    @Test
    public void testingMultiplicationWithTwoPositiveNumbers() {
        assertEquals(15.33, calculate.multiply(2.1,7.3), 0.001);
    }
    @Test
    public void testingMultiplicationWithTOneNegativeNumberAndOnePositiveNumber() {
        assertEquals(-15.33, calculate.multiply(-2.1,7.3), 0.001);
    }
    @Test
    public void testingMultiplicationWithTwoNegativeNumbers() {
        assertEquals(15.33, calculate.multiply(-2.1,-7.3), 0.001);
    }
    @Test
    public void testingMultiplicationWithOnePositiveNumberAndOneNegativeNumber() {
        assertEquals(-15.33, calculate.multiply(2.1,-7.3), 0.001);
    }
    @Test
    public void testingMultiplicationWithZeroAndNumber() {
        assertEquals(0.0, calculate.multiply(2.1,0.0), 0.001);
    }
    @Test
    public void testingSubstractionWithTwoPositiveNumbers() {
        assertEquals(-5.2, calculate.subtract(2.1,7.3), 0.001);
    }
    @Test
    public void testingSubstractionWithTOneNegativeNumberAndOnePositiveNumber() {
        assertEquals(-9.4, calculate.subtract(-2.1,7.3), 0.001);
    }
    @Test
    public void testingSubstractionWithTwoNegativeNumbers() {
        assertEquals(5.2, calculate.subtract(-2.1,-7.3), 0.001);
    }
    @Test
    public void testingSubstractionWithOnePositiveNumberAndOneNegativeNumber() {
        assertEquals(9.4, calculate.subtract(2.1,-7.3), 0.001);
    }
    @Test
    public void testingSubstractionWithZeroAndNumber() {
        assertEquals(2.1, calculate.subtract(2.1,0.0), 0.001);
    }
    @Test
    public void testingDivisionWithTwoPositiveNumbers() {
        assertEquals(1.711,calculate.divide(10.1,5.9), 0.001);
    }
    @Test
    public void testingDivisionWithTOneNegativeNumberAndOnePositiveNumber() {
        assertEquals(-2, calculate.divide(-13.2,6.6), 0.001);
    }
    @Test
    public void testingDivisionWithTwoNegativeNumbers() {
        assertEquals(2, calculate.divide(-13.2,-6.6), 0.001);
    }
    @Test
    public void testingDivisionWithOnePositiveNumberAndOneNegativeNumber() {
        assertEquals(-2, calculate.divide(13.2,-6.6), 0.001);
    }
    @Test
    public void testingDivisionWithZeroAndNumber() {
        assertEquals(0, calculate.divide(2.1,0.0), 0.001);
    }
    @Test
    public void testingDivisionWithNumberAndZero(){
        assertEquals(0, calculate.divide(0.0,2.5), 0.001);
    }
}
