import java.util.*;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements in the array");
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the index of the array element you want to access");
            int idx = sc.nextInt();
            System.out.println("The array element at index " + idx + " = " + arr[idx]);
            System.out.println("The array element successfully accessed");
        } catch(ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println(e);
        }
    }
}