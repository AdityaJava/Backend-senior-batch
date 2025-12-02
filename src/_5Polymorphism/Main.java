package _5Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Runtime Polymorphism
        // JVM knows which method to run by seeing whose object the reference variable is holding
        Parent parent = new Child();
        System.out.println(parent.multiply(1, 4));

        // This is not allowed as the reference is of parent and Parent class doesn't have calculate method in it
        // parent.calculate(1, 2);

        // CompileTime polymorphism
        Child child = new Child();
        child.calculate(1, 2);
        child.calculate(1l, 2l);
    }
}

// Floating number
//double

// Whole Numbers
//int
