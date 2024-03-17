// Parent class
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to display animal's sound
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {

    // Constructor calling super class constructor
    public Dog(String name) {
        super(name);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " barks!");
    }
}

// Child class inheriting from Animal
class Cat extends Animal {

    // Constructor calling super class constructor
    public Cat(String name) {
        super(name);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " meows!");
    }
}

public class methover {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Polymorphism: Storing Dog object in Animal reference
        Animal animal1 = dog;
        animal1.makeSound(); // This will call Dog's makeSound method

        // Polymorphism: Storing Cat object in Animal reference
        Animal animal2 = cat;
        animal2.makeSound(); // This will call Cat's makeSound method
    }
}
