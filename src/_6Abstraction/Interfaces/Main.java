package _6Abstraction.Interfaces;

public class Main {
    public static void main(String[] args) {
        MyInterface myInterface = new Example();
        myInterface.eat();
        myInterface.calculate(1, 2);

        MyInterface.ex(1, 3);
    }
}
