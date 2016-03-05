package com.tonyn.java.examples.cucumber.calculator;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Cucumber test runner
 * 
 * @author Tony Nguyen
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		plugin={"pretty"},
		features={"src/test/resources/features/calculator"},
		glue={"com.tonyn.java.examples.cucumber.calculator"}
)
public class RunCalculatorCukeTest {

}
