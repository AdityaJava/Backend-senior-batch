package _6Abstraction.Interfaces;

// We cannot create objects of interfaces
// Variables in interfaces are public and final implicitly
// Methods in interfaces are public and abstract implicitly

public interface MyInterface extends MyInterface2{
    public final int a = 10;
    public abstract void eat();
    String s = "ss";
    default public int calculate(int a, int b) {
        return a + b;
    }

    static public int ex(int a, int b) {
        return a + b;
    }

    private int tr(int a, int b) {
        return a + b;
    }

}
