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

