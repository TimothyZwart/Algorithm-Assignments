
public class Problem1 {
	


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
	  
	  //start from A[1] and loop until getting to last element then go to next odd element
		for(int i = 1; i < A.length-1; i=i+2){
		  
		  //Set odd spot equal to temporary value, then set odd spot to even spot one infront and then set even spot equal to temp
		int temp = A[i];
		
		A[i]= A[i+1];
		
		A[i+1]= temp;
		
		}
		
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
