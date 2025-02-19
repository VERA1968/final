package animals;

public class Cat extends Animal {
    private boolean purrs;


public Cat(boolean purrs) {
    super("Cat");
    this.purrs = purrs;
}

public boolean isPurrs() {
    return purrs;
}
}