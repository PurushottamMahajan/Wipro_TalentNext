interface Test {
    int myFunction(int a, int b, int c);
}

public class LambdaExample {
    public static void main(String[] args) {
        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;

        System.out.println("Sum: " + t1.myFunction(1,2,3));
        System.out.println("Product: " + t2.myFunction(1,2,3));
    }
}