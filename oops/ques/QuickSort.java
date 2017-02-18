package ques;

import java.util.List;

public class QuickSort {

	
	 public static int kthElInUnsortedList(List<Integer> list, int k)
	    {
	        if (list.count == 1)
	            return list[0];

	        List<Integer> left = new List<Integer>();
	        List<Integer> right = new List<Integer>();

	        int pivotIndex = list.Count / 2;
	        int pivot = list[pivotIndex]; //arbitrary

	        for (int i = 0; i < list.Count && i != pivotIndex; i++)
	        {
	            int currentEl = list[i];
	            if (currentEl < pivot)
	                left.add(currentEl);
	            else
	                right.add(currentEl);
	        }

	        if (k == left.Count + 1)
	            return pivot;

	        if (left.Count < k)
	            return kthElInUnsortedList(right, k - left.Count - 1);
	        else
	            return kthElInUnsortedList(left, k);
	    }
	
}
