public class StarRemover {
    public static String removeStarAndNeighbors(String str) {
        int starIndex = str.indexOf('*');
        if (starIndex >= 0) {
            StringBuilder result = new StringBuilder();
            if (starIndex > 0) result.append(str.substring(0, starIndex));
            if (starIndex < str.length() - 1) result.append(str.substring(starIndex + 2));
            return result.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(removeStarAndNeighbors("ab*cd")); // ad
    }
}