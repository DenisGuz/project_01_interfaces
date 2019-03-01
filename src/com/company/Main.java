package com.company;

public class Main {

    public static void main(String[] args) {
        Building building1 = new Building("Здание 1");

        building1.addRoom("Комната 1", 10, 2);
        building1.addRoom("Комната 2", 20, 1);
        building1.addRoom("Комната 3", 30, 3);
        building1.getRoom("Комната 1").add(new Lights(300));
        building1.getRoom("Комната 2").add(new Lights(200));
        building1.getRoom("Комната 3").add(new Lights(100));
        building1.getRoom("Комната 1").add(new Furniture("Диван", 3, 6));
        building1.getRoom("Комната 2").add(new Furniture("Стол", 2));
        building1.getRoom("Комната 2").add(new Furniture("Шкаф", 8));

        Building.describe();
    }
}
