package com.example.admin.myjungle;

import com.example.admin.myjungle.Animals.Animal;
import com.example.admin.myjungle.Animals.Monkey;
import com.example.admin.myjungle.Animals.Snake;
import com.example.admin.myjungle.Animals.Tiger;
import com.example.admin.myjungle.Food.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 10/18/2017.
 */

public class Jungle {

    static List<Animal> animalList = new ArrayList<>();
    static List<Food> foodList = new ArrayList<>();

    static void soundOff(){
        for (Animal a: animalList) {
            a.makeSound();
        }
    };

    public static boolean foodEaten(Food food){
        for (Food f: foodList) {
            if(food.getFoodName().equals(food.getFoodName())){
                foodList.remove(f);
                return true;
            }
        }
        System.out.println("No Food for Animal to Eat");
        return false;
    }


    public static void animalsSleep(){
        for (Animal a: animalList) {
            a.sleep();
        }
    }

    static void addAnimal(Animal animal){
        if(animal.getAnimalName().equals("Monkey")){
            Monkey.count+=1;
        }
        if(animal.getAnimalName().equals("Tiger")){
            Tiger.count+=1;
        }
        if(animal.getAnimalName().equals("Snake")){
            Snake.count+=1;
        }

        animalList.add(animal);
    }

    static void addFood(Food food){
        foodList.add(food);
    }
}
