package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Person implements NoiseMaker, Eater {

    public void eat() {

    }

    public String makeNoise() {
        return null;
    }
}
