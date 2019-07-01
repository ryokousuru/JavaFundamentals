package com.fundamentals.java;

/*
* This class demonstrates an Abstract Class
* */

public abstract class AbstractCellPhone implements MyFirstInterface {

    private int vol;
    private int[] nKeys;
    private int sKey;
    private String screen;

    public AbstractCellPhone(int vol, int[] nKeys, int sKey, String screen) {
        this.vol = vol;
        this.nKeys = nKeys;
        this.sKey = sKey;
        this.screen = screen;

    } //the end of the Constructor

    public abstract void receiveCall();  //1st abstract method

    public abstract void sendCall();  //2nd abstract method

    public abstract void endCall();

    public int getVol() {
        return vol;
    }

    public int[] getnKeys() {
        return nKeys;
    }

    public int getsKey() {
        return sKey;
    }

    public String getScreen() {
        return screen;
    }
} // the end of the Class
