package tasksprograms;

import java.util.Scanner;

public class MaxOfArray {
	
	
	public static void main(String args[])
	{
		int n;
	  Scanner in = new Scanner(System.in);
	  System.out.println("Enter Number of elements");
		n=in.nextInt();
		int arr[]= new int[n];
;	  System.out.println("Enter "+n+" Nos");
	  
	  for(int i =0;i<arr.length;i++)
	  {
		  arr[i]=in.nextInt();
		  
	  }
	  int max=arr[0];
	
		for(int i =0;i<arr.length;i++)
		{
		  if(arr[i]<max)
		  {
			  max=arr[i];
		  }
		}
		System.out.println(max);
		for(int i =0;i<arr.length;i++)
		{
			arr[i]*=max;	
		}
		for(int x:arr)
		System.out.println(x+" ");
		
	}
	

}
