package com.fundamentals.java;
/*
* This class is used for Lesson 16 content
* Enumerations
* */
public class Lesson16 {

    public enum IceCreamFlavors {
        VANILLA, CHOKORETTO, STRAWBERRY, PEANUT_BUTTER;
    }

    public void showEnum() {
        DaysOfTheWeek d1 = DaysOfTheWeek.TUE;
        System.out.println(d1);

        System.out.println(IceCreamFlavors.PEANUT_BUTTER);

        System.out.println(DaysOfTheWeek.THU);
    } //end class

    public void myFavoriteFlavor(IceCreamFlavors flavors) {
        String message = "My favorite flavor is ";

        switch (flavors) {
            case VANILLA:
                message += "Vanilla";
                break;
            case CHOKORETTO:
                message += "Reese Peanut Butter Cup";
                break;
            case STRAWBERRY:
                message += "Strawberry with a hint of Cherry";
                break;
            case PEANUT_BUTTER:
                message += "Peanut Butter with Chocolate and Coconut";
                break;
            default:
                message += "All flavors";
                break;
        }
        System.out.println(message);
    } //end method

} //end class