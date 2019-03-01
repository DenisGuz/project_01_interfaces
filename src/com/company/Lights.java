package com.company;

public class Lights extends Items {

    private double LightL;

    Lights(double light){
        LightL = light;
    }

    Lights(){
        LightL = 0;
    }

    @Override
    public double getLightL() {
        return LightL;
    }
}
