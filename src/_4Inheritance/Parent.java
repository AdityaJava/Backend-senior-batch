package _4Inheritance;

public class Parent {
    int age;
    int height;
    int weight;
    String name;
    int money = 100;

    // In same Package
    // Or Outside Package in my Child classes only
    protected void eat() {
        System.out.println("I can eat");
    }

    public void test() {
        eat();
    }
}
