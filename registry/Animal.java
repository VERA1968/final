package registry;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

abstract class Animal {
    protected String name;
    protected LocalDate birthdate;
    protected Set<String> commands;

    public Animal(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        this.commands = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void learnCommand(String command) {
        commands.add(command);
    }

    public boolean knowsCommand(String command) {
        return commands.contains(command);
    }

    public Set<String> getCommands() {
        return commands;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", Дата рождения: " + birthdate + ", Команды: " + commands;
    }
}

