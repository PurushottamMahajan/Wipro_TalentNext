public class FirstTwoRepeater {
    public static String repeatFirstTwo(String str) {
        int n = str.length();
        String firstTwo = str.substring(0, Math.min(2, str.length()));
        return firstTwo.repeat(n);
    }

    public static void main(String[] args) {
        System.out.println(repeatFirstTwo("Wipro")); // WiWiWiWiWi
    }
}