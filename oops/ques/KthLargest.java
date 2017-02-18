package ques;

import java.util.Arrays;

public class KthLargest {

	public static void kLargest2(int[] array, int k) {

		int minIndex = 0, i; // Find Min

		for (i = k; i < array.length; i++) {
			minIndex = 0;
			for (int j = 0; j < k; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
					array[minIndex] = array[j];
				}
			}
			if (array[minIndex] < array[i]) { // Swap item if min < array[i]

				int temp = array[minIndex];
				array[minIndex] = array[i];
				array[i] = temp;
			}
		}
		for (int q = 0; q < k; q++) { // Print output
			System.out.print(array[q] + " ");
		}
	}

	public static void kLargest(int[] array, int k) {
		Arrays.sort(array);
		for (int i = array.length - k; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
