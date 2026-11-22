
abstract class Animal {

    // Abstract method
    abstract void makeSound();

    // Regular method
    void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog says: Woof Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat says: Meow Meow!");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}

