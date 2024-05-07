package Animal.Model.Representative;

import Animal.Model.Class.Animal;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal {


    public Cat(String types, String nickName, String dateOfBirth, ArrayList<String> commands) {
        super(types, nickName, dateOfBirth, commands);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
