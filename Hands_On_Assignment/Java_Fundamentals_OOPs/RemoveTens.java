public class RemoveTens {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 2};
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        for (int num : arr) {
            if (num != 10) list.add(num);
        }
        while (list.size() < arr.length) list.add(0);
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}