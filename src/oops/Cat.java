package oops;

public class Cat {
    // These are called as properties
    String name;
    int age;

    // Functions written inside the class are called as methods
    public void printCatData() {
        System.out.println(this.name);
        System.out.println(this.age);
    }


    public static void main(String[] args) {
        // Cat() is called as the constructor
        // When we want to instantiate an object we use this syntax

        // Constructors and class have same names, no return types, for any object constructor can be called only once
        // Constructors are of 3 types -
        // 1. Parameterised
        Cat c = new Cat();
        c.name = "Tom";
        c.age = 5;
        c.printCatData();
    }
}

