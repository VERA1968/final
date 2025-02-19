package packanimals;

import java.util.ArrayList;
import java.util.List;

import animals.Animal;

public class PackAnimals extends Animal {
    private List<Bella> bella;
    private List<Smudge> smudge;
    private List<Peanut> peanut;


public PackAnimals() {
    super("PackAnimals");
    bella = new ArrayList<>();
    smudge = new ArrayList<>();
    peanut = new ArrayList<>();
}

public void addBella(Bella bella) {
    this.bella.add(bella);
}

public void addSmudge(Smudge smudge) {
    this.smudge.add(smudge);
}

public void addPeanut(Peanut peanut) {
    this.peanut.add(peanut);
}
}