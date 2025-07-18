public class MathOperation {
    public static void main(String[] args) {
        try {
            int[] nums = new int[5];
            for (int i = 0; i < 5; i++) {
                nums[i] = Integer.parseInt(args[i]);
            }
            int sum = 0;
            for (int num : nums) {
                sum += num;
            }
            double avg = sum / 5.0;
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }
}