package com.tonyn.java.examples.cucumber.calculator;

import org.springframework.stereotype.Component;

/**
 * Implementation class for the {@link Calculator} interface
 * 
 * @author Tony Nguyen
 *
 */
@Component
public class CalculatorImpl implements Calculator {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	@Override
	public int subtract(int subtrahend, int minuend) {
		return minuend - subtrahend;
	}
	
	@Override
	public int multiply(int multiplier, int multiplicand) {
		return multiplier * multiplicand;
	}
	
	@Override
	public int divide(int divisor, int dividend) {
		return divisor / dividend;
	}
}
