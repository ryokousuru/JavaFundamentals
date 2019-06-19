package com.fundamentals.java;

/*
 * The contents of this class is for the Lesson 6 slide deck.
 * Strings & More
 * */
public class Lesson6 {

    String myString = "LaMars"; //sets LaMars as variable for functions below to act upon

    //method shows string method for charAt
    public void exampleCharAt() {     //establishes method exampleCharAt
        char myChar = myString.charAt(4);  /*accesses the 5th character of the variable
                                            and assigns it to the variable myChar
                                            */
        System.out.println(myChar);       //prints out the variable myChar
    }

    public void exampleConcat(String value) {    //establishes the method exampleConcat
        String happy = myString.concat(value);  //concatenates 'value' to the variable
        System.out.println(happy);              //prints out the variable happy
    }

    public void exampleEquals(String donut) {   //establishes the method exampleEquals
        boolean myBoolean = myString.equals(donut);  //assigns donut as a boolean
        System.out.println(myBoolean);      //prints out myBoolean
    }

    public String exampleLowercase() {      //establishes method exampleLowercase
        return myString.toLowerCase();      //returns the function and sets the variable to lowercase
    }

    public String exampleUppercase() {      //establishes method exampleUppercase
        return myString.toUpperCase();      //returns the function and sets variable to uppercase

    }

    public void exampleLength() {           //establishes function exampleLength
        int length = myString.length();     //declares variable 'length'
        System.out.println(length);         //prints variable length
    }

    public void exampleBuilder(String food, int value) {    //establishes variable exampleBuilder
        StringBuilder build = new StringBuilder();  //establishes new Stringbuilder
        build.append("My favorite food is ");       //appends first part of the sentence
        build.append(food).append(" and I ate ")    //appends second part of sentence
                .append(value).append(" plates of it.");    //appends final part of sentence
        String fav = build.toString();          //establishes fav variable
        System.out.println(fav);            //prints the variable
    }

    public void exampleChar() {         //establishes method exampleChar
        char c1 = 't';                  //assigns t to c1
        char c2 = '\u8fd8';             //assigns unicode character to c2
        System.out.println(c2);         //prints c2
    }

    public void exampleEscape() {   //establishes method exampleEscape
        System.out.println("That\'s a cool toy over there.\tCan I\n play with it?"); //prints the function
    }

}
