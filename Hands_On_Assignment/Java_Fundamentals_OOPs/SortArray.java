public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        java.util.Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}