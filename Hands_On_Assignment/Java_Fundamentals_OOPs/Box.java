public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box box = new Box(2.0, 3.0, 4.0);
        System.out.println("Volume of the box: " + box.getVolume());
    }
}