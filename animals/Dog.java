package animals;

public class Dog extends Animal {
    private String breed;


public Dog(String breed) {
    super("Dog");
    this.breed = breed;
}

public String getBreed() {
    return breed;
}
}