public class Problem2 {

	
	
	public static boolean majority(int[] A)
	{
    
		/*
		Input: an array A of n integers (positive, negative, or 0), elements sorted in ascending order.
		Output: if there exists a majority element.
		An element is a majority if it appears more than n/2 times. For example, if the input list is: 
		{0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 7}
		The output should be true, as 0 appears 6 times (>n/2 = 11/2 times).
		However, if the input list is:
		{0, 0, 0, 1, 1, 2, 3, 10, 10}
		The majority element does not exist.
		Design an algorithm that solves this problem.
		*/
		
		// Complete this method
	  //Set Counter equal to 0, then set the majority number as the first value
	  int count=0;
	  int majority=A[0];
	  
	  //Itereate through and add onto counter for each time a number appears if the counter equals zero replace number with the current number
		for(int i=0; i< A.length;i++){
		  if(majority == A[i]){
		    count++;
		  }else{
		    count--;
		    if (count==0){
		      majority=A[i];
		    }
		  }
		}
		count =0;
		//Check that final major number was actually majority
		//count up how many times the final majority result appear; if it appears more than n/2 times it is the majority
		for(int i=0; i< A.length;i++){
		  if (majority==A[i]){
		    count++;
		  }
		}
		if(count > A.length/2){
		  return true;
		}else{
		  return false;
		}
		
	
	  
	  
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test your majority method
		
		int[] testarray1 = {0, 0, 0, 0, 0, 0, 1, 1, 2, 4, 7};
		
		int[] testarray2 = {0, 0, 0, 1, 1, 2, 3, 10, 10};
		
		
		System.out.println("Does there exist a majoirty element in testarray1? "+ majority(testarray1));
		System.out.println("Does there exist a majoirty element in testarray2? "+ majority(testarray2));
		
	}

}
