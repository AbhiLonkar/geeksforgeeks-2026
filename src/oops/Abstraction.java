package oops;

public class Abstraction {
    // We can limit access to certain data and methods using abstraction

    // 1. Public - Accessible everywhere (inside & outside the package).
    // 2. Default (No modifier) - Accessible only within the same package.
    // 3. Protected - Accessible within the same package & in subclasses (even in other packages).
    // 4. Private - Accessible only within the same class (not in subclasses or other classes).

    // Private variables can be accessed via public getters and setters.

    // ! Runtime Error: Occurs only after running the program (e.g., division by zero).

}

class Bank {
    String bankName;

    void setBankName() {
        this.bankName = "IDBI";
    }
}

class Customer extends Bank {
    public String customerName;
    protected String customerEmail;
    private String customerAccountNum;

    public String getCustomerAccountNum() {
        return customerAccountNum;
    }

    public void setCustomerAccountNum(String newAccountNum) {
        this.customerAccountNum = newAccountNum;
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        c.customerName = "Abhishek";
        System.out.println(c.bankName);
    }

}

class Account extends Customer {
    int bankBalance;

    public static void main(String[] args) {
        Account a = new Account();
        a.setBankName();
        a.customerEmail = "abhilonkar";
        a.setCustomerAccountNum("IDBIUK");
        System.out.println(a.getCustomerAccountNum());

    }
}

// * Abstraction proper example
// Abstraction is implemented using abstract keyword, and its related to hiding implementation and showing only necessary details
// Abstract means its not tangible, its just a concept
// This makes it impossible for the abstract class' object to instantiate
// Also the child classes must implement the abstract methods written in the parent class
abstract class Animal {
    // All animals must be able to walk
    abstract void walk();

}

class Horse extends Animal {
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }

}