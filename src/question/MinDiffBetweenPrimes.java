package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinDiffBetweenPrimes {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int T = in.nextInt();
			for (int t = 0; t < T; t++) {
				int n = in.nextInt();
				int[] array = new int[n];
				for (int i = 0; i < n; i++) {
					array[i] = in.nextInt();
				}
				System.out.println(getMinDiffBetweenPrimes(array));
			}
		}
	}

	/**
	 * Complexity: 1. ~n*sqrt(n) to select all primes 2. ~n*log(n) to sort
	 * primes 3. ~n to find the difference So, maximum is n*sqrt(n)
	 * 
	 * @return non-negative difference between primes, -1 in case if it is not
	 *         possible to calculate the difference.
	 */
	private static int getMinDiffBetweenPrimes(int[] array) {
		int minDiff = Integer.MAX_VALUE;
		List<Integer> primesAtArray = new ArrayList<>();
		for (int a : array) {
			if (isPrime(a)) {
				primesAtArray.add(a);
			}
		}
		if (primesAtArray.size() < 1) {
			return -1;
		}
		Collections.sort(primesAtArray);
		int diff;
		for (int i = 0; i < primesAtArray.size() - 1; i++) {
			diff = primesAtArray.get(i + 1) - primesAtArray.get(i);
			if (diff < minDiff) {
				minDiff = diff;
			}
		}
		return minDiff;
	}

	/**
	 * Complexity ~ sqrt(n)
	 * 
	 * @param n
	 * @return is parameter a prime number or not
	 */
	static boolean isPrime(int n) {
		if (n < 0) {
			n = -n;
		}

		if (n == 1) {
			return false;
		}

		if ((n >> 1) << 1 == n) {
			return false;
		}

		double sqrtN = Math.sqrt(n);
		for (int p = 3; p <= sqrtN; p += 2) {
			if (n % p == 0) {
				return false;
			}
		}

		return true;
	}
}