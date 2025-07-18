import java.util.Scanner;
public class Swapping
{
public static void main(String args[])
{
  int a;
  int b;
   Scanner in = new Scanner (System.in);
   a=in.nextInt();
   b=in.nextInt();

   a = a + b;
   b = a - b;
   a = a - b;
   System.out.println(a);
   System.out.println(b);

   }
  }