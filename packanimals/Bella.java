package packanimals;

import animals.Animal;

public class Bella extends Animal {
    private String name;


public Bella(String name) {
    super("Bella");
    this.name = name;
}

public String getName() {
    return name;
}
}

