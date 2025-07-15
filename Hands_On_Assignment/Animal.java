public class Animal {
    public void eat() {
        System.out.println("This animal is eating.");
    }

    public void sleep() {
        System.out.println("This animal is sleeping.");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}