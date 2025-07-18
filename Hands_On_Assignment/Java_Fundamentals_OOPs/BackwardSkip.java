package tasksprograms;


public class BackwardSkip {
    public static void main(String[] args) {
        System.out.println("Numbers from 100 to 1, skipping 2 numbers:");

        for (int i = 100; i >= 1; i -= 3) {
            System.out.print(i + " ");
        }
    }
}
