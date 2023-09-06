package mvc;

import java.util.ArrayList;
import java.util.List;

import animals.Animal;
import impl.Reg;

public class Registry implements Reg {
    private List<Animal> animals;

    public Registry() {
        this.animals = new ArrayList<>();
    }

    @Override
    public void newAnimal(Animal animal) throws Exception {
        try (Counter counter = new Counter()) {
            animals.add(animal);
            counter.add();
        }
    }

    @Override
    public String toSave() {
        StringBuilder sb = new StringBuilder();
        for (Animal a : animals) {
            sb.append(a.toSave()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public Animal getAnimal(int index) {
        return animals.get(index);
    }

    @Override
    public void clearCount() throws Exception {
        try (Counter counter = new Counter()) {
            counter.clear();
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Animal a : animals) {
            sb.append(a.toString()).append("\n");
        }
        return sb.toString();
    }
}
