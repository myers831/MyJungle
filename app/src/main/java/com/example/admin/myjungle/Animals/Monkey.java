package com.example.admin.myjungle.Animals;

import com.example.admin.myjungle.Animals.Animal;
import com.example.admin.myjungle.Food.Food;
import com.example.admin.myjungle.Jungle;

import java.sql.SQLOutput;

/**
 * Created by Admin on 10/18/2017.
 */

public class Monkey extends Animal {
    public static int count = 0;

    public Monkey(int energy) {
        super("Monkey", energy);
    }

    @Override
    public void sleep() {
        energy += 10;
        System.out.println("Monkey +"+10+" for sleeping");
    }

    @Override
    public void eat(Food food) {
        if(Jungle.foodEaten(food)){
            energy += 7;
            System.out.println("Monkey +"+7+" for eating food");
        }
    }

    @Override
    public void makeSound() {
        energy -= 7;
        System.out.println("Monkey -"+7+" for making noise");
    }

    @Override
    public void getAnimalCount() {
        System.out.println("Monkey count is: " + count);
    }

    public void play(){

        if(energy < 8){
            System.out.println("Monkey is too tired");
        }else{
            energy -= 8;
            System.out.println("Oooo Oooo Oooo");
        }
    }
}
