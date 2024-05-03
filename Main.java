// Interface yang mendefinisikan hewan yang bisa berlari
interface Runnable {
    void run();
}

// Kelas abstrak yang mendefinisikan hewan
abstract class Animal {
    private String name; // Enkapsulasi
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    public abstract void speak();

    public void describe() {
        System.out.println("I am " + name + ", and I am " + age + " years old.");
    }
}

// Kelas yang mengimplementasikan kelas abstrak dan interface
class Dog extends Animal implements Runnable {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void run() {
        System.out.println("The dog is running.");
    }
}

// Kelas lain yang mengimplementasikan kelas abstrak
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Meow! Meow!");
    }

    public void purr() {
        System.out.println("The cat is purring.");
    }
}

// Program utama
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 5);
        Cat cat = new Cat("Whiskers", 3);

        dog.describe();
        dog.speak();
        dog.run();

        cat.describe();
        cat.speak();
        cat.purr();
    }
}
