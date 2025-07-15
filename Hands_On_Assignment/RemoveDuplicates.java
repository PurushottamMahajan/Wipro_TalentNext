public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}