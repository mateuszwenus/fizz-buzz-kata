package com.github.mateuszwenus.fizz_buzz_kata;

public class FizzBuzz {

	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";
	public static final String FIZZBUZZ = FIZZ + BUZZ; 

	public String print(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("number must be positive");
		}
		String numberStr = String.valueOf(number);
		boolean isFizz = number % 3 == 0 || numberStr.contains("3");
		boolean isBuzz = number % 5 == 0 || numberStr.contains("5");
		if (isFizz && isBuzz) {
			return FIZZBUZZ;
		} else if (isFizz) {
			return FIZZ;
		} else if (isBuzz) {
			return BUZZ;
		}
		return numberStr;
	}
}
