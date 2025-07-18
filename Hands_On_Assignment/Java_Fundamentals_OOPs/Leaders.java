package tasksprograms;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {23, 22, 100, 1, 0};
        int n = arr.length;
        System.out.print("Leaders: ");
        int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight + " "); 

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }
}
