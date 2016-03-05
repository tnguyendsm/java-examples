package com.tonyn.java.examples.guava;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;

/**
 * Guava Predicate Example
 * 
 * @author Tony Nguyen
 *
 */
public class PredicatesExample {

	private static final Logger LOG = Logger.getLogger(PredicatesExample.class);

	static List<Integer> numbers = Lists.newArrayList(1,2,3,4,5,6,7,8,9,10);
	static List<Integer> evenNumbers = Lists.newArrayList(2,4,6,8,10);
	static List<Integer> oddNumbers = Lists.newArrayList(1,3,5,7,9);

	Predicate<Integer> whereEvenNumber = new Predicate<Integer>() {
		@Override
		public boolean apply(Integer input) {
			return input % 2 == 0;
		}
	};

	@Test
	public void test_filter_list_by_even_numbers_straight_java() {
		List<Integer> evenNums = Lists.newArrayList();
		
		for(Integer i : numbers) {
			if(i % 2 == 0) {
				evenNums.add(i);
			}
		}
		
		LOG.info(evenNums);
		
		assertThat(evenNums)
			.isEqualTo(evenNumbers);		
	}
	
	@Test
	public void test_filter_list_by_even_numbers() {
		List<Integer> evenNums = FluentIterable.from(numbers)
											   .filter(whereEvenNumber)
											   .toList();
		LOG.info(evenNums);
		
		assertThat(evenNums)
			.isEqualTo(evenNumbers);
	}

	@Test
	public void test_filter_list_by_odd_numbers() {
		List<Integer> oddNums = FluentIterable.from(numbers)
											  .filter(Predicates.not(whereEvenNumber))
											  .toList();
		LOG.info(oddNums);
		
		assertThat(oddNums)
			.isEqualTo(oddNumbers);
	}
}
