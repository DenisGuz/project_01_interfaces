package com.company;

import java.util.ArrayList;

public class Rooms {

    private String RoomName;
    private double Square;
    private int FurnSquare;
    private int Window;
    private double Light = 0;

    ArrayList<Items> listItems = new ArrayList<Items>();

    Rooms(String name, double square, int window){
        RoomName = name;
        Square = square;
        Window = window;
    }

    public void CalcOptions(){

        Light = Window * 700;
        for (Items p : listItems){
            Light += p.getLightL();
            if (p.getSSquare() > 0)
                FurnSquare += p.getSSquare();
            else
                FurnSquare += p.getSquare();
        }
    }

    public boolean CheckLight(String name){
        boolean res = true;
        try {
            if ((Light < 300) || (Light > 4000)){
                res = false;
                throw new WrongIlluminanceException(name);
            }
        }
        catch (WrongIlluminanceException exc){
            exc.toPrint();
        }
        return res;
    }

    public boolean CheckSquare(String name){
        boolean res = true;
        try {
            if (FurnSquare > Square * 0.7){
                res = false;
                throw new WrongSpaceException(name);
            }
        }
        catch (WrongSpaceException exc){
            exc.toPrint();
        }
        return res;
    }

    public  String getRoomName(){
        return RoomName;
    }

    public double getSquare(){
        return Square;
    }

    public int getWindow(){
        return Window;
    }

    public int getFurnSquare(){
        return FurnSquare;
    }

    public double getLight(){
        return Light;
    }
}
