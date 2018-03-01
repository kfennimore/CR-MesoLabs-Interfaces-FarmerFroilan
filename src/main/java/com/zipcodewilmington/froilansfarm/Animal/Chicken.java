package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {

    protected Egg egg = new Egg();

    public void eat() {

    }

    public String makeNoise() {
        return null;
    }


    public Object yields() {

        return egg;
    }

    //BECAUSE CHICKEN IS NOT HARVESTED
    public boolean hasBeenHarvested() {
        return false;
    }

    //BECAUSE CHICKEN IS NOT FERTILIZED
    public boolean hasBeenFertilized() {
        return false;
    }
}
