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
 *The Job of this class is to Test multiple configuration of inputs
 * to different methods and Check weather they word with every successive 
 * modification to the code.
 * @author kishore
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
    /**
     * The job of this method is to setup any objects/variables needed by Each Test Method 
     * during its execution.
     * It has a "@Before" Tag.
     */
    @Before
    public void setUp() {
     calculate = new SimpleCalculator();
    }
    /**
     * The job of this method is to teardown/Destroy all objects/variables after execution of the 
     * of Each Test Method.
     * It has a "@After" Tag.
     */
    @After
    public void tearDown() {
    }
    /**
     * The Test Method to Test Addition of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingAdditionWithTwoPositiveNumbers() {
        assertEquals(5.3, calculate.add(5.0, 0.3), 0.001);
    }
    /**
     * The Test Method to Test Addition of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingAdditionWithOneNegativeNumberAndOnePositiveNumber() {
        assertEquals(-2.3, calculate.add(-7.3,5), 0.001);
     }
    /**
     * The Test Method to Test Addition of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingAdditionWithOnePositiveNumberAndOneNegativeNumber() {
        assertEquals(2.3, calculate.add(7.3,-5.0), 0.001);
    }
    /**
     * The Test Method to Test Addition of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingAdditionWithTwoNegativeNumbers() {
        assertEquals(-12.3, calculate.add(-5,-7.3), 0.001);
    }
    /**
     * The Test Method to Test Addition of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingAdditionWithZeroAndNumber() {
        assertEquals(-7.3, calculate.add(0, -7.3), 0.001);
    }
    /**
     * The Test Method to Test Multiplication of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingMultiplicationWithTwoPositiveNumbers() {
        assertEquals(15.33, calculate.multiply(2.1,7.3), 0.001);
    }
    /**
     * The Test Method to Test Multiplication of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingMultiplicationWithTOneNegativeNumberAndOnePositiveNumber() {
        assertEquals(-15.33, calculate.multiply(-2.1,7.3), 0.001);
    }
    /**
     * The Test Method to Test Multiplication of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingMultiplicationWithTwoNegativeNumbers() {
        assertEquals(15.33, calculate.multiply(-2.1,-7.3), 0.001);
    }
    /**
     * The Test Method to Test Multiplication of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingMultiplicationWithOnePositiveNumberAndOneNegativeNumber() {
        assertEquals(-15.33, calculate.multiply(2.1,-7.3), 0.001);
    }
    /**
     * The Test Method to Test Multiplication of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingMultiplicationWithZeroAndNumber() {
        assertEquals(0.0, calculate.multiply(2.1,0.0), 0.001);
    }
    /**
     * The Test Method to Test Subtraction of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingSubstractionWithTwoPositiveNumbers() {
        assertEquals(-5.2, calculate.subtract(2.1,7.3), 0.001);
    }
    /**
     * The Test Method to Test Subtraction of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingSubstractionWithTOneNegativeNumberAndOnePositiveNumber() {
        assertEquals(-9.4, calculate.subtract(-2.1,7.3), 0.001);
    }
    /**
     * The Test Method to Test Subtraction of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingSubstractionWithTwoNegativeNumbers() {
        assertEquals(5.2, calculate.subtract(-2.1,-7.3), 0.001);
    }
    /**
     * The Test Method to Test Subtraction of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingSubstractionWithOnePositiveNumberAndOneNegativeNumber() {
        assertEquals(9.4, calculate.subtract(2.1,-7.3), 0.001);
    }
    /**
     * The Test Method to Test Subtraction of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingSubstractionWithZeroAndNumber() {
        assertEquals(2.1, calculate.subtract(2.1,0.0), 0.001);
    }
    /**
     * The Test Method to Test Division of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingDivisionWithTwoPositiveNumbers() {
        assertEquals(1.711,calculate.divide(10.1,5.9), 0.001);
    }
    /**
     * The Test Method to Test Division of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingDivisionWithTOneNegativeNumberAndOnePositiveNumber() {
        assertEquals(-2, calculate.divide(-13.2,6.6), 0.001);
    }
    /**
     * The Test Method to Test Division of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingDivisionWithTwoNegativeNumbers() {
        assertEquals(2, calculate.divide(-13.2,-6.6), 0.001);
    }
    /**
     * The Test Method to Test Division of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingDivisionWithOnePositiveNumberAndOneNegativeNumber() {
        assertEquals(-2, calculate.divide(13.2,-6.6), 0.001);
    }
    /**
     * The Test Method to Test Division of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingDivisionWithZeroAndNumber() {
        assertEquals(0, calculate.divide(2.1,0.0), 0.001);
    }
    /**
     * The Test Method to Test Division of two numbers in the main file where the code exists
     * and check if the answer is  equal to the expected answer.
     * It has a "@Test" Tag.
     */
    @Test
    public void testingDivisionWithNumberAndZero(){
        assertEquals(0, calculate.divide(0.0,2.5), 0.001);
    }
}
