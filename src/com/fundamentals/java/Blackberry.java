package com.fundamentals.java;

/*
* This class serves as a child class to AbstractCellPhone
* */

public class Blackberry extends AbstractCellPhone {

    public Blackberry(int vol, int[] nKeys, int sKey, String screen) {  //constructor
            super(vol, nKeys, sKey, screen);   //super allows sub class to use variable
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving Phone Call");
        }

    @Override
    public void sendCall() {
        System.out.println("Sending Phone Call");
        }

    @Override
    public void endCall() {
        System.out.println("Call has ended");
        }
}
