package registry;

import java.time.LocalDate;

class Hamster extends Animal {
    public Hamster(String name, LocalDate birthdate) {
        super(name, birthdate);
        learnCommand("бегать в колесе");
    }
}
