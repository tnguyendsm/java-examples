package com.tonyn.java.examples;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tonyn.java.examples.AppSpringConfig;
import com.tonyn.java.examples.cucumber.calculator.Calculator;

/**
 * Base Spring Integration Configuration
 * 
 * @author Tony
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppSpringConfig.class)
public class BaseSpringIntegrationTest {
	
	@Autowired
	private Calculator calculator;
	
	@Test
	public void testSpringConfig() {
		assertThat(this.calculator).isNotNull();
		System.out.println("Spring Config success!");
	}
}
