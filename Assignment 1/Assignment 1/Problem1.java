
public class Problem1 {
	
/*Timtohy Zwart CMPT_435L_111_18F 9/7/2018 */

	public static void rearrange(int[] A)
	{
		/*
		Input: an array, A, of n sorted integers (positive, negative, or 0) that 
		A[0] <= A[1] <= A[2] <=…A[n-2] <= A[n-1]
	
		Output: re-arrange elements in A such that: 
		Element at even position (i.e., A[0], A[2]) are less than or equal to both of its neighbors
		Element at odd position (i.e., A[1], A[3]) are greater than or equal to both of its neighbors
	
		A[0] <= A[1] >= A[2] <= A[3] >= A[4] <= A[5]…
	
		Design an algorithm that solves this problem.
		 */
		
		//Complete this method
		

		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your rearrange method
		
		int[] A = {13, 20, 45, 69, 78, 100, 127, 155};
		
		System.out.println("Before:");
		
		for(int i=0; i < A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
		
		rearrange(A);
		
		System.out.println("\nAfter:");
		
		for(int i=0; i < A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
		
		
		
	}



}
