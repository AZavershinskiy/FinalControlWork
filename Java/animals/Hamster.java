package animals;

import java.util.Calendar;
import java.util.List;

public class Hamster extends Pet {
    public Hamster(String name) {
        super(name, "Hamster");
    }

    public Hamster(String name, Calendar birthday, List<String> commands) {
        super(name, birthday, commands, "Hamster");
    }
}
