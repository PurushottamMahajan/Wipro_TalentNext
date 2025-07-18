import java.util.Scanner;



public class AvgCompare
{
	 public static void main(String args[])
	 {
	 	int [] arr= new int[10];
	 	int sum=0;
	 	Scanner in = new Scanner(System.in);
	 	for(int i=0;i<arr.length;i++)
	 	{
	 		System.out.println("Enter No: ");
	 		arr[i]=in.nextInt();
	 		sum+=arr[i];
	 	}
	 	int avg=sum/arr.length;
	 	int count=0;
	 	for(int i=0;i<arr.length;i++)
	 	{
			if(arr[i]>avg)
			count++;

	 	}
	 System.out.println(count);
	 }
}

