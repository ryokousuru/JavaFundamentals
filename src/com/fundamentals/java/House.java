package com.fundamentals.java;
/*
 This is our first class that we create ourselves
 */

public class House implements MyFirstInterface{

    private String roofType;  //used the default access modifier b4 adding 'private'
    private int windowSize;
    private String foundation;
    private String doorColor;

    public House() {
        System.out.println("This is the default constructor.");
    }

    public House(String doorColor) {  //overloaded constructor
        this(doorColor, 24, "concrete", "shingle");
        System.out.println("The door color is " + doorColor);
    }
    //new constructor to illustrate the use of the 'this' keyword
    public House(String doorColor, int windowSize, String foundation, String roofType) {
        this.doorColor = doorColor;
        this.windowSize = windowSize;
        this.foundation = foundation;
        this.roofType = roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String getRoofType() {
        return roofType;
    }

    //Our first method (function)
    public void doorOpenClose(){
        //print out a message
        System.out.println("Open my front door.");
    }

    //overloaded doorOpenClose method (the one above)
    public void doorOpenClose(String message) {
        System.out.println(message);
    }

    public void setWindowSize() {
        this.windowSize = windowSize;
    }

    public int getWindowSize() {
        return windowSize;
    }


    @Override
    public void endCall() {
}
}
