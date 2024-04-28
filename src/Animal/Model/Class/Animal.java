package Animal.Model.Class;

import java.util.ArrayList;

public abstract class Animal {
    private String types;
    private String nickName;
    private String dateOfBirth;
    private ArrayList commands = new ArrayList<String>();

    public Animal(String types,String nickName, String dateOfBirth) {
        this.types = types;
        this.nickName = nickName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getTypes() {
        return types;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCommands() {
        return commands.toString();
    }

    public void setCommands(String commands) {
        this.commands.add(commands);
    }

    @Override
    public String toString() {
        return getTypes() +
                ", nickName='" + nickName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", commands=" + commands.toString() +
                '}';
    }
}

