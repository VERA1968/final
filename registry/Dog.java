package registry;

import java.time.LocalDate;

class Dog extends Animal {
    public Dog(String name, LocalDate birthdate) {
        super(name, birthdate);
        learnCommand("сидеть");
        learnCommand("лежать");
    }
}
