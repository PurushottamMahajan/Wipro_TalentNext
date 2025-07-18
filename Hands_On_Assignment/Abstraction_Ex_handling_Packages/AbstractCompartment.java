abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "This is First Class";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "This is Ladies Compartment";
    }
}

class General extends Compartment {
    public String notice() {
        return "This is General Compartment";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "This is Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        for (int i = 0; i < 10; i++) {
            int type = 1 + (int)(Math.random() * 4);
            switch(type) {
                case 1: compartments[i] = new Luggage(); break;
                case 2: compartments[i] = new Ladies(); break;
                case 3: compartments[i] = new General(); break;
                case 4: compartments[i] = new FirstClass(); break;
            }
            System.out.println(compartments[i].notice());
        }
    }
}