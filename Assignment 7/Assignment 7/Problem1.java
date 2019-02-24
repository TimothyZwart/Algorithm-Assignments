public class Problem1 {

	
	public static String charArrayToString(char[] array, int startIndex, int lastIndex) {
	    return new String(array, startIndex, lastIndex - startIndex + 1);
		// This method converts elements at index from startIndex to lastIndex in a char array into a string
	}
	
	
	public static int where(char[] A, String s)
	{
		// Complete this method to find the rightmost occurence of a string in an array
		// Feel free to add more parameters to this method
		// A recursive methd is expected. A non-recursive method will be scored out of 10 points.
		 


	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method
		char[] givenarray = {'a', 'm', 'a', 'r', 'i', 's', 't', 'm', 'a', 'r', 'i', 's', 't', 'v', 'h', 'e'};	
		
		// Test your method
		System.out.println("The rightmost occurence of 'marist' in the given array is at index "+ where(givenarray, "marist"));
		// Your method should return 7
		
		
		
	}
}