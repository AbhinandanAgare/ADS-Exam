import java.util.*;

class Q2
{
		Node Head;
		
		class Node
		{
			{
				int data;
				Node next;
			}
			
			Node(int d)
			{
				data=d;
				next=null;
			}
		}	
	
	
	void ADD(int data)
	{
		Node m1= new Node();
		 
		if(head==null)
		{
				head=m1;
		
		}else{
			Node temp = head;
			
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=m1;
			
			}
	
	}
	
	void display();
	{
		if(head==null)
			System.out.println("List is Empty");
		else{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data +"");
		}
		
		System.out.println("");
		}
		
		
	}
	
	
	
	public static void main(String[] args)
	{
	
			Q2 n = new Q2();
				
			n.ADD(1);
			n.ADD(5);
			n.ADD(1);
			n.ADD(2);
			n.ADD(3);
			n.ADD(4);
			n.ADD(5);			
	
	
	}
	
	
}