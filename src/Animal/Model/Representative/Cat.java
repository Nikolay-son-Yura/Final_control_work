package Animal.Model.Representative;

import Animal.Interface.ICommands;
import Animal.Model.Class.Pet;

import java.util.List;

public class Cat extends Pet implements ICommands {


    public Cat(String nickName, String dateOfBirth) {
        super(nickName, dateOfBirth);
    }

    @Override
    public List<String> getCommands() {
        return List.of();
    }

    @Override
    public void addCommand() {

    }
}
