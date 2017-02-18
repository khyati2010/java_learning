package interview.oops;

public class MissingNo {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12 };

		int k = missing(a, 0, a.length);
		System.out.println(k);
	}

	public static int missing(int[] a, int f, int l) {

		int mid = (l + f) / 2;

		// if first index reached last then no element found
		if (a.length - 1 == f) {
			System.out.println("missing not find ");
			return 0;
		}

		// if mid with first found
		if (mid == f) {
			System.out.println(a[mid] + 1);
			return a[mid] + 1;
		}

		if ((mid + 1) == a[mid])
			return missing(a, mid, l);
		else
			return missing(a, f, mid);

	}

	public int getMissingNumber(int[] sortedArray) {
		int missingNumber = 0;
		int missingNumberIndex = 0;
		for (int i = 0; i < sortedArray.length; i++) {
			if (sortedArray[i] == 0) {
				missingNumber = (sortedArray[i + 1]) - 1;
				missingNumberIndex = i;
				System.out.println("missingNumberIndex: " + missingNumberIndex);
				break;
			}
		}
		return missingNumber;
	}

	public int execute2(int[] array) {
		int diff = Math.min(array[1] - array[0], array[2] - array[1]);
		int min = 0, max = arr.length - 1;
		boolean missingNum = true;
		while (min < max) {
			int mid = (min + max) >>> 1;
			int leftDiff = array[mid] - array[min];
			if (leftDiff > diff * (mid - min)) {
				if (mid - min == 1)
					return (array[mid] + array[min]) / 2;
				max = mid;
				missingNum = false;
				continue;
			}
			int rightDiff = array[max] - array[mid];
			if (rightDiff > diff * (max - mid)) {
				if (max - mid == 1)
					return (array[max] + array[mid]) / 2;
				min = mid;
				missingNum = false;
				continue;
			}
			if (missingNum)
				break;
		}
		return -1;
	}

}