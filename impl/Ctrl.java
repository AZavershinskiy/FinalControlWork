package impl;

import java.util.Calendar;
import java.util.List;

public interface Ctrl {
    void start();

    void action(int choice);

    void newAnimals();

    String type();

    String kind(String type);

    String animalName();

    List<String> commands();

    Calendar birthday();

    void save();

    void load();

    void train();
}
