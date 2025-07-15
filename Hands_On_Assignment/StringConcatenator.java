public class StringConcatenator {
    public static String concatenate(String s1, String s2) {
        String result = s1 + s2;
        if (result.length() > 2 && result.charAt(result.length() - 2) == result.charAt(result.length() - 1)) {
            result = result.substring(0, result.length() - 1);
        }
        return result.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(concatenate("Sachin", "Tendulkar")); // sachin tendulkar
        System.out.println(concatenate("Mark", "Kate")); // markate
    }
}