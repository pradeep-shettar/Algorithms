/**
 * 
 */
package com.shettar20.main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shettar20
 *
 */
public class FibonacciWithRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int count = 10;
		List<Integer> series = new ArrayList<Integer>();
		if (count == 1) {
			series.add(1);
		} else if (count == 2) {
			series.add(1);
			series.add(1);
		} else if (count > 2) {
			series.add(1);
			series.add(1);
			series = fibonacci(series, count, 2);
		}
		System.out.println(series.toString());
	}

	private static List<Integer> fibonacci(List<Integer> series, int count, int updatedCount) {
		if (updatedCount == count) {
			return series;
		} else {
			Integer sum = series.get(series.size() - 1) + series.get(series.size() - 2);
			series.add(sum);
			return fibonacci(series, count, updatedCount + 1);
		}
	}

}
