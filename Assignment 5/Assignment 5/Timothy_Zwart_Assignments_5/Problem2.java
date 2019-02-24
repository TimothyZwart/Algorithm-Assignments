
public class Problem2 {
//Timothy Zwart Cmpt_435_11_18F
  
	public static int count(double[] A, double x)
	{
		// given sorted array A, and a value x, return the number of times x occurs in A
		// complete the method count() here
		// O(log n) expected
		// O(n) or slower will be graded out of 10 points
	  int midpoint =0;
	  int left =0;
	  int n = A.length;
    int right = n - 1;
    while (right >= left){
      midpoint = (left+right)/2;
      if( x > A[midpoint]){
        left = midpoint+1;
    }else{
        right = midpoint -1;
    }
	}
    int start = right;
    left = 0;
    right = A.length - 1;
    
      while(right>= left){
        midpoint = (left+right)/2;
        if(x >= A[midpoint]){
          left = midpoint +1;
        }else {
          right = midpoint-1;
      }
    }
	  int end = right;
	  return end - start;
	  
	  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test your count() method here
		
		double[] testarray = {1.3, 2.1, 2.1, 2.1, 2.1, 6.7, 7.5, 7.5, 8.6, 9.0};
		double t1 = 2.1;
		double t2 = 7.5;
		double t3 = 1.3;
		System.out.println(t1+" appears "+ count(testarray, t1) + " times");
		System.out.println(t2+" appears "+ count(testarray, t2) + " times");
		System.out.println(t3+" appears "+ count(testarray, t3) + " times");
		
		
	}

}
