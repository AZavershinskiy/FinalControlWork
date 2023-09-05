package impl;

import animals.Animal;

public interface Reg {
    void newAnimal(Animal animal) throws Exception;

    String toSave();

    Animal getAnimal(int index);

    void clearCount() throws Exception;
}
