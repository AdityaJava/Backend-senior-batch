package _4Inheritance;

// PIE-A
// Inheritance
// Encapsulation

public class Main {
    public static void main(String[] args) {
        Child c = new Child();
        Parent childObj = new Child();
        c.eat();
        childObj.eat();
        Parent parent = new Parent();
        parent.eat();
    }
}
