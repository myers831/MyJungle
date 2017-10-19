package com.example.admin.myjungle.Animals;

import com.example.admin.myjungle.Animals.Animal;
import com.example.admin.myjungle.Food.Food;
import com.example.admin.myjungle.Jungle;

/**
 * Created by Admin on 10/18/2017.
 */

public class Snake extends Animal {
    public static int count = 0;

    public Snake(int energy) {
        super("Snake", energy);
    }

    @Override
    public void sleep() {
        energy += 10;
        System.out.println("Snake +"+10+" for sleeping");
    }

    @Override
    public void eat(Food food) {
        if(Jungle.foodEaten(food)){
            energy += 5;
            System.out.println("Snake +"+5+" for eating food");
        }
    }

    @Override
    public void makeSound() {
        energy -= 3;
        System.out.println("Snake -"+3+" for making noise");
    }

    @Override
    public void getAnimalCount() {
        System.out.println("Monkey count is: " + count);
    }
}
