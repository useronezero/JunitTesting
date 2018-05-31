/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

/**
 *The class Implements basic functions of a Simple calculator
 * with the help of some methods.
 * It can be used to perform Addition, Multiplication, Division And Subtraction.
 * @author kishore
 */

public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    /**
     * The method Takes two numbers as input and performs addition on them.
     * @param num1 The first number to be added(Augend).
     * @param num2 The second number to be added(Addend).
     * @return It return Sum of the two input numbers.
     */
    double add(double num1, double num2) {
        return (num1+num2);
    }
    /**
     * The method Takes two numbers as input and performs Multiplication on them.
     * @param num1 The first number to be Multiplied(Multiplicand).
     * @param num2 The second number to be Multiplied(Multiplier).
     * @return It return Product of the two input numbers.
     */
    double multiply(double num1, double num2) {
        return (num1*num2);
    }
    /**
     * The method Takes two numbers as input and performs Subtraction on them.
     * @param num1 The first number to be Subtracted(Minuend).
     * @param num2 The second number to be Subtracted(Subtrahend).
     * @return It return Difference of the two input numbers.
     */
    double subtract(double num1, double num2) {
        return (num1-num2);
    }
    /**
     * The method Takes two numbers as input and performs Division on them.
     * It also has a if condition to make sure Neither Dividend nor Divisor are Zero.
     * If Any or Both Dividend and Divisor are Zero then The method will return a Zero.
     * @param num1 The first number to be Divided(Dividend).
     * @param num2 The second number to be Divided(Divisor).
     * @return It return Quotient of the two input numbers.
     */
    double divide(double num1, double num2) {
        if(num1!=0.0 && num2!=0.0)
            return (num1/num2);
        else
            return 0;
            
    }
    
}
