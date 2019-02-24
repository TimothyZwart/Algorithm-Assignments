import java.util.Arrays;


//Timothy_Zwart_CMPT_435
public class Problem2 {



	public static int recursivearray(int A[], int i)
	{
		// Complete this method to create a new array B[]
		// B[0] = A[0]
		// B[1] = A[0] * A[1]
		// B[2] = A[0] * A[1] * A[2]
		// ...
		// B[i] = A[0] * A[1] *...* A[i]
		// Feel free to add more parameters to this method
		// A recursive method is expected
		// A non-recursive method will be scored out of 10 points
	  
	  
	  //if there is only one value in the array do not loop; and just return the value
		if(i==0){
		  return (A[i]);
		}else{
		  
		  //if there is more than one value in the array multiply current value by the last value.
		  //and continue until finished
		  return (A[i] * recursivearray(A, i-1));
		}
		
		
	
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method
		int[] givenarray = {1, 2, 3, 4, 5, 6};	
		int[] outputarray = new int[givenarray.length];
		
	for(int i = 0; i < givenarray.length; i++ ){
		  outputarray[i]=recursivearray(givenarray,i);
		}
		// Add statements here to invoke the recursivearray method
		
		
		
		// Test your method
		System.out.println("B "+ Arrays.toString(outputarray));
		// Your method should return {1, 2, 6, 24, 120, 720}
		
		
		
	}
}