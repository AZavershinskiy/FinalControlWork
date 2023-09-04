package animals;

import java.util.Calendar;
import java.util.List;

public class Dog extends Pet {
    public Dog(String name) {
        super(name, "Dog");
    }

    public Dog(String name, Calendar birthday, List<String> commands) {
        super(name, birthday, commands, "Dog");
    }
}
