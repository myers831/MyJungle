package com.example.admin.myjungle.Animals;

import com.example.admin.myjungle.Food.Food;

/**
 * Created by Admin on 10/18/2017.
 */

public abstract class Animal {

    int energy;
    String animalName;

    public Animal(String animalName, int energy) {
        this.animalName = animalName;
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public abstract void sleep();
    public abstract void eat(Food food);
    public abstract void makeSound();
    public abstract void getAnimalCount();
}
