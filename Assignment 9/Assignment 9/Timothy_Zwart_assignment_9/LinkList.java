
//Timothy Zwart CMPT_435

public class LinkList {
	
	
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
	LinkList(int gdata)
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
	
	
	
	public Node Listsort(Node start)
	{
	// Complete this method to sort a Linked list
	// Return the first node in the sorted list
	// Feel free to change the method type, add/remove parameters
	// Full credit (30 points) will be awarded for an algorithm that is O(nlog n). 
	// Algorithms that are O(n^2) slower will be scored out of 10 points.
		
	  if (start == null|| start.next== null){//if the first node or the next node are null just return the first node
	    return start;}
	    Node a = start;
	    Node b = start.next;
	    
	    while((b != null)&&(b.next != null)){//while next node is not node, and node after is not null
	    
	    start = start.next;//set the start node to the next element node
	    b = (b.next).next;
	    }
	    b = start.next; //set it to the next next node of start
	    start.next = null;
	    return merge(Listsort(a),Listsort(b));// return the values to be merged
	    
	}
	

	public Node merge(Node a, Node b) //merges
  {//Swap
      Node temp = new Node(0);//create a temp node
      Node head = temp;//set the head to the temp
      Node c = head;//set node c equal to hea
      while ((a != null) && (b != null)) 
      {//while the two nodes are not null if the data in node is less than or equal data in node b then swap a and c
          if (a.data <= b.data) 
          {
              c.next = a;
              c = a;
              a = a.next;
          }
          else //eslse swap b and c
          {
              c.next = b;
              c = b;
              b = b.next;
          }
      }
      c.next = (a == null) ? b : a;
      return head.next;
  }

	
	
	public static void main(String[] args) {
		
		LinkList exlist = new LinkList(0);
		
		exlist.Insertend(1);
		exlist.Insertend(5);
		exlist.Insertend(2);
		exlist.Insertend(7);
		exlist.Insertend(10);
		exlist.Insertend(3);
		
		exlist.Listprint();
		//output: 0 1 5 2 7 10 3
		exlist.Listsort(exlist.head);
		exlist.Listprint();
		//output should be: 0 1 2 3 5 7 10
		
		
	}
	
	
	

}
