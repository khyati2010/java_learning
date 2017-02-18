package ques;
//This is a java program to find kth smallest element form the randomly generated sequence using partitioning
import java.util.Random;
import java.util.Scanner;
 
public class Kth_Smallest_Partitioning 
{
	
	/*. Pick an element within current segment
	   and call it the pivot
	 
	2. Count elements that are smaller and
	   elements that are larger than the pivot
	 
	3. If number of elements smaller than the pivot
	   is larger than K, then move those elements
	   to the beginning of the array and run
	   the algorithm recursively only on that part of the array.
	 
	4. Otherwise, if number of elements smaller than the pivot
	   plus number of elements equal to the pivot is larger
	   than K, then Kth element is equal to pivot
	   so just return the pivot and finish.
	 
	5. Otherwise, move all elements larger than the pivot
	   to the beginning of the array and run the algorithm
	   recursively only on that part of the array.*/

	   
/*	Select(A,n,i):
	    Divide input into ⌈n/5⌉ groups of size 5.

	     Partition on median-of-medians 
	    medians = array of each group’s median.
	    pivot = Select(medians, ⌈n/5⌉, ⌈n/10⌉)
	    Left Array L and Right Array G = partition(A, pivot)

	     Find ith element in L, pivot, or G 
	    k = |L| + 1
	    If i = k, return pivot
	    If i < k, return Select(L, k-1, i)
	    If i > k, return Select(G, n-k, i-k)*/
	
    public static int N = 20;
    public static int[] A = new int[N];
 
    public static void swap(int dex1, int dex2) 
    {
        int temp = A[dex1];
        A[dex1] = A[dex2];
        A[dex2] = temp;
    }
 
    public static int partition(int start, int end) 
    {
        int i = start + 1;
        int j = i;
        int pivot = start;
        for (; i < end; i++) 
        {
            if (A[i] < A[pivot]) 
            {
                swap(i, j);
                j++;
            }
        }
        if (j <= end)
            swap(pivot, (j - 1));
 
        return j - 1;
    }
 
    public static void quick_sort(int start, int end, int K) {
        int part;
        if (start < end) 
        {
            part = partition(start, end);
            if (part == K - 1)
                System.out.println("kth smallest element : " + A[part]);
            if (part > K - 1)
                quick_sort(start, part, K);
            else
                quick_sort(part + 1, end, K);
        }
        return;
    }
 
    public static void main(String args[]) 
    {
        Random random = new Random();
        for (int i = 0; i < N; i++)
            A[i] = random.nextInt(1000);
 
        System.out.println("The original sequence is:  ");
        for (int i = 0; i < N; i++)
            System.out.print(A[i] + " ");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Kth smallest you want to find: ");
        int k = sc.nextInt();
 
        quick_sort(0, N, k);
        sc.close();
    }
}