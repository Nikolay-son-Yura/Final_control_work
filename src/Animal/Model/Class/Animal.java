package Animal.Model.Class;

import java.util.ArrayList;

public abstract class Animal {
    private String types;
    private String nickName;
    private String dateOfBirth;


    public Animal(String nickName, String dateOfBirth) {
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

    @Override
    public String toString() {
        return getTypes() + '\'' +
                ", nickName='" + nickName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}

