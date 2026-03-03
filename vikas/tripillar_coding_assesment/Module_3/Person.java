package tripillar_coding_assesment.Module_3;

public class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor is called!");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Person p1 = new Person("Vikas", 20);  // constructor invoked
        p1.display();
    }
}
