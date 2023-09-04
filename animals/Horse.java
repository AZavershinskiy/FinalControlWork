package animals;

import java.util.Calendar;
import java.util.List;

public class Horse extends Pack {
    public Horse(String name) {
        super(name, "Horse");
    }

    public Horse(String name, Calendar birthday, List<String> commands) {
        super(name, birthday, commands, "Horse");
    }
}
