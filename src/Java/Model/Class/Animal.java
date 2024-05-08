package Java.Model.Class;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal  {
    private String types;
    private String nickName;
    private String dateOfBirth;
    private ArrayList<String> commands;


    public Animal(String types, String nickName, String dateOfBirth, ArrayList<String> commands) {
        this.types = types;
        this.nickName = nickName;
        this.dateOfBirth = dateOfBirth;
        this.commands = commands;
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

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(String newCommand) {
        this.commands.add(newCommand);
    }

    @Override
    public String toString() {
        return getTypes()+
                ", nickName='" + nickName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", commands=" + commands.toString();
    }
}

