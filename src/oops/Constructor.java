package oops;

public class Constructor {
    // Constructors and class have same names, no return types, for any object constructor can be called only once
    // Constructors are of 3 types -
    // 1. Parameterised
    // 2. Copy constructor - Copying 1 object to another
    // 3.

    // ! Also by default creates constructor when object instantiated
    // ! Java has auto object destroyer so need for writing destructor
    String name;
    String type;

    Constructor(Constructor c2) {
        this.name = c2.name;
        this.type = c2.type;
    }

    Constructor() {

    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.type);
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        c.name = "Abhishek";
        c.type = "Male";
        Constructor c2 = new Constructor(c);
        c2.printInfo();
    }
}

