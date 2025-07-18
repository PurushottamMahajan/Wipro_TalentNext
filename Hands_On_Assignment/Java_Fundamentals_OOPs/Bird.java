public class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("This bird is eating seeds.");
    }

    @Override
    public void sleep() {
        System.out.println("This bird is sleeping on a branch.");
    }

    public void fly() {
        System.out.println("This bird is flying.");
    }
}