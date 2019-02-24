public class Problem4 {
	
	
	//Timothy Zwart CMPT_435_Assignment 8
	
	public static boolean checksum(double[] s1, double[] s2, double x)
	{
		// complete the checksum() method to find out
		// if there exists a number from s1, and a number from s2, both s1 and s2 are sorted already,
		// such that, their sum is exactly x
		// algorithm O(n) expected
		// algorithm O(nlogn) or slower will be scored out of 10 points
	  int n = s2.length;
	  int m = s1.length;
	  int l =0;
	  int r = n-1;
	  
	  while(l < m && r >=0){
	    //check for the case where equal

	    if((s1[l]+s2[r]) == x){
	      return true;//return result 1
	    }
	    //check if less then
	    else if((s1[l] + s2[r]) < x){
	      l++; //move left pointer right
	    }
	    //result if greater than
	    else{
	      r--; //move right pointer left
	    }
	  }
    return false; //return result 2
	  
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Test your checksum() method here
		double[] testarray1 = {1, 10, 45};
		double[] testarray2 = {-8, 4, 6};
		double target1 = 16;
		double target2 = 70;
		
		System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ target1 + "?");
		System.out.println(checksum(testarray1,testarray2, target1));
		// should print true
		
		System.out.println("Does there exist a number from testarray1, and a number from testarray2, and their sum is "+ target2 + "?");
		System.out.println(checksum(testarray1,testarray2, target2));
		// should print false
		
	}

}
