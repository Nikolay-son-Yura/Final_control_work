package Animal.Interface;

import java.util.List;

public interface ICommands {
    List<String> setCommands(List<String> commands, String command);
    void getCommands();

}
