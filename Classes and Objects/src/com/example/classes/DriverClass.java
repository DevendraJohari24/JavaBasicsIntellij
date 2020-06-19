package com.example.classes;

public class DriverClass {
    public static void main(String[] args) {
        House house = new House(10,2,"Tiles", "Brick");

        house.setNoofDoors(3);
        house.setTypeofWall("Plaster");

        System.out.println("House :");
        System.out.println("No of Windows : " + house.getNoofWindows());
        System.out.println("No of doors : " + house.getNoofDoors());
        System.out.println("No of roof : " + house.getTypeofRoof());
        System.out.println("No of Walls : " + house.getTypeofWall());



    }
}
