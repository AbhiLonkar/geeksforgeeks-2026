package oops;

public class Numbers {
    private int a;
    private int b;

    public void sum() {
        System.out.println(a + b);
    }

    public void difference() {
        System.out.println(a - b);
    }

    public static void main(String[] args) {
        Numbers instance = new Numbers();
        instance.a = 10;
        instance.b = 20;
        instance.sum();
        instance.difference();
    }
}

class EmployeeDetails {
    String eName;
    Integer salary;

    public void set(String n, Integer s) {
        eName = n;
        salary = s;
    }

    public void get() {
        System.out.println("The name is: " + eName + " the salary is: " + salary);
    }

    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails();
        String n = "Abhishek Lonkar";
        Integer s = 50000;
        emp.set(n, s);
        emp.get();
    }
}

class Dog {
    String name;
    String breed;
    int age;

    public Dog(String n, String b, int a) {
        this.name = n;
        this.breed = b;
        this.age = a;
    }

    public void get() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Dog d = new Dog("Genius", "Leopard", 32);
        d.get();
    }

}