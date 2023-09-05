package impl;

import animals.Animal;

import java.util.List;

public interface Menu {
    void showMenu();

    String createMainMenu();

    void showAnimals(String animals);

    void enterName();

    void enterBirthday();

    void enterCommand();

    void enterType();

    void enterKind();

    void commandQuestion();

    void enterCommands();

    void choiceAnimal();

    void showAnimalsList(List<Animal> animals);
}
