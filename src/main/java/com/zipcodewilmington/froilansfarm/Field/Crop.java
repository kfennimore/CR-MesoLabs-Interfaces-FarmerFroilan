package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

//cant make abstract because you cant instantiate an abstract class
//will need to instantiate crops
public class Crop extends CropRow implements Produce {

    public boolean hasBeenHarvested(Crop crop){
        return false;

    }

    public boolean hasBeenFertilized(Crop crop){
        return false;
    }

    public Object yields() {
        return null;
    }
}
