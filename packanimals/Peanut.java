package packanimals;

import animals.Animal;

public class Peanut extends Animal {
    private double radius;


public Peanut(double radius) {
    super("Peanut");
    this.radius = radius;
}

public double getRadius() {
    return radius;
}
}