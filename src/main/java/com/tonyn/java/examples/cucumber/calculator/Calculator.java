package com.tonyn.java.examples.cucumber.calculator;

/**
 * A Calculator with basic calculation operations
 * for Cucumber test demonstration
 * 
 * @author Tony Nguyen
 *
 */
public interface Calculator {
	
	int add(int num1, int num2);
	
	int subtract(int subtrahend, int minuend);
	
	int multiply(int multiplier, int multiplicand);
	
	int divide(int divisor, int dividend);

}
