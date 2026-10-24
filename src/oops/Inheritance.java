package oops;

public class Inheritance {
    // When one class extends another class aka parent class, all the properties and methods of the parent class become available to the child class
    // This is called as inheritance
    // Reusability increases using inheritance

    // Types -
    // 1. Single Level
    // 2. Multi Level
    // 3. Hierarchical
    // 4. Hybrid

    // ! Also the parent class's constructor is executed before the child class; This is called as constructor chaining
}

// Base class/Parent class
class Shape {
    String color;
}

// Sub class/Child class
// Single Level
class Triangle extends Shape {
    public void getArea(int l, int h) {
        System.out.println(0.5 * l * h);
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
    }
}

// Multi Level
class EquilateralTriangle extends Triangle {
    public void getAreaEq(int b, int h) {
        System.out.println(0.5 * b * h);
    }
}

// Hierarchical - Rectangle has same parent as Triangle
class Rectangle extends Shape {
    public void getArea(int l, int b) {
        System.out.println(l * b);
    }
}

