package com.tonyn.java.examples.cucumber.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;

import com.tonyn.java.examples.BaseSpringIntegrationTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Step definitions for Calculator Cucumber Test
 * 
 * @author Tony Nguyen
 *
 */
public class CalculatorSteps extends BaseSpringIntegrationTest {
	
	@Autowired
	private Calculator calculator;
	
	private int result;
	
	@Given("^I have a Calculator$")
	public void i_have_a_Calculator() throws Throwable {
		assertThat(this.calculator).isNotNull();
	}

	@When("^I \"(.*?)\" (\\d+) .* (\\d+)$")
	public void i_operate(String op, int num1, int num2) throws Throwable {
		switch(op) {
			case "add":
				result = calculator.add(num1, num2);
				break;
			
			case "subtract":
				result = calculator.subtract(num1, num2);
				break;
			
			case "multiply":
				result = calculator.multiply(num1, num2);
				break;
			
			case "divide":
				result = calculator.divide(num1, num2);
				break;
			
			default:
				throw new Exception("Invalid operation: " + op);
		}
	}

	@Then("^the result should be (\\d+)$")
	public void the_result_should_be(int arg1) throws Throwable {
		assertThat(result).isEqualTo(arg1);
	}

}
