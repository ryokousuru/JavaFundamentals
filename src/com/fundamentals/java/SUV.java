package com.fundamentals.java;

public class SUV extends Truck {

    private String bicycleRack;

    public SUV() {
        System.out.println("Default Sport Utility Vehicle constructor");
        System.out.println("It\'s because they're aren't any parameters");
    }

    public SUV(String bicycleRack) {
        this.bicycleRack = bicycleRack;
    }

    public void loadup() {
        System.out.println("Squeeze and shove everything into the back that you possibly can!!");
    }

    @Override
    public void moving() {
        System.out.println("Going around to all the big box stores in town!!");
    }

    public String getbicycleRack() {
        return bicycleRack;
    }

    public void setbicycleRack (String bicycleRack) {
        this.bicycleRack = bicycleRack;
    }
}