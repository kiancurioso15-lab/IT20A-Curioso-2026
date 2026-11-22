
abstract class Animal {

    // Abstract method
    abstract void makeSound();

    // Regular method
    void eat() {
        System.out.println("The animal is eating.");
    }
}


abstract class Animal {

    // Abstract method
    abstract void makeSound();

    // Regular method
    void eat() {
        System.out.println("The animal is eating.");
    }
}

class Sheep extends Animal {

    @Override
    void makeSound() {
        System.out.println("The Sheep says: Mee Mee!");
    }
}

class Buffalo extends Animal {

    @Override
    void makeSound() {
        System.out.println("The Buffalo says:Moo Moo!");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        Animal Sheep = new Sheep();
        Animal Buffalo = new Buffalo();

        System.out.println("Sheep:");
        Sheep.makeSound();
        Sheep.eat();

        System.out.println();

        System.out.println("Buffalo:");
        Buffalo.makeSound();
        Buffalo.eat();
    }
}
