package JavaClass;

abstract class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayDetails();

    public String getName() { return name; }
    public int getAge() { return age; }
}

class Amit extends Person {
    private double heightInMeters;

    public Amit(String name, int age, double heightInMeters) {
        super(name, age);
        this.heightInMeters = heightInMeters;
    }

    public void walk() {
        System.out.println(getName() + " is taking a stroll. (Method: walk())");
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Amit's Details (Runtime Type: Amit) ---");
        System.out.println("Name: " + getName() + ", Age: " + getAge());
        System.out.printf("Height: %.2f meters\n", heightInMeters);
        System.out.println("Ability Check: Can walk? Yes (Method 'walk()' implemented).");
    }
}

public class PracticaEST {
    public static void main(String[] args) {
        Person p = new Amit("Amit Yadav", 25, 1.75);

        p.displayDetails();

        if (p instanceof Amit) {

            ((Amit) p).walk();
        }
    }
}