import java.util.StringJoiner;

public class CityMerger {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi");
        s1.add("Mumbai");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Chennai");
        s2.add("Kolkata");

        System.out.println("s1 merged to s2: " + s1.merge(s2));
        System.out.println("s2 merged to s1: " + s2.merge(s1));
    }
}