package Java.Zoo;

import java.util.Scanner;

public class MenuZoo {
    Zoo myZoo = new Zoo();

    public void menuZoo() {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что будем делать?");
        System.out.println("1-Добавить новое животное");
        System.out.println("2-Убрать животное");
        System.out.println("3-Показать информацию о животном");
        System.out.println("4-Показать команды");
        System.out.println("5-Добавить команды");
        System.out.println("6-Показать количество животных");
        System.out.println("0- Выход");
        int command = scanner.nextInt();
        switch (command) {
            case 1 -> {
                myZoo.addAnimal();
                menuZoo();
            }
            case 2 -> {
                myZoo.countList();
                myZoo.removeAnimal();
                menuZoo();
            }
            case 3 -> {
                myZoo.count();
                myZoo.infoAll();
                menuZoo();
            }
            case 4 -> {
                myZoo.countList();
                myZoo.infoAnimal();
                menuZoo();
            }
            case 5 -> {
                myZoo.countList();
                myZoo.removeCommands();
                menuZoo();
            }
            case 6 -> {
                myZoo.count();
                menuZoo();
            }

        }
    }
}
