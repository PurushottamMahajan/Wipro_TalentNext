package tasksprograms;

import java.util.Scanner;

public class MultipyArrays {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
		double[] arr1 =new double[4];
        int[] arr2 = new int [4];
        double[] []result = new double[arr1.length][arr1.length];

        System.out.print("Enter  Double "+arr1.length+" Nos");
        for (int i = 0; i < arr1.length; i++) {
        	arr1[i]=in.nextDouble();
        }
        System.out.print("Enter  Int "+arr1.length+" Nos");
        for (int i = 0; i < arr1.length; i++) {
        	arr2[i]=in.nextInt();
        }
        
        for (int i = 0; i < arr1.length; i++) {
        	for(int j=0;j<arr2.length;j++)
        	{
            result[i] [j]= arr2[i] * arr1[j];
         }
        }

        System.out.println("Result of multiplication:");
        for (double value[] : result) {
        	for(int i=0;i<value.length;i++)
            System.out.print(value[i] + " ");
        	
        	System.out.println();
    	}
        }
        
}
