package Animal.Zoo;

import java.util.*;

import Animal.Model.Class.Animal;
import Animal.Model.Representative.*;

public class Zoo {
    ArrayList<Animal> zooAnimal = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addAnimal() {
        System.out.println("Выберите какое животное заведем:");
        System.out.println("1- Хомячок,2- Собака,3-Кошка");
        int n = scanner.nextInt();
        System.out.println("Введите кличку: ");
        String nickname = scanner.next();
        System.out.println("Введите дату рождения: ");
        String birthdate = scanner.next();
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Какие команды знает? напишите через запятую,0 если не знает команд");
        String com = scanner.next();
        if (!com.equals("0")) {
            list.add(Arrays.toString(com.split(",")));
        } else {
            list.add("не образован");
        }
        switch (n) {
            case 1 -> {
                String type = "Хомячок";
                zooAnimal.add(new Hamster(type, nickname, birthdate, list));
            }
            case 2 -> {
                String type = "Собака";
                zooAnimal.add(new Dog(type, nickname, birthdate, list));
            }
            case 3 -> {
                String type = "Кошка";
                zooAnimal.add(new Cat(type, nickname, birthdate, list));
            }
        }
    }

    public void infoAll() {
        for (var animal : zooAnimal) {
            System.out.println(animal);
        }
    }

    public void removeAnimal() {
        System.out.println("Убрать животное из списка? напишите номер животного");
        int index = scanner.nextInt();
        zooAnimal.remove(index);
    }

    public void countList() {
        int count = 0;
        for (Animal i : zooAnimal) {
            System.out.println(count + "-" + i.getTypes() + " " + i.getNickName() + ";");
            count++;
        }
    }

    public void count() {
        int count = 0;
        for (Animal i : zooAnimal) {
            count++;
        }
        System.out.println(count + " животных");
    }

    public void infoAnimal() {
        System.out.println("Введите номер из списка животного");
        int index = scanner.nextInt();
        System.out.println(zooAnimal.get(index).getNickName());
        System.out.println(zooAnimal.get(index).getCommands());
    }

    public void removeCommands() {
        System.out.println("Введите номер из списка животного");
        int index = scanner.nextInt();
        System.out.println("Какие команды выучили? напишите через запятую");
        String command = scanner.next();
        ArrayList<String> com = new ArrayList<>();
        com.add(Arrays.toString(command.split(",")));
        for (String i : com) {
            zooAnimal.get(index).setCommands(i);
        }
    }
}






