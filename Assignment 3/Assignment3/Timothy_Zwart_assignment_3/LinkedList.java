//Timothy Zwart Cmpt_435_11_18F
public class LinkedList {
	

	// The LinkedList Node class
	private class Node{
		
		int data;
		Node next;
		
		Node(int gdata)
		{
			this.data = gdata;
			this.next = null;
		}
		
	}
	
	// The LinkedList fields
	Node head;
	
	// Constructor
	LinkedList(int gdata)
	{
		this.head = new Node(gdata);
	}
	
	public void Insertend(int gdata)
	{
		Node current = this.head;

		while(current.next!= null)
		{
			current = current.next;
		}
		
		Node newnode = new Node(gdata);
		current.next = newnode;
		
	}
	
	public void Listprint()
	{
		Node current = this.head;

		while(current!= null)
		{
			System.out.print(current.data + " ");
			current = current.next;
		}
		
		System.out.println();
		
	}
	
	public void Removemin() {
	// Complete this method to remove the minimum value in a linkedlist
	  
	  //Current min element, place holder element, previous element in array,
	  Node min = head;
	  Node temp = head;
	  Node prev =null;

	   while (temp != null){
	     // if the place holder element is not null then loop, since it is equal to the first element
	      if(temp.next !=null){
	        // if the next temp value is less than current min value replace current min value with the value of the next temp temp
	        if(temp.next.data < min.data){
	        min = temp.next;
	        //set temp to previous element
	        prev =temp;
	        }
	      }
	      //set temp to then next temp because you are moving though the array
	      temp=temp.next;
	   }
	   //if the minimum node is not the head move to the next value inorder to get to min value
	   if (min != head){
	     prev.next = min.next;
	   }else{
	     //if it is the head it shifts the elements over overwriting the current head with next head making the head now removed
	     head = head.next;
	   }
	}
	
	public static void main(String[] args) {
		
		LinkedList exlist = new LinkedList(0);
		
		exlist.Insertend(1);
		exlist.Insertend(5);
		exlist.Insertend(2);
		exlist.Insertend(7);
		exlist.Insertend(10);
		exlist.Insertend(3);
		
		exlist.Listprint();
		//output: 0 1 5 2 7 10 3
		
		exlist.Removemin();
		
		exlist.Listprint();
		//output should be: 0 1 5 2 7 3
		
		
	}
	
	
	

}
