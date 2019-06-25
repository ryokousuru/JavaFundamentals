package com.fundamentals.java;

/*
 * This class demonstrates Control Flow using a song.
 * */
public class BottlesOfBeerSong {

    private void lesson10Private() {
        System.out.println("This is a private method");
    }

    public void timeToSing() {
        int bottlesOfRootBeer = 99;
        String word = "bottles", result = "";

        while (bottlesOfRootBeer > 0) {
            if (bottlesOfRootBeer == 1) {
                word = "bottle";
            } //end if
            System.out.println(bottlesOfRootBeer + " " + word + " of Root Beer in the Fridge");
            System.out.println(bottlesOfRootBeer + " " + word + " of Root Beer");
            System.out.println("Take one out");
            System.out.println("Pass it around");
            bottlesOfRootBeer--;

        } //end while
        if (bottlesOfRootBeer > 0) {
            System.out.println(bottlesOfRootBeer + " " + word + " of Root Beer in the Fridge");

        } else {
            System.out.println("No more bottles of Root Beer in the Fridge");
        }
    }

} //end class
