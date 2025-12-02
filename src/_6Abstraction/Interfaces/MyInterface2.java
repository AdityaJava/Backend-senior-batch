package _6Abstraction.Interfaces;

public interface MyInterface2 {

    default public int calculate(int a, int b) {
        return a + b;
    }

}
