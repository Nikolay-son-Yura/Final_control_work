package Zoo;
import java.util.ArrayList;
import java.util.Scanner;
import Animal.Model.Class.Animal;

public class Zoo {
    ArrayList<Animal> zooAnimal = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addAnimal(){
        System.out.println("Выберите какое животное заведем в зоопарке?:");
        System.out.println("1- Хомячок,2- Собака,3-Кошка,4- Лощадь,5-Верблюд,6-Осел");
        int n = scanner.nextInt();
        System.out.println("Введите кличку: ");
        String nickname = scanner.next();
        System.out.println("Введите дата рождение: ");
        String birthdate = scanner.next();


    }

}
