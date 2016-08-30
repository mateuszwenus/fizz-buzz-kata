package com.github.mateuszwenus.fizz_buzz_kata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzParametrisedTest {

	private FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	@Parameters({ "0", "-1", "-10" })
	@TestCaseName("should throw exception for {0}")
	public void shouldThrowExceptionWhenNumberIsNotPositive(int number) {
		try {
			// when
			fizzBuzz.print(number);
			fail();
		} catch (IllegalArgumentException expected) {
			// then
		}
	}
	
	@Test
	@Parameters({ "1,1", "2,2", "5,Buzz", "10,Buzz", "15,FizzBuzz" })
	@TestCaseName("FizzBuzz({0}) = {1}")
	public void shouldPrintCorrectResult(int number, String expectedResult) {
		// when
		String result = fizzBuzz.print(number);
		// then
		assertThat(result, is(expectedResult));
	}
	
	@Test
	@Parameters({ "3", "6", "24" })
	@TestCaseName("should print Fizz for {0}")
	public void shouldPrintFizzIfNumberIsDivisableByThree(int number) {
		// when
		String result = fizzBuzz.print(number);
		// then
		assertThat(result, is("Fizz"));
	}
	
	@Test
	@Parameters({ "13", "31", "131" })
	@TestCaseName("should print Fizz for {0}")
	public void shouldPrintFizzIfNumberHasAThreeInIt(int number) {
		// when
		String result = fizzBuzz.print(number);
		// then
		assertThat(result, is("Fizz"));
	}
}
