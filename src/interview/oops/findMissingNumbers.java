package interview.oops;

import java.util.Arrays;

public class findMissingNumbers {
	private static void findMissingNumbers() {
	
	int[] inputArray = {1,4,0,3,2, 7, 8, 6};
	Arrays.sort(inputArray);
	int min = inputArray[0];
	System.out.println("min"+min);
	int max = inputArray[inputArray.length-1];
	System.out.println("max"+max);
	int initialValue = min;
	System.out.println("The Missing number is :");
	for(int i=initialValue;initialValue<max;){
	i++;
	boolean isAval = false;
	for(int j=0;j<inputArray.length;j++){
	if(inputArray[j]==i){
	isAval = true;
	}
	}
	if(!isAval){
	System.out.println(i);
	}
	initialValue++;
	}
	}
}
