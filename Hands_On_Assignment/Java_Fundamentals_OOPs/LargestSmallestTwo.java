public class LargestSmallestTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        java.util.Arrays.sort(arr);
        System.out.println("Smallest two: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest two: " + arr[arr.length-2] + ", " + arr[arr.length-1]);
    }
}