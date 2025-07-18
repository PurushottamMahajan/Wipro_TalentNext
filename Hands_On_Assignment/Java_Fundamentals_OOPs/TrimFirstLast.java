public class TrimFirstLast {
    public static String trimEnds(String str) {
        if (str.charAt(0) == 'x' || str.charAt(str.length() - 1) == 'x') {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(trimEnds("xhix")); // hi
        System.out.println(trimEnds("America")); // merica
    }
}