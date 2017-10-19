package com.example.admin.myjungle;

import com.example.admin.myjungle.Animals.Monkey;
import com.example.admin.myjungle.Animals.Snake;
import com.example.admin.myjungle.Animals.Tiger;
import com.example.admin.myjungle.Food.Bug;
import com.example.admin.myjungle.Food.Fish;
import com.example.admin.myjungle.Food.Grain;
import com.example.admin.myjungle.Food.Meat;

/**
 * Created by Admin on 10/18/2017.
 */

public class RunClass {
    public static void main(String[] args) {
        Jungle.addAnimal(new Monkey(10));
        Jungle.addAnimal(new Monkey(12));
        Jungle.addAnimal(new Tiger(22));
        Jungle.addAnimal(new Snake(9));
        Jungle.addAnimal(new Tiger(21));
        Jungle.addAnimal(new Snake(7));
        Jungle.addAnimal(new Monkey(15));

        Jungle.addFood(new Bug());
        Jungle.addFood(new Bug());
        Jungle.addFood(new Bug());
        Jungle.addFood(new Bug());
        Jungle.addFood(new Bug());
        Jungle.addFood(new Fish());
        Jungle.addFood(new Fish());
        Jungle.addFood(new Fish());
        Jungle.addFood(new Meat());
        Jungle.addFood(new Meat());
        Jungle.addFood(new Meat());
        Jungle.addFood(new Grain());
        Jungle.addFood(new Grain());
        Jungle.addFood(new Grain());

        Jungle.soundOff();
        Jungle.animalList.get(0).eat(new Fish());
        Jungle.animalList.get(1).eat(new Fish());
        Jungle.animalList.get(2).eat(new Grain());
        Jungle.animalList.get(3).eat(new Fish());
        Jungle.animalList.get(4).eat(new Fish());
        Jungle.animalList.get(5).eat(new Fish());
        Jungle.animalList.get(6).eat(new Fish());

        Monkey monkey = new Monkey(10);
        monkey.play();
        monkey.play();
        Jungle.animalsSleep();
    }
}
