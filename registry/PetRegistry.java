package registry;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetRegistry {
    private final Map<String, Animal> animalsByName = new HashMap<>();
    private final List<Animal> animalsByBirthdate = new ArrayList<>();

    public void addAnimal(String name, String type, LocalDate birthdate) {
        Animal animal;
        switch (type.toLowerCase()) {
            case "dog":
                animal = new Dog(name, birthdate);
                break;
            case "cat":
                animal = new Cat(name, birthdate);
                break;
            case "hamster":
                animal = new Hamster(name, birthdate);
                break;
            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
        animalsByName.put(name, animal);
        animalsByBirthdate.add(animal);
        Collections.sort((animalsByBirthdate), (a1, a2) -> (a1.getBirthdate().compareTo(a2.getBirthdate())));
        System.out.println("Животное " + name + " успешно добавлено.");
    }

    public void listAnimals() {
        if (animalsByName.isEmpty()) {
            System.out.println("Реестр пуст.");
        } else {
            for (Animal animal : animalsByBirthdate) {
                System.out.println(animal);
            }
        }
    }

    public void teachCommand(String animalName, String command) {
        Animal animal = animalsByName.get(animalName);
        if (animal == null) {
            System.out.println("Животное с именем " + animalName + " не найдено.");
        } else {
            animal.learnCommand(command);
            System.out.println("Команда " + command + " успешно выучена животным " + animalName + ".");
        }
    }

    public void listCommands(String animalName) {
        Animal animal = animalsByName.get(animalName);
        if (animal == null) {
            System.out.println("Животное с именем " + animalName + " не найдено.");
        } else {
            System.out.println("Команды, известные животному " + animalName + ": " + (animal.getCommands()));
        }
    }

    public void countAnimals() {
        System.out.println("Количество животных в реестре: " + (animalsByName.size()));
    }
}
