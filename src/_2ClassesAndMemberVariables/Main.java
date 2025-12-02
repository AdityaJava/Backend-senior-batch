package _2ClassesAndMemberVariables;

class Person {
    int a;
    Integer b = 10;
    String name;
    static Integer objectCount = 0;

    public Person() {
        objectCount++;
    }

    /**
     * AccessModifier Non-access-modifier returnType methodName (args) throws Exception{
     * <p>
     * }
     */
    public void eat() {
        System.out.println("Eating");
    }

    public static void checkingReferenceIssue() {

    }
}

//Members
//Variables
//Methods
public class Main {
    public static void main(String[] args) {
        Person personObject = new Person();
        Person personObject1 = new Person();
        Person personObject2 = new Person();
        System.out.println(personObject.a);
        System.out.println(personObject.b);
        System.out.println(personObject2.objectCount);
        System.out.println("Person.objectCount" + Person.objectCount);
    }
}
