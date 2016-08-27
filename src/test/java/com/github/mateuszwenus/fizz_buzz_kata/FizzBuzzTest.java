package com.github.mateuszwenus.fizz_buzz_kata;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void shouldPrintOneForOne() {
		// when
		String result = fizzBuzz.print(1);
		// then
		assertThat(result, is("1"));
	}
	
	@Test
	public void shouldTwoForTwo() {
		// when
		String result = fizzBuzz.print(2);
		// then
		assertThat(result, is("2"));
	}
	
	@Test
	public void shouldPrintFizzForThree() {
		// when
		String result = fizzBuzz.print(3);
		// then
		assertThat(result, is("Fizz"));
	}
	
	@Test
	public void shouldPrintFizzForMultipleOfThree() {
		// when
		String result = fizzBuzz.print(6);
		// then
		assertThat(result, is("Fizz"));
	}
	
	@Test
	public void shouldPrintBuzzForFive() {
		// when
		String result = fizzBuzz.print(5);
		// then
		assertThat(result, is("Buzz"));
	}
	
	@Test
	public void shouldPrintBuzzForMultipleOfFive() {
		// when
		String result = fizzBuzz.print(10);
		// then
		assertThat(result, is("Buzz"));
	}
	
	@Test
	public void shouldPrintFizzBuzzForMultipleOfThreeAndFive() {
		// when
		String result = fizzBuzz.print(15);
		// then
		assertThat(result, is("FizzBuzz"));
	}
}
