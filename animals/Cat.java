package animals;

import java.util.Calendar;
import java.util.List;

public class Cat extends Pet {
    public Cat(String name) {
        super(name, "Cat");
    }

    public Cat(String name, Calendar birthday, List<String> commands) {
        super(name, birthday, commands, "Cat");
    }
}
