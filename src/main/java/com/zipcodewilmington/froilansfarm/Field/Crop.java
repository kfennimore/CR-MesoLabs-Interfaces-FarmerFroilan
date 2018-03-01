package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;

//cant make abstract because you cant instantiate an abstract class
//will need to instantiate crops
public abstract class Crop implements Produce {

    protected Cornstalk cornstalk = new Cornstalk();
    protected TomatoPlant tomatoPlant = new TomatoPlant();

}
