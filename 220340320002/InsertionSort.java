//Q1
import java.util.*;

public class InsertionSort
{

static void insert1(int[] arr)
{
	int l=arr.length;
	int elementneed= arr[l-1];
	
	for(int i=l-2;i>=0;i--)
	{
		if(arr[i]>elementneed){
			arr[i+1]=arr[i];
			printArray(arr);
	}else{
		
		arr[i+1]=elementneed;
		printArray(arr);
	break;
	}
	
		if((i==0) && (arr[i]>elementneed))
			{
				arr[i]=elementneed;
				printArray(arr);
			}
	}
}


public static void main(String[] args)
{
	
	Scanner sc= new Scanner(System.in);
	System.out.println(" Insert Size :");
	int s=sc.nextInt();
	int arr[]=new int[s];
	System.out.println(" Array elements :");
	for(int i=0;i<s;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	insert1(arr);
	
}


private static void printArray(int[] arr)
{
	for(int n:arr){
		System.out.print(n+"");
	}
	System.out.println("");
}


	
	
	
	





}