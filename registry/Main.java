package registry;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetRegistry registry = new PetRegistry();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Добавить новое животное");
            System.out.println("2. Просмотреть список животных");
            System.out.println("3. Обучить животное новой команде");
            System.out.println("4. Показать команды животного");
            System.out.println("5. Посчитать количество животных");
            System.out.println("6. Завершить программу");

            System.out.print("Выберите действие: ");
            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        System.out.print("Введите имя животного: ");
                        String name =scanner.nextLine();
                        System.out.print("Введите вид животного (dog/cat/hamster): ");
                        String type = scanner.nextLine();
                        System.out.print("Введите дату рождения (YYYY-MM-DD): ");
                        LocalDate birthdate = LocalDate.parse(scanner.nextLine());
                        registry.addAnimal(name, type, birthdate);
                        break;
                    case "2":
                        registry.listAnimals();
                        break;
                    case "3":
                        System.out.print("Введите имя животного: ");
                        String animalName = scanner.nextLine();
                        System.out.print("Введите новую команду: ");
                        String command = scanner.nextLine();
                        registry.teachCommand(animalName, command);
                        break;
                    case "4":
                        System.out.print("Введите имя животного: ");
                        animalName = scanner.nextLine();
                        registry.listCommands(animalName);
                        break;
                    case "5":
                        registry.countAnimals();
                        break;
                    case "6":
                        System.out.println("Завершение программы...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
