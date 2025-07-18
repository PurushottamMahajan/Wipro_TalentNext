public class FloydTriangle {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }

        int rows = Integer.parseInt(args[0]);
        int count = 1;

        for (int i = 1; i <= rows; i++) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }
}