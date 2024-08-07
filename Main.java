import Animals.Animal;
import Animals.PackAnimal.Camel;
import Animals.PackAnimal.Donkey;
import Animals.PackAnimal.Horse;
import Animals.Pet.Cat;
import Animals.Pet.Dog;
import Animals.Pet.Hamster;

import java.awt.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        HashMap<String, Animal> animalStringHashMap = new HashMap<>();
        int answer1 = 0;
        int answer2 = 0;
        String name = "has not";
        boolean turner = true;
        System.out.println("Внимание! У всех животных должны быть разные имена!");
        Scanner scanner = new Scanner(System.in);
        try (Counter counter = new Counter()) {
            while(true) {
                System.out.println();
                System.out.println("Меню:");
                System.out.println("1. Завести новое животное");
                System.out.println("2. Увидеть список команд, которое выполняет животное");
                System.out.println("3. Обучить новой командой");
                System.out.println("4. Сказать команду животному");
                System.out.println("5. Выход");
                System.out.println();
                System.out.print("Введите номер действия: ");
                while(turner) {
                    turner = false;
                    try {
                        scanner = new Scanner(System.in);
                        answer1 = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Ошибка! Введите действие от 1 до 5!");
                        turner = true;
                    }
                }
                turner = true;
                System.out.println();

                switch (answer1) {
                    case 1:
                        System.out.println("Выберите животное");
                        System.out.println("1. Кот");
                        System.out.println("2. Собака");
                        System.out.println("3. Хомяк");
                        System.out.println("4. Лошадь");
                        System.out.println("5. Осел");
                        System.out.println("6. Верблюд");
                        System.out.print("Выберите номер животного: ");
                        while(turner) {
                            turner = false;
                            try {
                                scanner = new Scanner(System.in);
                                answer2 = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Ошибка! Введите номер животного от 1 до 6!");
                                turner = true;
                            }
                        }
                        turner = true;
                        System.out.println();
                        break;
                }

                if (answer1 >= 1 && answer1 <= 5) {
                    System.out.print("Введите имя: ");
                    scanner = new Scanner(System.in);
                    name = scanner.nextLine();
                }
                System.out.println();

                switch (answer1) { // Заводим новое животное и задаем ему имя.
                    case 1:
                        switch (answer2) {
                            case 1:
                                animalStringHashMap.put(name, new Cat(name));
                                break;
                            case 2:
                                animalStringHashMap.put(name, new Dog(name));
                                break;
                            case 3:
                                animalStringHashMap.put(name, new Hamster(name));
                                break;
                            case 4:
                                animalStringHashMap.put(name, new Horse(name));
                                break;
                            case 5:
                                animalStringHashMap.put(name, new Donkey(name));
                                break;
                            case 6:
                                animalStringHashMap.put(name, new Camel(name));
                                break;
                        }
                        if (answer2 >= 1 && answer2 <= 6) {
                            counter.add();
                            System.out.println("Количество животных в питомнике: " + counter.getCount());
                        }
                        break;
                    case 2: // Выводим команды, которое выполняет животное
                        animalStringHashMap.get(name).printCommands();
                        break;
                    case 3: // Обучение новой команде
                        animalStringHashMap.get(name).newCommand();
                        break;
                    case 4: // Сказать команду животному
                        animalStringHashMap.get(name).doCommand(animalStringHashMap.get(name));
                        break;
                }
                System.out.println();
            }
        }
    }
}
