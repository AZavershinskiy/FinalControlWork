package animals;

import java.util.Calendar;
import java.util.List;

public class Donkey extends Pack {
    public Donkey(String name) {
        super(name, "Donkey");
    }

    public Donkey(String name, Calendar birthday, List<String> commands) {
        super(name, birthday, commands, "Donkey");
    }
}
