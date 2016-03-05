package com.tonyn.java.examples.cucumber.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.tonyn.java.examples.cucumber.calculator.CalculatorImpl;

public class CalculatorTest {

	private CalculatorImpl calculator;
	
	@Before
	public void setup() {
		calculator = new CalculatorImpl();
	}
	
	@Test
	public void test_add_2_and_3_should_get_5() {
		assertThat(calculator.add(2, 3)).isEqualTo(5);
	}
	
	@Test
	public void test_subtract_2_from_5_should_get_3() {
		assertThat(calculator.subtract(2, 5)).isEqualTo(3);
	}
	
	@Test
	public void test_multiply_2_by_5_should_get_10() {
		assertThat(calculator.multiply(2, 5)).isEqualTo(10);
	}
	
	@Test
	public void test_divide_10_by_5_should_get_2() {
		assertThat(calculator.divide(10, 5)).isEqualTo(2);
	}
}
