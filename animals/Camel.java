package animals;

import java.util.Calendar;
import java.util.List;

public class Camel extends Pack {
    public Camel(String name) {
        super(name, "Camel");
    }

    public Camel(String name, Calendar birthday, List<String> commands) {
        super(name, birthday, commands, "Camel");
    }
}
