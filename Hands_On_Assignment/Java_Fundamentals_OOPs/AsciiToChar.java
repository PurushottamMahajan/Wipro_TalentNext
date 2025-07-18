public class AsciiToChar {
    public static void main(String[] args) {
        int[] ascii = {65, 66, 67};
        for (int num : ascii) {
            System.out.print((char) num + " ");
        }
        System.out.println();
    }
}