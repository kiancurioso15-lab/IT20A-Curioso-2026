abstract class Furniture {

    // Abstract method
    abstract void describe();

    // Regular method
    void use() {
        System.out.println("The furniture is being used.");
    }
}

class Chair extends Furniture {

    @Override
    void describe() {
        System.out.println("This is a chair. It is used for sitting.");
    }
}

class Table extends Furniture {

    @Override
    void describe() {
        System.out.println("This is a table. It is used for placing things.");
    }
}

