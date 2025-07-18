// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package tasksprograms;

public class Main {
    public static void main(String[] args) {
		int spaces=4;
    for(int i = 1 ; i<=5;i++)
    {
        for (int j = 1; j <= 5 - i; j++)
        {
		          System.out.print(" ");
            }
        for (int k = 1; k <= 2 * i - 1; k++)
        {
		       System.out.print("*");
            }
        System.out.println();

    }

    }
}