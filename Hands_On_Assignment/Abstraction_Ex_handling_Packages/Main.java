import test.foundation;

public class Main {
    public static void main(String[] args) {
        foundation obj = new foundation();
        // System.out.println(obj.var1); // private - not accessible
        // System.out.println(obj.var2); // default - not accessible from different package
        // System.out.println(obj.var3); // protected - not accessible directly without inheritance
        System.out.println(obj.var4); // public - accessible
    }
}