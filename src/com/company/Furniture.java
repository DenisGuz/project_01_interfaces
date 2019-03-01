package com.company;

public class Furniture extends Items {

    private String FurnName;
    private int Square;
    private int SSquare;

    Furniture(String name, int square, int ssquare){
        this.FurnName = name;
        this.Square = square;
        this.SSquare = ssquare;
    }

    Furniture(String name, int square){
        this.FurnName = name;
        this.Square = square;
    }

    public String getFurnName(){
        return FurnName;
    }

    public int getSquare(){
        return Square;
    }

    public int getSSquare(){
        return SSquare;
    }

}