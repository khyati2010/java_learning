package prog;

public class SpiralPattern {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 }, { 19, 20, 21, 22, 23, 24 },
				{ 25, 26, 27, 28, 29, 30 }, { 31, 32, 33, 34, 35, 36 } };

		int startRow = 0;
		int col = arr[0].length;

		SpiralPrint(arr, startRow, col);

	}

	private static void SpiralPrint(int[][] arr, int startRow, int col) {
		int i, j;
		for (i = startRow; i < arr.length; i++) {
			for (j = 0; j < col; j++) {
				if (j == col - 1 || i == startRow)
					System.out.print(arr[i][j] + "\t");
				else
					System.out.print("\t");
			}
			System.out.print("\n");
		}

		if (startRow < arr.length)
			SpiralPrint(arr, startRow + 1, col - 1);

	}
	
	

}