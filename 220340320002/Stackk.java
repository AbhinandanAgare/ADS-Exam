import java.util.*;

class Q3
{
	int [] arr;
	int size;
	int t1;
	int t2;
	
	Q3(int n)
	{
		size=n;
		t1=n/2 + 1;
		t2=n/2;
	}
	void push1(int x)
	{
		if(t1>0)
		{
			t1--;
			arr[t1]=x;
		
		}else{
			System.out.println("Stack is Overflow"+ " by element :"+x+"\n");
		return;
		}
	}
	
	void push2(int x)
	{
		if(t2<size-1)
		{
			t2++;
			arr[t2]=x;
		
		}else{
			System.out.println("Stack is Overflow "+ " By element :-"+x+ "\n");
			return;
		}		
	}
	
	int pop1()
	{
		if(t1<=size/2)
		{
			int x=arr[t1];
			t1++;
			return x;
		
		}else{
			System.out.println("Stack is Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2()
	{
		if(t2>=size/2+1)
		{
			int x=arr[t2];
			t2--;
			return x;
		
		}else{
			System.out.println("Stack is Underflow");
			System.exit(1);
		}
		return 1;
	
	}
}


class Stackk
{
	
	public static void main(String[] args)
	{
		Q3 a = new Q3(5);
		a.push1(5);
		a.push2(10);
		a.push2(15);
		a.push1(11);
		
		System.out.println("Popped element from stack1 is "+a.pop1()+"\n");
		
		a.push2(7);
		a.push2(40);
		
		System.out.println("Popped element from stack1 is "+a.pop2()+"\n");
		
		System.out.println("");	
		
	}
	
}