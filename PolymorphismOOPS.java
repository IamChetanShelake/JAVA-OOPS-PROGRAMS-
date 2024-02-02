// Base class Animal
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Derived class Dog extending Animal
class Dog extends Animal {
    // Overriding the makeSound method for Dog
    @Override
    public void makeSound() {
        System.out.println("Bark! Bark!");
    }

    // Additional method specific to Dog
    public void wagTail() {
        System.out.println("Wagging tail");
    }
}

// Derived class Cat extending Animal
class Cat extends Animal {
    // Overriding the makeSound method for Cat
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    // Additional method specific to Cat
    public void purr() {
        System.out.println("Purring");
    }
}

public class PolymorphismExample {
    // Compile-time polymorphism (method overloading)
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Compile-time polymorphism
        System.out.println("Sum of integers: " + add(5, 10));
        System.out.println("Sum of doubles: " + add(3.5, 2.7));

        // Runtime polymorphism
        Animal dog = new Dog();  // Upcasting
        Animal cat = new Cat();  // Upcasting

        // Calls to overridden method makeSound
        dog.makeSound();  // Calls Dog's makeSound
        cat.makeSound();  // Calls Cat's makeSound

        // Downcasting to access specific methods
        if (dog instanceof Dog) {
            ((Dog) dog).wagTail();
        }

        if (cat instanceof Cat) {
            ((Cat) cat).purr();
        }
    }
}
