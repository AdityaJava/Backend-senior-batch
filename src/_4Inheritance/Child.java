package _4Inheritance;

class Child extends Parent {

    public void drink() {
        System.out.println("Drink");
    }

    @Override
    public void eat() {
        System.out.println("I can eat twice a day");
    }
}
