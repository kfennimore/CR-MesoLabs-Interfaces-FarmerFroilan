package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;

public class Cornstalk extends Crop implements Produce {

    protected EarCorn earCorn = new EarCorn();

    public Object yields() {

        return earCorn;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public boolean hasBeenFertilized() {
        return false;
    }


}
