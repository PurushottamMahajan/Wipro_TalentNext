public class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println("Power Int: " + powerInt(2, 3)); // 2^3 = 8
        System.out.println("Power Double: " + powerDouble(2.5, 2)); // 2.5^2 = 6.25
    }
}