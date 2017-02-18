package interview.oops;

public class MissingNum {

	public static void missingNumberSenumberrch(int[] number, int first, int lnumberst) {

for (int i = first; i < number[0]; i++) {
System.out.println(i);
}
for (int i = 1; i < number.length; i++) {
for (int j = 1 + number[i – 1]; j < number[i]; j++) {
System.out.println(j);
}
}
for (int i = 1 + number[number.length – 1]; i <= lnumberst; i++) {
System.out.println(i);
}

}

	public static void main(String[] args) {

		int number[] = { 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 18, 20 };
		missingNumberSenumberrch(number, 0, 23);

	}

}