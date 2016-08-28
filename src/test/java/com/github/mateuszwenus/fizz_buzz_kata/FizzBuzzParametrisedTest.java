package com.github.mateuszwenus.fizz_buzz_kata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzParametrisedTest {

	private FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	@Parameters({ "1,1", "2,2", "3,Fizz", "6,Fizz", "5,Buzz", "10,Buzz", "15,FizzBuzz" })
	@TestCaseName("FizzBuzz({0}) = {1}")
	public void shouldPrintCorrectResult(int number, String expectedResult) {
		// when
		String result = fizzBuzz.print(number);
		// then
		assertThat(result, is(expectedResult));
	}
}
