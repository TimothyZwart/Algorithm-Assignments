
//Timothy_Zwart_CMPT_435

public class Problem1 {

  public static String charArrayToString(char[] array, int startIndex, int lastIndex) {
    return new String(array, startIndex, lastIndex - startIndex + 1);
  // This method converts elements at index from startIndex to lastIndex in a char array into a string
}


public static void where(char[] A, String s,int startIndex, int[] result)
{
  // Complete this method to find the rightmost occurence of a string in an array
  // Feel free to add more parameters to this method
  // A recursive methd is expected. A non-recursive method will be scored out of 10 points.

  
  //BaseCase:length of string plus where you are in the array must be less than the array otherwise just return -1
  //Unless a working case is found previously
  if(startIndex+s.length() < A.length){
  int lastIndex = startIndex + s.length()-1;
  //check if array is the same as string
    String array = charArrayToString(A,startIndex,lastIndex);
    //if result found make the result equalt to the start of that index
    if(s.equals(array)){
      result[0] = startIndex;
    }
    //Recursive increase
    where(A,s,startIndex+1, result);
 }
  

}


public static void main(String[] args) {
  // TODO Auto-generated method
  char[] givenarray = {'a', 'm', 'a', 'r', 'i', 's', 't', 'm', 'a', 'r', 'i', 's', 't', 'v', 'h', 'e'}; 
  
  // Test your method
  int r[] = {-1};
  where(givenarray, "marist",0, r);
  //print array value for index value
  System.out.println("The rightmost occurence of 'marist' in the given array is at index "+ r[0]);
  // Your method should return 7
}
}