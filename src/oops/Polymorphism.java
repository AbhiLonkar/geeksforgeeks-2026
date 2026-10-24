package oops;

public class Polymorphism {
    // Same name for function but they can do different functionality


    // Method Overloading aka Compile time polymorphism - Creating same name functions inside a single class
    // Differentiating criteria for method overloading -
        // Different return type
        // Different parameter
        // Different number of parameter

    // Method Overriding
    // Whenever a child class provides different implementation/behaviour for a parent class method of the same name then its called overriding
}

class College {
    void joinAssembly() {
        System.out.println("Go to assembly");
    }
}

class Student extends College {

    String name;
    int age;

    @Override
    void joinAssembly() {
        System.out.println("Join assembly at 9 pm always");
    }

    // Examples of method overloading
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abhishek";
        s1.age = 24;
        s1.printInfo(s1.age);
        s1.joinAssembly();
    }
}
