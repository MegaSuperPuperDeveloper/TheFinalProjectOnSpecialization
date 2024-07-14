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


    /**
     * Функция выводит список команд, котрое выполняет выбранное животное
     */
    public void printCommands() {
        System.out.println("Список команд, которое выполняет животное: ");
        for (String action : this.commands.keySet()) {
            System.out.println(action + ", " + "животное " + this.commands.get(action));
        }
    }

    /**
     * Функция выполнения команд, которое должно выполнить животное
     * @param animal животное которое выполняет команду
     */
    public void doCommand(Animal animal) {
        System.out.println("Введите название команды: ");
        command = scanner.nextLine();
        System.out.println(animal.getName() + " " + this.commands.get(command));
    }

    /**
     * Функция добавления новой команды для животного
     */
    public void newCommand() {
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