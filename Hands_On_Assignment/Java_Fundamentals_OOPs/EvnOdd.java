package tasksprograms;

import java.util.Scanner;

public class EvnOdd {
	
	public static boolean isEvn(int x)
	{

		return (x%2==0)?true:false;
	}

	public static void main(String args[])
	{
		System.out.print("Enter a No(+ve 0 , -Ve):");
		Scanner in= new Scanner(System.in);
		int x=in.nextInt();
		if(isEvn(x)) 
			System.out.println("No is Even ");
		else
			System.out.println("No is Odd ");
	}
}
