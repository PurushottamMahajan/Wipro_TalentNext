public class FirstHalfChecker {
    public static String getFirstHalf(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getFirstHalf("TomCat")); // Tom
        System.out.println(getFirstHalf("Apron")); // null
    }
}