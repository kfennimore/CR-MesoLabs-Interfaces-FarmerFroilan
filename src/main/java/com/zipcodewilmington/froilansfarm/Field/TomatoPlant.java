package com.zipcodewilmington.froilansfarm.Field;

import java.util.ArrayList;

public class TomatoPlant extends Crop {

    Tomato tomato = new Tomato();

    public Object yields() {

        return tomato;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public boolean hasBeenFertilized() {
        return false;
    }


}
