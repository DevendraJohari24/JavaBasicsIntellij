package com.example.classes;

public class House {
    private int noofWindows;
    private int noofDoors;
    private String typeofRoof;
    private String typeofWall;

    public  House() //Constructur type 1
    {
        noofDoors = 0;
        noofWindows= 0;
        typeofRoof = null;
        typeofWall = null;

    }

    public House( int noofWindows , int noofDoors , String typeofRoof,String typeofWall) //Constructor 2 Overloaded Constructor
    {
        this.noofDoors = noofDoors;
        this.noofWindows = noofWindows;
        this.typeofRoof = typeofRoof;
        this.typeofWall = typeofWall;

    }

    public  int getNoofWindows()
    {
        return noofWindows;
    }
    public  int getNoofDoors()
    {
        return noofDoors;
    }
    public  String getTypeofRoof()
    {
        return typeofRoof;
    }
    public  String getTypeofWall()
    {
        return typeofWall;
    }
    public void setNoofWindows(int noofWindows)
    {
        this.noofWindows = noofWindows;
    }

    public void setNoofDoors(int noofDoors) {
        this.noofDoors = noofDoors;
    }

    public void setTypeofRoof(String typeofRoof) {
        this.typeofRoof = typeofRoof;
    }

    public void setTypeofWall(String typeofWall) {
        this.typeofWall = typeofWall;
    }
}
