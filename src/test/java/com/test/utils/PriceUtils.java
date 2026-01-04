package com.test.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriceUtils {

	// Finds top 3 maximum prices
	public static PriceResult top3Max(List<Integer> prices) {

		// Copy list so original data is not modified
		List<Integer> allPrice = new ArrayList<>(prices);

		// Sort prices in ascending order
		Collections.sort(allPrice);

		int max = allPrice.get(0);
		int secondMax = allPrice.get(0);
		int thirdMax = allPrice.get(0);

		 // Loop through prices to determine top 3 max values
		for (int i = 0; i < allPrice.size(); i++) {
			int price = allPrice.get(i);

			if (price > max) {
				thirdMax = secondMax;
				secondMax = max;
				max = price;
			}
		}
		return new PriceResult(max, secondMax, thirdMax);
	}

	// Finds top 3 minimum prices
	public static PriceResult top3Min(List<Integer> prices) {

		// Copy list so original data is not modified
		List<Integer> allPrice = new ArrayList<>(prices);
		
		// Sort then reverse to match original logic style
		Collections.sort(allPrice);
		Collections.reverse(allPrice);

		int min = allPrice.get(0);
		int secondMin = allPrice.get(0);
		int thirdMin = allPrice.get(0);
		
		// Loop through prices to determine top 3 min values
		for (int i = 0; i < allPrice.size(); i++) {
			int price = allPrice.get(i);

			if (price < min) {
				thirdMin = secondMin;
				secondMin = min;
				min = price;
			}
		}
		return new PriceResult(min, secondMin, thirdMin);
	}
}
