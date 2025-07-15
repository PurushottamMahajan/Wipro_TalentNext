public class AddressPrinter {
    public static void printAddress(String address) {
        System.out.println(address != null ? address : "India");
    }

    public static void main(String[] args) {
        printAddress("USA");
        printAddress(null);
    }
}