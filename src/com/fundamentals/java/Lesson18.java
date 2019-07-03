package com.fundamentals.java;

/*
* The class content is for Lesson 18
* Exception Handling
* */

import java.util.IllegalFormatException;

public class Lesson18 {
    String myStringNull;

    public void exampleException() {
        try{
            System.out.println(myStringNull);
            System.out.println("Try Block ran");
        } catch(NullPointerException e) {
            System.out.println("Null Exception thrown " + e.getMessage());
        } finally {
            System.out.println("The finally block is called");
        }
    } //the end of the method

    public void myArrayException() {
        String[] names = {"Dave", "Matt", "Joey"};
        String[] values = {"247777", "4294290", "2902457"};

        try {
            byte b = Byte.parseByte(values[1]);
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least 1 argument");
        } catch(NumberFormatException ed) {
            System.out.println("That is not a number");
        } catch(StackOverflowError e) {
            System.out.println("You have given me more than 1 byte");
        } catch(Exception ea) {
            System.out.println("I do not know what you did!!" + ea.toString());
        } finally {
            System.out.println("Finally the number did not do what it should have!");
        }
    } //the end of the method


} //the end of the class
