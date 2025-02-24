package registry;

import java.time.LocalDate;

class Cat extends Animal {
    public Cat(String name, LocalDate birthdate) {
        super(name, birthdate);
        learnCommand("мурлыкать");
        learnCommand("царапать");
    }
}