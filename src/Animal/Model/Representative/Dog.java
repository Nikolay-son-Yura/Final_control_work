package Animal.Model.Representative;

import Animal.Interface.ICommands;
import Animal.Model.Class.Pet;

import java.util.List;

public class Dog extends Pet implements ICommands {


    public Dog(String nickName, String dateOfBirth) {
        super(nickName, dateOfBirth);
    }

    @Override
    public List<String> commands() {
        return List.of();
    }

    @Override
    public void getCommands() {
        return ;

    }

    @Override
    public void addCommand() {

    }
}
