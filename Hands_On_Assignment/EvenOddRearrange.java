public class EvenOddRearrange {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 1};
        java.util.ArrayList<Integer> even = new java.util.ArrayList<>();
        java.util.ArrayList<Integer> odd = new java.util.ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }
        for (int num : even) System.out.print(num + " ");
        for (int num : odd) System.out.print(num + " ");
        System.out.println();
    }
}