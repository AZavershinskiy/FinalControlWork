package impl;

import java.util.Calendar;
import java.util.List;

import animals.Animal;

public interface CreateImpl {
    Animal newAnimal(String type, String kind, String name, Calendar birthday, List<String> commands);

    List<Animal> loadDB(String db);
}
