package it.redevTech.seniorJavaTest.model;

import java.util.Arrays;

public class SumTwoElementsArrayEntity {

	private int result;
	
	private int[] numbersToSum;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int[] getNumbersToSum() {
		return numbersToSum;
	}

	public void setNumbersToSum(int[] numbersToSum) {
		this.numbersToSum = numbersToSum;
	}

	@Override
	public String toString() {
		return "SumTwoElementsArrayEntity [result=" + result + ", numbersToSum=" + Arrays.toString(numbersToSum) + "]";
	}
	
}
