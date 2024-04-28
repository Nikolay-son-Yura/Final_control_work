package Animal.Model.Class;

import Animal.Interface.ICommands;

public abstract class PackAnimals extends Animal implements ICommands {


    public PackAnimals(String nickName, String dateOfBirth) {
        super(nickName, dateOfBirth);
    }

}
