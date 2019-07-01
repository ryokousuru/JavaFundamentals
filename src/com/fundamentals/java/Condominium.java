package com.fundamentals.java;

public class Condominium extends House {

    private String balcony;

    public Condominium() {
        System.out.println("Default constructor for a condominium.");
    }

    public Condominium(String balcony) { //constructor
        this.balcony = balcony;
    }
    //use of 'super' keyword with Constructor - came from Constructor in the 'House' class
    public Condominium(String balcony, String doorColor, int windowSize, String foundation, String roofType) {
        super(doorColor, windowSize, foundation,roofType);
        this.balcony = balcony;
    }

    public void maintenance() {
        System.out.println("Owner pays for repair.");
    }

    public String getbalcony(){
        return balcony;
    }

    public void setbalcony (String balcony) {
        this.balcony = balcony;
    }

    public void doorOpenClose() {  //overriding the parent's method; defining own behavior!
        System.out.println("The door for my condominium is open!");
    }
}
