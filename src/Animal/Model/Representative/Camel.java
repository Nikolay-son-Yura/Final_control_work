package Animal.Model.Representative;

import Animal.Interface.ICommands;
import Animal.Model.Class.PackAnimals;

import java.util.List;

public class Camel extends PackAnimals implements ICommands {


    public Camel(String nickName, String dateOfBirth) {
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
