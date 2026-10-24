package oops;

public class Interface {
    // ! Interfaces are used to implement multiple inheritance
    // Interface is a a blueprint of a class that contains only abstract methods
    // It has no constructors and contains only implementations of methods ie no method body

    // All methods are public and abstract by default (before Java 8).
    // Variables in interfaces are public static final (constants).
    // A class must implement all abstract methods of an interface.
    // A class can support multiple inheritance with interfaces
    // ex. Animal, Herbivore interfaces can be implemented by Horse class

    // ! Interface isn't an abstract class
}

interface Mammal {
    int eyes = 2;
    void canWalk();
}

interface Herbivore {
    void eatGrass();
}

class Goat implements Mammal, Herbivore {
    public void canWalk() {
        System.out.println("Can walk");
    }
    public void eatGrass() {
        System.out.println("Can eat grass");
    }

    public static void main(String[] args) {
        Goat g = new Goat();
        g.canWalk();
        g.eatGrass();
    }
}