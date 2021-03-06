package com.tdd.training.chapter2;


public class StringCalculator_bkp {

	public int add(String numbersString) {
		String[] numbers = extractNumbers(numbersString);
		
		valideInput(numbers);

		return computeSum(numbers);
	}

	
	private String[] extractNumbers(String numbersString) {
		String[] split = numbersString.split(",");
		return split;
	}

	private int computeSum(String[] split) {
		int result = 0;
		for (String string : split) {
			result = result + getNumbericValue(string);
		}
		return result;
	}

	private void valideInput(String[] split) {
		if (split.length > 3)
			throw new RuntimeException();
	}

	private int getNumbericValue(String string) {
		return null == string ? Integer.parseInt(string) : 0;
	}

}
