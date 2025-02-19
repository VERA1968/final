package packanimals;

import animals.Animal;

public class Smudge extends Animal {
    private int spinCount;


public Smudge(int spinCount) {
    super("Smudge");
    this.spinCount = spinCount;
}

public int getSpinCount() {
    return spinCount;
}
}
