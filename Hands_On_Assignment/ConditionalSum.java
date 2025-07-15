public class ConditionalSum {
    public static void main(String[] args) {
        int[] arr = {10, 3, 6, 1, 2, 7, 9};
        int sum = 0;
        boolean afterSix = false;
        for (int num : arr) {
            if (num == 6) afterSix = true;
            else if (num == 7) afterSix = false;
            else if (afterSix) continue;
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}