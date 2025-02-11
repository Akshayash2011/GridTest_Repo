package setups;

import java.util.ArrayList;
import java.util.List;

// 1. Class and Object
class Animal {
    static String species = "General Animal"; // Class variable (shared by all instances)
    protected String name;
    protected int age;


    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance method
    public String speak() {
        return "Some generic sound.";
    }
}

// 2. Inheritance
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // 3. Method Overriding (Polymorphism)
    @Override
    public String speak() {
        return "Woof! Woof!";
    }
}

// 4. Abstract Class & Method
abstract class Bird {
    abstract String fly();
}

class Sparrow extends Bird {
    @Override
    String fly() {
        return "Sparrow flies at a low altitude.";
    }
}

// 5. Static Method & Class Method (Using Static Variables)
class Cat extends Animal {
    private static int catCount = 0;

    public Cat(String name, int age) {
        super(name, age);
        catCount++;
    }

    public static String totalCats() {
        return "Total Cats: " + catCount;
    }

    public static String generalInfo() {
        return "Cats are independent animals.";
    }
}

// 6. Operator Overloading (Using Method Overloading)
class Box {
    private int length, width;

    public Box(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Box add(Box other) {
        return new Box(this.length + other.length, this.width + other.width);
    }

    @Override
    public String toString() {
        return "Box(" + length + "x" + width + ")";
    }
}

// 7. Private & Protected Attributes
class Person {
    public String name;
    protected String protectedAttribute = "Protected Attribute";
    private String privateAttribute = "Private Attribute";

    public Person(String name) {
        this.name = name;
    }

    public String getPrivateAttribute() {
        return privateAttribute;
    }
}

// 8. Shallow Copy vs Deep Copy
class Data implements Cloneable {
    List<Integer> values;

    public Data() {
        this.values = new ArrayList<>();
    }

    // Shallow Copy
    public Data shallowCopy() {
        try {
            return (Data) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    // Deep Copy
    public Data deepCopy() {
        Data newData = new Data();
        newData.values.addAll(this.values);
        return newData;
    }
}

// 9. Singleton Design Pattern
class Singleton {
    private static Singleton instance;

    private Singleton() {}  // Private constructor to restrict instantiation

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class OOPConceptsDemo {
    public static void main(String[] args) {
        // Inheritance & Method Overriding
        Dog dog = new Dog("Bruno", 3, "Labrador");
        System.out.println(dog.name + " says: " + dog.speak());

        // Abstract Class Example
        Sparrow sparrow = new Sparrow();
        System.out.println(sparrow.fly());

        // Static Method & Class Method
        Cat cat1 = new Cat("Kitty", 2);
        Cat cat2 = new Cat("Tom", 3);
        System.out.println(Cat.totalCats());
        System.out.println(Cat.generalInfo());

        // Operator Overloading (Method Overloading)
        Box box1 = new Box(2, 3);
        Box box2 = new Box(4, 5);
        Box box3 = box1.add(box2);
        System.out.println(box3);

        // Private & Protected Attributes
        Person person = new Person("Alice");
        System.out.println("Protected: " + person.protectedAttribute);
        System.out.println("Private: " + person.getPrivateAttribute());

        // Shallow Copy vs Deep Copy
        Data original = new Data();
        original.values.add(1);
        original.values.add(2);
        
        Data shallowCopy = original.shallowCopy();
        Data deepCopy = original.deepCopy();

        shallowCopy.values.add(3); // Modifying shallow copy affects original

        System.out.println("Original Data after shallow copy change: " + original.values);
        System.out.println("Shallow Copy Data: " + shallowCopy.values);
        System.out.println("Deep Copy Data: " + deepCopy.values);

        // Singleton Design Pattern
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Singleton check: " + (singleton1 == singleton2)); // Should print true
    }
}
