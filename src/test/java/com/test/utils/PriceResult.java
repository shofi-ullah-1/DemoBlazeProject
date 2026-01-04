package com.test.utils;


public class PriceResult {

	 // Stores first, second, and third values
	public final int first;
	public final int second;
	public final int third;

    // Constructor initializes values
	public PriceResult(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}

    // Controls how object prints in logs
	@Override
	public String toString() {
		return "1st=" + first + ", 2nd=" + second + ", 3rd=" + third;
	}

}
