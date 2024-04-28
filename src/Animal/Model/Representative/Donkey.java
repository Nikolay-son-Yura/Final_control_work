package Animal.Model.Representative;

import Animal.Model.Class.PackAnimals;

import java.util.List;

public class Donkey extends PackAnimals {

    public Donkey(String nickName, String dateOfBirth) {
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
