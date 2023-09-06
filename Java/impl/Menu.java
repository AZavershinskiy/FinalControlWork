package impl;

import java.util.List;

import animals.Animal;

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
