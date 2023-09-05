package animals;

import java.util.Calendar;
import java.util.List;

public abstract class Pack extends Animal {
    protected Pack(String name, String kind) {
        super(name, "Pack", kind);
    }

    protected Pack(String name, Calendar birthday, List<String> commands, String kind) {
        super(name, birthday, commands, "Pack", kind);
    }
}
