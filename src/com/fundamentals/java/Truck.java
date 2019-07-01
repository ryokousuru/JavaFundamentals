package com.fundamentals.java;

public class Truck {

    private String wheels;
    private int windowSize;
    private String boxBed;
    private String bodyColor;

    //constructor w/ all attributes
    public Truck(String wheels, int windowSize, String boxBed, String bodyColor) {
        this.wheels = wheels;
        this.windowSize = windowSize;
        this.boxBed = boxBed;
        this.bodyColor = bodyColor;
    }

    //method
    public void moving() {
        System.out.println("The truck is going forward!!");
    }

    //overloading the above method
    public void moving(String message) {
        System.out.println(message);
    }

    //constructor w/ 2 attributes
    public Truck(String wheels, int windowSize) {
        this(wheels, windowSize, "Monster Size", "29");
    }

    public Truck() {
        System.out.println("Default Constructor");
    }

    public void setwheels() {
        this.wheels = wheels;
    }

    public String getwheels() {
        return wheels;
    }

    public void setwindowSize(int i) {
        this.windowSize = windowSize;
    }
    public int getwindowSize() {
        return windowSize;
    }

    public void setboxBed() {
        this.boxBed = boxBed;
    }

    public String getboxBed() {
        return boxBed;
    }

    public void setbodyColor() {
        this.bodyColor = bodyColor;
    }

    public String getbodyColor() {
        return bodyColor;
    }
}