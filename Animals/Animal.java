package Animals;

import java.util.*;

public class Animal {
    private String name;
    private final Date birthday;

    private HashMap<String, String> commands = new HashMap<>();
    String command = "";
    private Scanner scanner = new Scanner(System.in);


    public Animal(String name) {
        this.name = name;
        this.birthday = new Date();
    }

    public String getName() {
        return name;
    }

    public void printCommands() { // Вывести команды, которое выполняет животное
        System.out.println("Список команд, которое выполняет животное: ");
        for (String action : this.commands.keySet()) {
            System.out.println(action + ", " + "животное " + this.commands.get(action));
        }
    }

    public void doCommaand(Animal animal) { // Животное выполняет команду
        System.out.println("Введите название команды: ");
        command = scanner.nextLine();
        System.out.println(animal.getName() + " " + this.commands.get(command));
    }

    public void newCommand() { // Добавление новой команды для животного
        String action = "";
        try {
            System.out.println("Введите название команды: ");
            command = scanner.nextLine();
            System.out.println("Что делаЕТ животное при вызове команды: ");
            action = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введите название команды!");
        }
        this.commands.put(command, action);
    }

}