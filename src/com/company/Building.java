package com.company;

import java.util.ArrayList;

public class Building implements IRoom  {

    private String BuildingName;

    public static ArrayList<Building> listBuilding = new ArrayList<Building>();

    public static ArrayList<Rooms> listRoom = new ArrayList<Rooms>();

    Building(String name) {
        BuildingName = name;
        listBuilding.add(Building.this);
    }

    Building() {
        BuildingName = "Noname building";
    }

    public String getBuildingName(){
        return BuildingName;
    }

    @Override
    public void addRoom(String name, int square, int window) {
        Rooms room = new Rooms(name, square, window);
        listRoom.add(room);
    }

    @Override
    public ArrayList getRoom(String name) {
        ArrayList<Items> listLightFurniture = new ArrayList<Items>();
        for (Rooms r : listRoom) {
            if (r.getRoomName().equals(name))
                listLightFurniture = r.listItems;
        }
        return listLightFurniture;
    }

    public static void describe(){
        for (Building b : Building.listBuilding){
            System.out.println(b.getBuildingName());
            for (Rooms r : listRoom){
                r.CalcOptions();
                if ((r.CheckLight(r.getRoomName()))
                    &&(r.CheckSquare(r.getRoomName()))){
                    System.out.println(" "+r.getRoomName());
                    System.out.println(" Освещённость = "+r.getLight());
                    System.out.println(" Площадь = "+r.getSquare()+" м^2,"+ " занято "+r.getFurnSquare()+" м^2");
                    System.out.println(" Мебель: ");

                        for (Items i: r.listItems){
                            if (i.getFurnName() == null)
                                System.out.print("");
                            else if (i.getSSquare() > 0)
                                System.out.println("  "+i.getFurnName()
                                        +" Площадь "+i.getSquare()
                                        +"-"+i.getSSquare()
                                        +"м^2");
                            else if (i.getSSquare() <= 0)
                                System.out.println("    "+i.getFurnName()
                                        +" (Плошадь "+i.getSquare()+" м^2)");
                        }

                    }
                }
            }
        }
    }

