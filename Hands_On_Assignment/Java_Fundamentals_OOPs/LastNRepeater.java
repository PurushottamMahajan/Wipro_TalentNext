public class LastNRepeater {
    public static String repeatLastN(String str, int n) {
        if (n >= 0 && n <= str.length()) {
            String lastN = str.substring(str.length() - n);
            return lastN.repeat(n);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(repeatLastN("Wipro", 3)); // propropro
    }
}