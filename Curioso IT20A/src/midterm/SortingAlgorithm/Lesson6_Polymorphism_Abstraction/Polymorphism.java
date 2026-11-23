class Furniture {

    public void use() {
        System.out.println("The furniture is being used.");
    }
}

class Chair extends Furniture {

    @Override
    public void use() {
        System.out.println("The chair is used for sitting.");
    }
}

class Table extends Furniture {

    @Override
    public void use() {
        System.out.println("The table is used for placing things.");
    }
}

class Cabinet extends Furniture {

    @Override
    public void use() {
        System.out.println("The cabinet is used for storing items.");
    }
}

