package com.example.admin.myjungle.Animals;

import com.example.admin.myjungle.Animals.Animal;
import com.example.admin.myjungle.Food.Food;
import com.example.admin.myjungle.Jungle;

/**
 * Created by Admin on 10/18/2017.
 */

public class Tiger extends Animal {
    public static int count = 0;

    public Tiger(int energy) {
        super("Tiger", energy);
    }

    @Override
    public void sleep() {
        energy += 15;
        System.out.println("Tiger +"+15+" for sleeping");
    }

    @Override
    public void eat(Food food) {
        if(food.getFoodName().equals("Grain")){
            System.out.println("Tiger Can't Eat Grain");
        }else{
            if(Jungle.foodEaten(food)){
                energy += 5;
                System.out.println("Tiger +"+5+" for eating food");
            }
        }
    }

    @Override
    public void makeSound() {
        energy -= 3;
        System.out.println("Tiger -"+3+" for making noise");
    }

    @Override
    public void getAnimalCount() {
        System.out.println("Monkey count is: " + count);
    }
}
