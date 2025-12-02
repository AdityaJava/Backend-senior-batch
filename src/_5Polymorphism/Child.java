package _5Polymorphism;

public class Child extends Parent {

    @Override
    public int multiply(int a, int b) {
        return a * b + 1;
    }

    /**
     * This is known as method overloading
     * /
     *
     * @param a
     * @param b
     * @return
     */
    public int calculate(int a, int b) {
        return a - b;
    }

    public long calculate(long a, long b) {
        return a + b;
    }

}
