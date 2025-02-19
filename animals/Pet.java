package animals;

import java.util.ArrayList;
import java.util.List;

public class Pet extends Animal {
    private List<Dog> dogs;
    private List<Cat> cats;


public Pet() {
    super("Pet");
    dogs = new ArrayList<>();
    cats = new ArrayList<>();
}

public void addDog(Dog dog) {
    dogs.add(dog);
}

public void addCat(Cat cat) {
    cats.add(cat);
}
}
