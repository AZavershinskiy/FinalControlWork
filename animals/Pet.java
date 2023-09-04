package animals;

import java.util.Calendar;
import java.util.List;

public abstract class Pet extends Animal {
    protected Pet(String name, String kind) {
        super(name, "Pet", kind);
    }

    protected Pet(String name, Calendar birthday, List<String> commands, String kind) {
        super(name, birthday, commands, "Pet", kind);
    }
}
