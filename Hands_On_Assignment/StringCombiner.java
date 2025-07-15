public class StringCombiner {
    public static String combineStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int lenA = a.length();
        int lenB = b.length();
        int maxLen = Math.max(lenA, lenB);

        for (int i = 0; i < maxLen; i++) {
            if (i < lenA) result.append(a.charAt(i));
            if (i < lenB) result.append(b.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(combineStrings("Hello", "World")); // HWeolrllod
    }
}