package mvc;

import animals.*;
import exceptions.BirthdayException;
import impl.CreateImpl;
import impl.ParseImpl;

import java.util.*;

public class Creator implements CreateImpl, ParseImpl {
    Checker checker;

    public Creator() {
        this.checker = new Checker();
    }

    @Override
    public Animal newAnimal(String type, String kind, String name, Calendar birthday, List<String> commands) {
        switch (kind.toLowerCase()) {
            case "dog":
                return new Dog(name, birthday, commands);
            case "cat":
                return new Cat(name, birthday, commands);
            case "hamster":
                return new Hamster(name, birthday, commands);
            case "horse":
                return new Horse(name, birthday, commands);
            case "camel":
                return new Camel(name, birthday, commands);
            case "donkey":
                return new Donkey(name, birthday, commands);
        }
        return null;
    }

    @Override
    public List<Animal> loadDB(String db) throws BirthdayException {
        List<Animal> animals = new ArrayList<>();
        String[] lines = db.split("\n");
        for (String line : lines) {
            String[] items = line.split(";");
            Animal animal = newAnimal(items[3], items[4], items[0], parsBirthday(items[1]),
                    parsCommand(items[2]));
            animals.add(animal);
        }
        return animals;
    }

    @Override
    public Calendar parsBirthday(String date) {
        if (!checker.checkDateString(date))
            throw new BirthdayException();
        String[] arrDate = date.replace(".", "/").split("/");
        Integer[] arrInt = new Integer[arrDate.length];
        for (int i = 0; i < 3; i++) {
            arrInt[i] = Integer.parseInt(arrDate[i]);
        }
        if (!checker.checkDateArray(arrInt))
            throw new BirthdayException();
        return new GregorianCalendar(arrInt[2], arrInt[1] - 1, arrInt[0]);
    }

    @Override
    public List<String> parsCommand(String commands) {
        String[] coms = commands.split("/");
        return Arrays.stream(coms).toList();
    }
}
