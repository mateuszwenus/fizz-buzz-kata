package com.github.mateuszwenus.fizz_buzz_kata;

public class FizzBuzz {

	public String print(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("number must be positive");
		}
		boolean isFizz = number % 3 == 0;
		boolean isBuzz = number % 5 == 0;
		if (isFizz && isBuzz) {
			return "FizzBuzz";
		} else if (isFizz) {
			return "Fizz";
		} else if (isBuzz) {
			return "Buzz";
		}
		return String.valueOf(number);
	}
}
